package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum HomeOwnershipOptions implements EnumClass<String> {

    SUBSIDISED("Subsidised"),
    NON_SUBSIDISED("Non-Subsidised"),
    OTHER("Other (e.g. Living Out Allowance etc.)");

    private String id;

    HomeOwnershipOptions(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static HomeOwnershipOptions fromId(String id) {
        for (HomeOwnershipOptions at : HomeOwnershipOptions.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}