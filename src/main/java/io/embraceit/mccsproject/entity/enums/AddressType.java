package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum AddressType implements EnumClass<String> {

    PHYSICAL_ADDRESS("Physical Address"),
    POSTAL_ADDRESS("Postal Address");

    private String id;

    AddressType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static AddressType fromId(String id) {
        for (AddressType at : AddressType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}