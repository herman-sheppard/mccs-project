package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum GenderCategories implements EnumClass<String> {

    MALE("Male"),
    FEMALE("Female"),
    TRANSGENDER("Transgender"),
    UNSPECIFIED("Unspecified");

    private String id;

    GenderCategories(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static GenderCategories fromId(String id) {
        for (GenderCategories at : GenderCategories.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}