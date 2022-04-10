package io.embraceit.mccsproject.entity;

import io.jmix.core.entity.annotation.EmbeddedParameters;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity(name = "mccs_Person")
@MappedSuperclass
public class Person extends ReportingEntity {
    @InstanceName
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "SURNAME")
    private String surname;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "officeNumber", column = @Column(name = "CONTACT_DETAILS_OFFICE_NUMBER")),
            @AttributeOverride(name = "mobileNumber", column = @Column(name = "CONTACT_DETAILS_MOBILE_NUMBER")),
            @AttributeOverride(name = "homeNumber", column = @Column(name = "CONTACT_DETAILS_HOME_NUMBER")),
            @AttributeOverride(name = "email", column = @Column(name = "CONTACT_DETAILS_EMAIL"))
    })
    private ContactDetails contactDetails;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetName", column = @Column(name = "WORK_ADDRESS_STREET_NAME")),
            @AttributeOverride(name = "suburb", column = @Column(name = "WORK_ADDRESS_SUBURB")),
            @AttributeOverride(name = "city", column = @Column(name = "WORK_ADDRESS_CITY")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "WORK_ADDRESS_POSTAL_CODE")),
            @AttributeOverride(name = "province", column = @Column(name = "WORK_ADDRESS_PROVINCE")),
            @AttributeOverride(name = "country", column = @Column(name = "WORK_ADDRESS_COUNTRY"))
    })
    private Address workAddress;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetName", column = @Column(name = "HOME_ADDRESS_STREET_NAME")),
            @AttributeOverride(name = "suburb", column = @Column(name = "HOME_ADDRESS_SUBURB")),
            @AttributeOverride(name = "city", column = @Column(name = "HOME_ADDRESS_CITY")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "HOME_ADDRESS_POSTAL_CODE")),
            @AttributeOverride(name = "province", column = @Column(name = "HOME_ADDRESS_PROVINCE")),
            @AttributeOverride(name = "country", column = @Column(name = "HOME_ADDRESS_COUNTRY"))
    })
    private Address homeAddress;

    @Column(name = "ACCEPT_MAILING_LISTS")
    private Boolean acceptMailingLists;

    public Boolean getAcceptMailingLists() {
        return acceptMailingLists;
    }

    public void setAcceptMailingLists(Boolean acceptMailingLists) {
        this.acceptMailingLists = acceptMailingLists;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}