/*
 * This file is generated by jOOQ.
*/
package generated.tables;


import generated.Indexes;
import generated.Keys;
import generated.Test;
import generated.tables.records.CommentsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Comments extends TableImpl<CommentsRecord> {

    private static final long serialVersionUID = 2068677096;

    /**
     * The reference instance of <code>test.COMMENTS</code>
     */
    public static final Comments COMMENTS = new Comments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentsRecord> getRecordType() {
        return CommentsRecord.class;
    }

    /**
     * The column <code>test.COMMENTS.id</code>.
     */
    public final TableField<CommentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>test.COMMENTS.article_id</code>.
     */
    public final TableField<CommentsRecord, Integer> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.COMMENTS.comment</code>.
     */
    public final TableField<CommentsRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>test.COMMENTS</code> table reference
     */
    public Comments() {
        this(DSL.name("COMMENTS"), null);
    }

    /**
     * Create an aliased <code>test.COMMENTS</code> table reference
     */
    public Comments(String alias) {
        this(DSL.name(alias), COMMENTS);
    }

    /**
     * Create an aliased <code>test.COMMENTS</code> table reference
     */
    public Comments(Name alias) {
        this(alias, COMMENTS);
    }

    private Comments(Name alias, Table<CommentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comments(Name alias, Table<CommentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommentsRecord> getPrimaryKey() {
        return Keys.KEY_COMMENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommentsRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentsRecord>>asList(Keys.KEY_COMMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comments as(String alias) {
        return new Comments(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comments as(Name alias) {
        return new Comments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Comments rename(String name) {
        return new Comments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Comments rename(Name name) {
        return new Comments(name, null);
    }
}