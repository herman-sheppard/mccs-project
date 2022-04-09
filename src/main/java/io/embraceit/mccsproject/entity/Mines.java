package io.embraceit.mccsproject.entity;

import io.embraceit.mccsproject.entity.enums.Sectors;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Table(name = "MCCS_MINES", indexes = {
        @Index(name = "IDX_MINES", columnList = "PARENT_CORPORATION_ID")
})
@Entity(name = "mccs_Mines")
public class Mines extends BusinessEntity {
    @Column(name = "MINE_NAME")
    private String mineName;

    @Column(name = "MINING_SECTOR")
    private String miningSector;

    @Column(name = "MINE_CODE")
    private String mineCode;

    @JoinColumn(name = "PARENT_CORPORATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Corporation parentCorporation;

    public Corporation getParentCorporation() {
        return parentCorporation;
    }

    public void setParentCorporation(Corporation parentCorporation) {
        this.parentCorporation = parentCorporation;
    }

    public String getMineCode() {
        return mineCode;
    }

    public void setMineCode(String mineCode) {
        this.mineCode = mineCode;
    }

    public Sectors getMiningSector() {
        return miningSector == null ? null : Sectors.fromId(miningSector);
    }

    public void setMiningSector(Sectors miningSector) {
        this.miningSector = miningSector == null ? null : miningSector.getId();
    }

    public String getMineName() {
        return mineName;
    }

    public void setMineName(String mineName) {
        this.mineName = mineName;
    }
}