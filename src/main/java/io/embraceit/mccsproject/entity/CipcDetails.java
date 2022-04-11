package io.embraceit.mccsproject.entity;

import io.embraceit.mccsproject.entity.enums.EnterpriseStatus;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;
import java.util.Date;

@JmixEntity(name = "mccs_CipcDetails")
@Embeddable
public class CipcDetails {
    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;

    @Column(name = "ENTERPRISE_NAME")
    private String enterpriseName;

    @Column(name = "ENTERPRISE_SHORTENED_NAME")
    private String enterpriseShortenedName;

    @Column(name = "REGISTRATION_DATE")
    private LocalDate registrationDate;

    @Column(name = "BUSINESS_START_DATE")
    @Temporal(TemporalType.DATE)
    private Date businessStartDate;

    @Column(name = "ENTERPRISE_TYPE")
    private String enterpriseType;

    @Column(name = "ENTERPRISE_STATUS")
    private String enterpriseStatus;

    @Column(name = "FINANCIAL_YEAR_END_DATE")
    @Temporal(TemporalType.DATE)
    private Date financialYearEndDate;

    @Column(name = "MAIN_BUSINESS_OBJECTIVES")
    private String mainBusinessObjectives;

    public String getMainBusinessObjectives() {
        return mainBusinessObjectives;
    }

    public void setMainBusinessObjectives(String mainBusinessObjectives) {
        this.mainBusinessObjectives = mainBusinessObjectives;
    }

    public Date getFinancialYearEndDate() {
        return financialYearEndDate;
    }

    public void setFinancialYearEndDate(Date financialYearEndDate) {
        this.financialYearEndDate = financialYearEndDate;
    }

    public EnterpriseStatus getEnterpriseStatus() {
        return enterpriseStatus == null ? null : EnterpriseStatus.fromId(enterpriseStatus);
    }

    public void setEnterpriseStatus(EnterpriseStatus enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus == null ? null : enterpriseStatus.getId();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Date getBusinessStartDate() {
        return businessStartDate;
    }

    public void setBusinessStartDate(Date businessStartDate) {
        this.businessStartDate = businessStartDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEnterpriseShortenedName() {
        return enterpriseShortenedName;
    }

    public void setEnterpriseShortenedName(String enterpriseShortenedName) {
        this.enterpriseShortenedName = enterpriseShortenedName;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}