package sfm_test;

/**
 * @author <a href="mailto:aleksey@dsi.io">Aleksey Mykhailenko</a>
 */
public class Comment {

    private Integer id;
    private Integer articleId;
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
