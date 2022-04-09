package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum ReportLevel implements EnumClass<String> {

    INDIVIDUAL("Individual"),
    TEAM("Team"),
    DEPARTMENT("Department"),
    DIVISION("Division"),
    MINE("Mine"),
    CORPORATION("Corporation"),
    SECTOR("Sector"),
    COMBINED("Combined");

    private String id;

    ReportLevel(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ReportLevel fromId(String id) {
        for (ReportLevel at : ReportLevel.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}