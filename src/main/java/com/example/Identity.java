package com.example;

import io.ebean.Model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class Identity<T extends Serializable> extends Model implements Identifiable<T>, Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * MySQL is all against Composite keys, so we switch to plain Long
     * //FIXME: Legacy
     */
    //    @GenericGenerator(
    //            name = "optimized-sequence",
    //            strategy = "enhanced-sequence",
    //            parameters = {
    //                    @Parameter(name = "prefer_sequence_per_entity", value = "true"),
    //                    @Parameter(name = "sequence_per_entity_suffix", value = "_seq"),
    //                    @Parameter(name = "initial_value",              value = "1"),
    //                    @Parameter(name = "increment_size",             value = "25"),
    //                    @Parameter(name = "optimizer",                  value = "pooled")})
    //    @GeneratedValue(strategy = SEQUENCE, generator="optimized-sequence")

    @Version
    private int optimisticVersion;

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!getClass().isAssignableFrom(other.getClass())) return false;
        @SuppressWarnings("unchecked")
        Identity<T> o = (Identity<T>) other;
        if (!o.canEqual(this)) return false;
        if (null == o.getId() || null == getId()) return false;
        return Objects.equals(getId(), o.getId());
    }

    protected boolean canEqual(Object other) {
        return other.getClass().isAssignableFrom(getClass());
    }

    @Override
    public int hashCode() {
        return 17;
    }

    @Override
    public String toString() {
        return "Entity of type " + getClass() + " with id: " + getId();
    }
}
