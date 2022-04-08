package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum MCDProjectType implements EnumClass<String> {

    PROJECT_TYPE_1("Type 1"),
    PROJECT_TYPE_2("Type 2");

    private String id;

    MCDProjectType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static MCDProjectType fromId(String id) {
        for (MCDProjectType at : MCDProjectType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}