package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum SchoolInitiativeTypes implements EnumClass<String> {

    TRAINING("Training"),
    SCHOOL_PROGRAM("School Program"),
    POST_MATRIC_INITIATIVE("Post-Matric Initiative"),
    OTHER("Other (Specify in Comments)");

    private String id;

    SchoolInitiativeTypes(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SchoolInitiativeTypes fromId(String id) {
        for (SchoolInitiativeTypes at : SchoolInitiativeTypes.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}