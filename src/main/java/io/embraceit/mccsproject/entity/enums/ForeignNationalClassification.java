package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum ForeignNationalClassification implements EnumClass<String> {

    AFRICAN("African"),
    NON_AFRICAN("Non-African");

    private String id;

    ForeignNationalClassification(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ForeignNationalClassification fromId(String id) {
        for (ForeignNationalClassification at : ForeignNationalClassification.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}