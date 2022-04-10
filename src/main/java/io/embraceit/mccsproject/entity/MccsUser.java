package io.embraceit.mccsproject.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.EmbeddedParameters;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Entity(name = "mccs_MccsUser")
public class MccsUser extends User {
    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetName", column = @Column(name = "ADDRESS_STREET_NAME")),
            @AttributeOverride(name = "suburb", column = @Column(name = "ADDRESS_SUBURB")),
            @AttributeOverride(name = "city", column = @Column(name = "ADDRESS_CITY")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "ADDRESS_POSTAL_CODE")),
            @AttributeOverride(name = "province", column = @Column(name = "ADDRESS_PROVINCE")),
            @AttributeOverride(name = "country", column = @Column(name = "ADDRESS_COUNTRY"))
    })
    private Address address;

    @Column(name = "PROFILE_IMAGE", length = 1024)
    private FileRef profileImage;

    public FileRef getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(FileRef profileImage) {
        this.profileImage = profileImage;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}