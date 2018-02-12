/*
 * This file is generated by jOOQ.
*/
package generated;


import generated.tables.Articles;
import generated.tables.Comments;
import generated.tables.Likes;
import generated.tables.PlayEvolutions;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ARTICLES_PRIMARY = Indexes0.ARTICLES_PRIMARY;
    public static final Index COMMENTS_PRIMARY = Indexes0.COMMENTS_PRIMARY;
    public static final Index LIKES_PRIMARY = Indexes0.LIKES_PRIMARY;
    public static final Index PLAY_EVOLUTIONS_PRIMARY = Indexes0.PLAY_EVOLUTIONS_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index ARTICLES_PRIMARY = createIndex("PRIMARY", Articles.ARTICLES, new OrderField[] { Articles.ARTICLES.ID }, true);
        public static Index COMMENTS_PRIMARY = createIndex("PRIMARY", Comments.COMMENTS, new OrderField[] { Comments.COMMENTS.ID }, true);
        public static Index LIKES_PRIMARY = createIndex("PRIMARY", Likes.LIKES, new OrderField[] { Likes.LIKES.ID }, true);
        public static Index PLAY_EVOLUTIONS_PRIMARY = createIndex("PRIMARY", PlayEvolutions.PLAY_EVOLUTIONS, new OrderField[] { PlayEvolutions.PLAY_EVOLUTIONS.ID }, true);
    }
}