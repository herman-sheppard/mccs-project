package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Table(name = "MCCS_EMPLOYEE")
@Entity(name = "mccs_Employee")
public class Employee extends Person {
    @Column(name = "EMPLOYEE_NUMBER")
    private String employeeNumber;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "companyContact")
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}