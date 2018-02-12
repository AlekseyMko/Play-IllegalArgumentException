/*
 * This file is generated by jOOQ.
*/
package generated.tables;


import generated.Indexes;
import generated.Keys;
import generated.Test;
import generated.tables.records.PlayEvolutionsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class PlayEvolutions extends TableImpl<PlayEvolutionsRecord> {

    private static final long serialVersionUID = -455008097;

    /**
     * The reference instance of <code>test.play_evolutions</code>
     */
    public static final PlayEvolutions PLAY_EVOLUTIONS = new PlayEvolutions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayEvolutionsRecord> getRecordType() {
        return PlayEvolutionsRecord.class;
    }

    /**
     * The column <code>test.play_evolutions.id</code>.
     */
    public final TableField<PlayEvolutionsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.play_evolutions.hash</code>.
     */
    public final TableField<PlayEvolutionsRecord, String> HASH = createField("hash", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>test.play_evolutions.applied_at</code>.
     */
    public final TableField<PlayEvolutionsRecord, LocalDateTime> APPLIED_AT = createField("applied_at", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>test.play_evolutions.apply_script</code>.
     */
    public final TableField<PlayEvolutionsRecord, String> APPLY_SCRIPT = createField("apply_script", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>test.play_evolutions.revert_script</code>.
     */
    public final TableField<PlayEvolutionsRecord, String> REVERT_SCRIPT = createField("revert_script", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>test.play_evolutions.state</code>.
     */
    public final TableField<PlayEvolutionsRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>test.play_evolutions.last_problem</code>.
     */
    public final TableField<PlayEvolutionsRecord, String> LAST_PROBLEM = createField("last_problem", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>test.play_evolutions</code> table reference
     */
    public PlayEvolutions() {
        this(DSL.name("play_evolutions"), null);
    }

    /**
     * Create an aliased <code>test.play_evolutions</code> table reference
     */
    public PlayEvolutions(String alias) {
        this(DSL.name(alias), PLAY_EVOLUTIONS);
    }

    /**
     * Create an aliased <code>test.play_evolutions</code> table reference
     */
    public PlayEvolutions(Name alias) {
        this(alias, PLAY_EVOLUTIONS);
    }

    private PlayEvolutions(Name alias, Table<PlayEvolutionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PlayEvolutions(Name alias, Table<PlayEvolutionsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PLAY_EVOLUTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlayEvolutionsRecord> getPrimaryKey() {
        return Keys.KEY_PLAY_EVOLUTIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlayEvolutionsRecord>> getKeys() {
        return Arrays.<UniqueKey<PlayEvolutionsRecord>>asList(Keys.KEY_PLAY_EVOLUTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlayEvolutions as(String alias) {
        return new PlayEvolutions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlayEvolutions as(Name alias) {
        return new PlayEvolutions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PlayEvolutions rename(String name) {
        return new PlayEvolutions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlayEvolutions rename(Name name) {
        return new PlayEvolutions(name, null);
    }
}