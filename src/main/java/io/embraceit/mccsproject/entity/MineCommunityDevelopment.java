package io.embraceit.mccsproject.entity;

import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@JmixEntity
@Table(name = "MCCS_MINE_COMMUNITY_DEVELOPMENT")
@Entity(name = "mccs_MineCommunityDevelopment")
public class MineCommunityDevelopment extends StandardEntity {
    @Column(name = "ELEMENT_DESCRIPTION", length = 1000)
    private String elementDescription;

    @Column(name = "MEASURE")
    private String measure;

    @Column(name = "COMPLIANCE_TARGET_PERCENTAGE")
    private String complianceTargetPercentage;

    @Column(name = "WEIGHTING_PERCENTAGE")
    private String weightingPercentage;

    @Column(name = "ACTUAL_STATUS")
    private String actualStatus;

    @Column(name = "OUTCOME")
    private String outcome;

    @Column(name = "DOCUMENT_PROOF")
    @Lob
    private FileRef documentProof;

    public FileRef getDocumentProof() {
        return documentProof;
    }

    public void setDocumentProof(FileRef documentProof) {
        this.documentProof = documentProof;
    }

    public YesNoEnum getOutcome() {
        return outcome == null ? null : YesNoEnum.fromId(outcome);
    }

    public void setOutcome(YesNoEnum outcome) {
        this.outcome = outcome == null ? null : outcome.getId();
    }

    public YesNoEnum getActualStatus() {
        return actualStatus == null ? null : YesNoEnum.fromId(actualStatus);
    }

    public void setActualStatus(YesNoEnum actualStatus) {
        this.actualStatus = actualStatus == null ? null : actualStatus.getId();
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