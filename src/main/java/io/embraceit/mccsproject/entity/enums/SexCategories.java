package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum SexCategories implements EnumClass<String> {

    MALE("Male"),
    FEMALE("Female");

    private String id;

    SexCategories(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SexCategories fromId(String id) {
        for (SexCategories at : SexCategories.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}