package sfm_test;


import org.simpleflatmapper.jdbc.JdbcMapper;
import org.simpleflatmapper.jdbc.JdbcMapperFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:aleksey@dsi.io">Aleksey Mykhailenko</a>
 */
class Mappers {
    private static final Logger LOG = LoggerFactory.getLogger(Mappers.class);

    private static JdbcMapper<Article> snapMapper;

    static {
        snapMapper = JdbcMapperFactory.newInstance()
                .useAsm(false)
                .addKeys("id", "comments_id", "likes_id")
                .newMapper(Article.class);
    }

    static List<Article> mapArticles(ResultSet resultSet) {
        try {
            return snapMapper.stream(resultSet).collect(Collectors.toList());
        } catch (SQLException e) {
            LOG.error("Article mapping from resultSet failed", e);
            throw new RuntimeException(e);
        }
    }
}
