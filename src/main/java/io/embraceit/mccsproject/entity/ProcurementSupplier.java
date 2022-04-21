package io.embraceit.mccsproject.entity;

import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@JmixEntity
@Table(name = "MCCS_PROCUREMENT_SUPPLIER")
@Entity(name = "mccs_ProcurementSupplier")
public class ProcurementSupplier extends StandardEntity {
    @Column(name = "ELEMENT_NUMBER")
    private String elementNumber;

    @Column(name = "ELEMENT_DESCRIPTION", length = 2000)
    private String elementDescription;

    @Column(name = "MEASURE", length = 500)
    private String measure;

    @Column(name = "COMPLIANCE_TARGET_PERCENTAGE")
    private Double complianceTargetPercentage;

    @Column(name = "WEIGHTING_PERCENTAGE")
    private Double weightingPercentage;

    @Column(name = "WEIGHTED_PERCENTAGE_CONVERTED")
    private Double weightedPercentageConverted;

    @Column(name = "CALCULATION", length = 1000)
    private String calculation;

    @Column(name = "EXAMPLE_CALCULATION", length = 500)
    private String exampleCalculation;

    @Column(name = "EXAMPLE_WEIGHTED_SCORE")
    private String exampleWeightedScore;

    @Column(name = "ACTUAL_COMPLIANCE_TARGET_PERCENTAGE")
    private Double actualComplianceTargetPercentage;

    @Column(name = "ACTUAL_WEIGHTED_SCORE")
    private Double actualWeightedScore;

    @Column(name = "DOCUMENT_PROOF")
    @Lob
    private FileRef documentProof;

    public void setComplianceTargetPercentage(Double complianceTargetPercentage) {
        this.complianceTargetPercentage = complianceTargetPercentage;
    }

    public Double getComplianceTargetPercentage() {
        return complianceTargetPercentage;
    }

    public void setWeightingPercentage(Double weightingPercentage) {
        this.weightingPercentage = weightingPercentage;
    }

    public Double getWeightingPercentage() {
        return weightingPercentage;
    }

    public void setWeightedPercentageConverted(Double weightedPercentageConverted) {
        this.weightedPercentageConverted = weightedPercentageConverted;
    }

    public Double getWeightedPercentageConverted() {
        return weightedPercentageConverted;
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

    public FileRef getDocumentProof() {
        return documentProof;
    }

    public void setDocumentProof(FileRef documentProof) {
        this.documentProof = documentProof;
    }

    public Double getActualWeightedScore() {
        return actualWeightedScore;
    }

    public void setActualWeightedScore(Double actualWeightedScore) {
        this.actualWeightedScore = actualWeightedScore;
    }

    public Double getActualComplianceTargetPercentage() {
        return actualComplianceTargetPercentage;
    }

    public void setActualComplianceTargetPercentage(Double actualComplianceTargetPercentage) {
        this.actualComplianceTargetPercentage = actualComplianceTargetPercentage;
    }

    public String getExampleWeightedScore() {
        return exampleWeightedScore;
    }

    public void setExampleWeightedScore(String exampleWeightedScore) {
        this.exampleWeightedScore = exampleWeightedScore;
    }

    public String getExampleCalculation() {
        return exampleCalculation;
    }

    public void setExampleCalculation(String exampleCalculation) {
        this.exampleCalculation = exampleCalculation;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public String getElementNumber() {
        return elementNumber;
    }

    public void setElementNumber(String elementNumber) {
        this.elementNumber = elementNumber;
    }
}