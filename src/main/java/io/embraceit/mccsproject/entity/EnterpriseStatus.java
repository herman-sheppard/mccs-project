package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum EnterpriseStatus implements EnumClass<String> {

    IN_BUSINESS("In Business"),
    STAGNANT("Stangant"),
    CLOSED("Closed");

    private String id;

    EnterpriseStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EnterpriseStatus fromId(String id) {
        for (EnterpriseStatus at : EnterpriseStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}