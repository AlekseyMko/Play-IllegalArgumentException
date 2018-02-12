package sfm_test;

import play.api.Play;
import play.db.Database;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultConnectionProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author <a href="mailto:aleksey@dsi.io">Aleksey Mykhailenko</a>
 */
@FunctionalInterface
interface Query<T> {
    T run(DSLContext ctx) throws RuntimeException;
}

class QueryRunner {
    private static final Logger LOG = LoggerFactory.getLogger(QueryRunner.class);

    private Database db;

    QueryRunner(Database db) {
        this.db = db;
    }

    <T> T run(Query<T> tx) {
        // Initialise some jOOQ objects
        Connection conn = db.getConnection();
        try {
            final DefaultConnectionProvider c = new DefaultConnectionProvider(conn);
            final Configuration configuration = configuration(c);

            // Run the transaction and pass a jOOQ
            // DSLContext object to it
            return tx.run(DSL.using(configuration));

            // If we get here, then commit the
            // transaction
        } catch (Exception e) {
            LOG.error("Failed to execute statement", e);
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (final SQLException e) {
                    LOG.error("Failed to close connection", e);
                }
            }
        }
    }


    static Configuration configuration(DefaultConnectionProvider connectionProvider) {
        final Configuration configuration = new DefaultConfiguration()
                .set(connectionProvider)
                .set(SQLDialect.MYSQL);

        if (Play.current().isDev()) {
            configuration.settings()
                    .withRenderFormatted(true);
        }
//            configuration.set(new SfmRecordMapperProvider());

        return configuration;
    }
}
