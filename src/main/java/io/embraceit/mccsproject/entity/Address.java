package io.embraceit.mccsproject.entity;

import io.embraceit.mccsproject.entity.enums.CountryNames;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@JmixEntity(name = "mccs_Address")
@Embeddable
public class Address {
    @Column(name = "COUNTRY", nullable = false)
    @NotNull
    private String country;

    public CountryNames getCountry() {
        return country == null ? null : CountryNames.fromId(country);
    }

    public void setCountry(CountryNames country) {
        this.country = country == null ? null : country.getId();
    }
}