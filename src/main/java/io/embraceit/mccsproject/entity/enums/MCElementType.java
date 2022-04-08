package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum MCElementType implements EnumClass<String> {

    HUMAN_RESOURCE("Human Resource"),
    EMPLOYMENT_EQUITY("Employment Equity"),
    HOUSING("Housing"),
    COMMUNITY_DEVELOPMENT("Community Development"),
    PROCUREMENT("Procurement"),
    SUPPLIER_DEVELOPMENT("Supplier Development"),
    OWNERSHIP("Ownership"),
    REPORTING("Reporting (Monitoring and Evaluation)");

    private String id;

    MCElementType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static MCElementType fromId(String id) {
        for (MCElementType at : MCElementType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}