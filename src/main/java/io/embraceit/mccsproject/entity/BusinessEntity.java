package io.embraceit.mccsproject.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.EmbeddedParameters;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity(name = "mccs_BusinessEntity")
@MappedSuperclass
public class BusinessEntity extends ReportingEntity {
    @Column(name = "BUSINESS_NAME")
    private String businessName;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetName", column = @Column(name = "BUSINESS_ADDRESS_STREET_NAME")),
            @AttributeOverride(name = "suburb", column = @Column(name = "BUSINESS_ADDRESS_SUBURB")),
            @AttributeOverride(name = "city", column = @Column(name = "BUSINESS_ADDRESS_CITY")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "BUSINESS_ADDRESS_POSTAL_CODE")),
            @AttributeOverride(name = "province", column = @Column(name = "BUSINESS_ADDRESS_PROVINCE")),
            @AttributeOverride(name = "country", column = @Column(name = "BUSINESS_ADDRESS_COUNTRY"))
    })
    private Address businessAddress;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "officeNumber", column = @Column(name = "BUSINESS_CONTACT_DETAILS_OFFICE_NUMBER")),
            @AttributeOverride(name = "mobileNumber", column = @Column(name = "BUSINESS_CONTACT_DETAILS_MOBILE_NUMBER")),
            @AttributeOverride(name = "homeNumber", column = @Column(name = "BUSINESS_CONTACT_DETAILS_HOME_NUMBER")),
            @AttributeOverride(name = "email", column = @Column(name = "BUSINESS_CONTACT_DETAILS_EMAIL"))
    })
    private ContactDetails businessContactDetails;

    @Column(name = "BUSINESS_LOGO", length = 1024)
    private FileRef businessLogo;

    @JoinColumn(name = "BUSINESS_CONTACT_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Client businessContact;

    public Client getBusinessContact() {
        return businessContact;
    }

    public void setBusinessContact(Client businessContact) {
        this.businessContact = businessContact;
    }

    public FileRef getBusinessLogo() {
        return businessLogo;
    }

    public void setBusinessLogo(FileRef businessLogo) {
        this.businessLogo = businessLogo;
    }

    public ContactDetails getBusinessContactDetails() {
        return businessContactDetails;
    }

    public void setBusinessContactDetails(ContactDetails businessContactDetails) {
        this.businessContactDetails = businessContactDetails;
    }

    public Address getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(Address businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}