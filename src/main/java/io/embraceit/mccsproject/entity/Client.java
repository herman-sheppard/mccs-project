package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Table(name = "MCCS_CLIENT", indexes = {
        @Index(name = "IDX_CLIENT_COMPANY_CONTACT_ID", columnList = "COMPANY_CONTACT_ID")
})
@Entity(name = "mccs_Client")
public class Client extends Person {
    @JoinColumn(name = "COMPANY_CONTACT_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Employee companyContact;

    public Employee getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(Employee companyContact) {
        this.companyContact = companyContact;
    }
}