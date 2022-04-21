package io.embraceit.mccsproject.entity;

import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@JmixEntity
@Table(name = "MCCS_HR_DEVELOPMENT")
@Entity(name = "mccs_HRDevelopment")
public class HRDevelopment extends StandardEntity {
    @Column(name = "ELEMENT_NUMBER")
    private String elementNumber;

    @Column(name = "ELEMENT_DESCRIPTION", length = 2000)
    private String elementDescription;

    @Column(name = "MEASURE", length = 1000)
    private String measure;

    @Column(name = "COMPLIANCE_TARGET_PERCENTAGE")
    private String complianceTargetPercentage;

    @Column(name = "WEIGHTING")
    private String weighting;

    @Column(name = "ACTUAL_PERCENTAGE")
    private Double actualPercentage;

    @Column(name = "OUTCOME")
    private String outcome;

    @Column(name = "DOCUMENT_PROOF")
    @Lob
    private FileRef documentProof;

    @Column(name = "OVERALL_OUTCOME")
    private String overallOutcome;

    public String getOverallOutcome() {
        return overallOutcome;
    }

    public void setOverallOutcome(String overallOutcome) {
        this.overallOutcome = overallOutcome;
    }

    public FileRef getDocumentProof() {
        return documentProof;
    }

    public void setDocumentProof(FileRef documentProof) {
        this.documentProof = documentProof;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Double getActualPercentage() {
        return actualPercentage;
    }

    public void setActualPercentage(Double actualPercentage) {
        this.actualPercentage = actualPercentage;
    }

    public String getWeighting() {
        return weighting;
    }

    public void setWeighting(String weighting) {
        this.weighting = weighting;
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

    public String getElementNumber() {
        return elementNumber;
    }

    public void setElementNumber(String elementNumber) {
        this.elementNumber = elementNumber;
    }
}