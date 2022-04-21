package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@JmixEntity
@Table(name = "MCCS_COMPANY_REGISTRATION_AND_INPUTS")
@Entity(name = "mccs_CompanyRegistrationAndInputs")
public class CompanyRegistrationAndInputs extends StandardEntity {
    @Column(name = "REQ_REFERENCE")
    private String reqReference;

    @Column(name = "REQUIREMENT_DETAIL", length = 1000)
    private String requirementDetail;

    public String getRequirementDetail() {
        return requirementDetail;
    }

    public void setRequirementDetail(String requirementDetail) {
        this.requirementDetail = requirementDetail;
    }

    public String getReqReference() {
        return reqReference;
    }

    public void setReqReference(String reqReference) {
        this.reqReference = reqReference;
    }
}