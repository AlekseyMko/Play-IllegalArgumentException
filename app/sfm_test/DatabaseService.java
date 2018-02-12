package sfm_test;

import play.db.Database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.util.List;

import static generated.Tables.ARTICLES;
import static generated.Tables.COMMENTS;
import static generated.tables.Likes.LIKES;

/**
 * @author <a href="mailto:aleksey@dsi.io">Aleksey Mykhailenko</a>
 */
public class DatabaseService {
    private static final Logger LOG = LoggerFactory.getLogger(DatabaseService.class);

    private Database db;

    @Inject
    public DatabaseService(Database db) {
        this.db = db;
    }

    public List<Article> getArticles() {
        QueryRunner query = new QueryRunner(db);
        return query.run(cxt -> {
                    ResultSet result = cxt
                            .select(ARTICLES.ID,
                                    ARTICLES.TEXT,

                                    COMMENTS.ID.as("comments_id"),
                                    COMMENTS.ARTICLE_ID.as("comments_article_id"),
                                    COMMENTS.COMMENT.as("comments_comment"),

                                    LIKES.ID.as("likes_id"),
                                    LIKES.ARTICLE_ID.as("likes_article_id"))
                            .from(ARTICLES)
                            .join(COMMENTS)
                            .on(ARTICLES.ID.eq(COMMENTS.ARTICLE_ID))
                            .join(LIKES)
                            .on(ARTICLES.ID.eq(LIKES.ARTICLE_ID))
                            .fetchResultSet();

                    return Mappers.mapArticles(result);
                }
        );
    }
}