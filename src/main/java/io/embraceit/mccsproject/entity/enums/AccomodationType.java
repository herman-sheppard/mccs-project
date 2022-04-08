package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum AccomodationType implements EnumClass<String> {

    SINGLE_QUARTERS("Single Quarters"),
    FAMILY_UNITS("Family Units"),
    HOSTEL("Hostel");

    private String id;

    AccomodationType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static AccomodationType fromId(String id) {
        for (AccomodationType at : AccomodationType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}