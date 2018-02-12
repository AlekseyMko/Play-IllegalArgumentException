package sfm_test;


import java.util.List;

/**
 * @author <a href="mailto:aleksey@dsi.io">Aleksey Mykhailenko</a>
 */
public class Article {

    private Integer id;
    private String text;
    private List<Comment> comments;
    private List<Like> likes;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }
}
