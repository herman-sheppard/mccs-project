package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum SponsorshipType implements EnumClass<String> {

    BURSARY("Bursary"),
    SCHOLARSHIP("Scholarship");

    private String id;

    SponsorshipType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SponsorshipType fromId(String id) {
        for (SponsorshipType at : SponsorshipType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}