package io.embraceit.mccsproject.entity;

import io.embraceit.mccsproject.entity.enums.Sectors;
import io.jmix.core.entity.annotation.EmbeddedParameters;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Table(name = "MCCS_CORPORATION")
@Entity(name = "mccs_Corporation")
public class Corporation extends BusinessEntity {
    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "registrationNumber", column = @Column(name = "CIPC_DETAILS_REGISTRATION_NUMBER")),
            @AttributeOverride(name = "enterpriseName", column = @Column(name = "CIPC_DETAILS_ENTERPRISE_NAME")),
            @AttributeOverride(name = "enterpriseShortenedName", column = @Column(name = "CIPC_DETAILS_ENTERPRISE_SHORTENED_NAME")),
            @AttributeOverride(name = "registrationDate", column = @Column(name = "CIPC_DETAILS_REGISTRATION_DATE")),
            @AttributeOverride(name = "businessStartDate", column = @Column(name = "CIPC_DETAILS_BUSINESS_START_DATE")),
            @AttributeOverride(name = "enterpriseType", column = @Column(name = "CIPC_DETAILS_ENTERPRISE_TYPE")),
            @AttributeOverride(name = "enterpriseStatus", column = @Column(name = "CIPC_DETAILS_ENTERPRISE_STATUS")),
            @AttributeOverride(name = "financialYearEndDate", column = @Column(name = "CIPC_DETAILS_FINANCIAL_YEAR_END_DATE")),
            @AttributeOverride(name = "mainBusinessObjectives", column = @Column(name = "CIPC_DETAILS_MAIN_BUSINESS_OBJECTIVES"))
    })
    private CipcDetails cipcDetails;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "officeNumber", column = @Column(name = "HEAD_OFFICE_CONTACT_DETAILS_OFFICE_NUMBER")),
            @AttributeOverride(name = "mobileNumber", column = @Column(name = "HEAD_OFFICE_CONTACT_DETAILS_MOBILE_NUMBER")),
            @AttributeOverride(name = "homeNumber", column = @Column(name = "HEAD_OFFICE_CONTACT_DETAILS_HOME_NUMBER")),
            @AttributeOverride(name = "email", column = @Column(name = "HEAD_OFFICE_CONTACT_DETAILS_EMAIL"))
    })
    private ContactDetails headOfficeContactDetails;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetName", column = @Column(name = "HEAD_OFFICE_ADDRESS_STREET_NAME")),
            @AttributeOverride(name = "suburb", column = @Column(name = "HEAD_OFFICE_ADDRESS_SUBURB")),
            @AttributeOverride(name = "city", column = @Column(name = "HEAD_OFFICE_ADDRESS_CITY")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "HEAD_OFFICE_ADDRESS_POSTAL_CODE")),
            @AttributeOverride(name = "province", column = @Column(name = "HEAD_OFFICE_ADDRESS_PROVINCE")),
            @AttributeOverride(name = "country", column = @Column(name = "HEAD_OFFICE_ADDRESS_COUNTRY"))
    })
    private Address headOfficeAddress;

    @Column(name = "MINING_SECTOR")
    private String miningSector;

    public Sectors getMiningSector() {
        return miningSector == null ? null : Sectors.fromId(miningSector);
    }

    public void setMiningSector(Sectors miningSector) {
        this.miningSector = miningSector == null ? null : miningSector.getId();
    }

    public Address getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(Address headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public ContactDetails getHeadOfficeContactDetails() {
        return headOfficeContactDetails;
    }

    public void setHeadOfficeContactDetails(ContactDetails headOfficeContactDetails) {
        this.headOfficeContactDetails = headOfficeContactDetails;
    }

    public CipcDetails getCipcDetails() {
        return cipcDetails;
    }

    public void setCipcDetails(CipcDetails cipcDetails) {
        this.cipcDetails = cipcDetails;
    }
}