package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@JmixEntity
@Table(name = "MCCS_MINING_CHARTER_SCORECARD")
@Entity(name = "mccs_MiningCharterScorecard")
public class MiningCharterScorecard extends StandardEntity {
    @Column(name = "REFERENCE")
    private String reference;

    @Column(name = "REVIEWED_MCS")
    private String reviewedMCS;

    @Column(name = "WEIGHTING")
    private Double weighting;

    @Column(name = "CALCULATION")
    private Double calculation;

    public Double getCalculation() {
        return calculation;
    }

    public void setCalculation(Double calculation) {
        this.calculation = calculation;
    }

    public Double getWeighting() {
        return weighting;
    }

    public void setWeighting(Double weighting) {
        this.weighting = weighting;
    }

    public String getReviewedMCS() {
        return reviewedMCS;
    }

    public void setReviewedMCS(String reviewedMCS) {
        this.reviewedMCS = reviewedMCS;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}