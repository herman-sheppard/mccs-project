package io.embraceit.mccsproject.entity;

import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@JmixEntity
@Table(name = "MCCS_OWNERSHIP")
@Entity(name = "mccs_Ownership")
public class Ownership extends StandardEntity {
    @Column(name = "ELEMENT_DESCRIPTION", length = 1000)
    private String elementDescription;

    @Column(name = "MEASURE")
    private String measure;

    @Column(name = "COMPLIANCE_TARGET_PERCENTAGE")
    private String complianceTargetPercentage;

    @Column(name = "WEIGHTING_PERCENTAGE")
    private String weightingPercentage;

    @Column(name = "ACTUAL_ENTRY")
    private Double actualEntry;

    @Column(name = "CALCULATION")
    private String calculation;

    @Column(name = "PROOF")
    @Lob
    private FileRef proof;

    public FileRef getProof() {
        return proof;
    }

    public void setProof(FileRef proof) {
        this.proof = proof;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public Double getActualEntry() {
        return actualEntry;
    }

    public void setActualEntry(Double actualEntry) {
        this.actualEntry = actualEntry;
    }

    public String getWeightingPercentage() {
        return weightingPercentage;
    }

    public void setWeightingPercentage(String weightingPercentage) {
        this.weightingPercentage = weightingPercentage;
    }

    public String getComplianceTargetPercentage() {
        return complianceTargetPercentage;
    }

    public void setComplianceTargetPercentage(String complianceTargetPercentage) {
        this.complianceTargetPercentage = complianceTargetPercentage;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getElementDescription() {
        return elementDescription;
    }

    public void setElementDescription(String elementDescription) {
        this.elementDescription = elementDescription;
    }
}