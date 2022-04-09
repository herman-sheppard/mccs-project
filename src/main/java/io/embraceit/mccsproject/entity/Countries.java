package io.embraceit.mccsproject.entity;

import io.jmix.core.entity.annotation.CaseConversion;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@JmixEntity
@Table(name = "MCCS_COUNTRIES")
@Entity(name = "mccs_Countries")
public class Countries extends StandardEntity {
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @CaseConversion
    @Column(name = "ISO3", nullable = false)
    @NotNull
    private String iso3;

    @CaseConversion
    @Column(name = "ISO2", nullable = false)
    @NotNull
    private String iso2;

    @Column(name = "NUMERIC_CODE", nullable = false)
    @NotNull
    private String numericCode;

    @Column(name = "PHONE_CODE", nullable = false)
    @NotNull
    private String phoneCode;

    @Column(name = "CAPITAL", nullable = false)
    @NotNull
    private String capital;

    @CaseConversion
    @Column(name = "CURRENCY", nullable = false)
    @NotNull
    private String currency;

    @Column(name = "CURRENCY_NAME", nullable = false)
    @NotNull
    private String currencyName;

    @Column(name = "CURRENCY_SYMBOL", nullable = false)
    @NotNull
    private String currencySymbol;

    @Column(name = "TLD", nullable = false)
    @NotNull
    private String tld;

    @NotNull
    @Column(name = "NATIVE_NAME", nullable = false)
    private String nativeName;

    @Column(name = "REGION", nullable = false)
    @NotNull
    private String region;

    @Column(name = "SUBREGION", nullable = false)
    @NotNull
    private String subregion;

    @Column(name = "LATITUDE", nullable = false)
    @NotNull
    private String latitude;

    @Column(name = "LONGITUDE", nullable = false)
    @NotNull
    private String longitude;

    @Column(name = "LOCATION", nullable = false)
    @NotNull
    private String location;

    @Column(name = "FLAG", nullable = false)
    @NotNull
    private String flag;

    @Column(name = "EMOJIU", nullable = false)
    @NotNull
    private String emojiu;

    public String getEmojiu() {
        return emojiu;
    }

    public void setEmojiu(String emojiu) {
        this.emojiu = emojiu;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getTld() {
        return tld;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}