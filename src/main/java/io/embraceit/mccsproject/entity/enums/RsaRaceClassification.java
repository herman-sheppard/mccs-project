package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum RsaRaceClassification implements EnumClass<String> {

    AFRICAN("African"),
    COLOURED("Coloured"),
    INDIAN("Indian"),
    WHITE("White"),
    CHINESE("Chinese (Constitutionally Recognised)");

    private String id;

    RsaRaceClassification(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static RsaRaceClassification fromId(String id) {
        for (RsaRaceClassification at : RsaRaceClassification.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}