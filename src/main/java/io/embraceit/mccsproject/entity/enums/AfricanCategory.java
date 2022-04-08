package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum AfricanCategory implements EnumClass<String> {

    HDSA("HDSA"),
    FOREIGN_NATIONAL("Foreign National");

    private String id;

    AfricanCategory(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static AfricanCategory fromId(String id) {
        for (AfricanCategory at : AfricanCategory.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}