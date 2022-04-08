package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum MCDImpacts implements EnumClass<String> {

    EDUCATION("Education"),
    HEALTH("Health"),
    JOB_CREATION("Job Creation"),
    BUSINESS_DEVELOPMENT("Business Development"),
    YOUTH_DEVELOPMENT("Youth Development");

    private String id;

    MCDImpacts(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static MCDImpacts fromId(String id) {
        for (MCDImpacts at : MCDImpacts.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}