package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@JmixEntity(name = "mccs_TocItem")
@Embeddable
public class TocItem {
    @InstanceName
    @Column(name = "TOC_ITEM_NAME", nullable = false)
    @NotNull
    private String tocItemName;

    public String getTocItemName() {
        return tocItemName;
    }

    public void setTocItemName(String tocItemName) {
        this.tocItemName = tocItemName;
    }
}