package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.Date;

@JmixEntity
@Table(name = "MCCS_CONTRACTOR")
@Entity(name = "mccs_Contractor")
public class Contractor extends Person {
    @Column(name = "CONTRACTOR_NUMBER")
    private String contractorNumber;

    @Column(name = "CONTRACT_START_DATE")
    @Temporal(TemporalType.DATE)
    private Date contractStartDate;

    @Column(name = "CONTRACT_END_DATE")
    @Temporal(TemporalType.DATE)
    private Date contractEndDate;

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractorNumber() {
        return contractorNumber;
    }

    public void setContractorNumber(String contractorNumber) {
        this.contractorNumber = contractorNumber;
    }
}