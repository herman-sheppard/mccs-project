package io.embraceit.mccsproject.entity.enums;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Sectors implements EnumClass<String> {

    OTHER_MINERALS("Other Minerals"),
    DIVERSIFIED_MINERALS("Diversified Minerals"),
    MANGANESE("Manganese"),
    COAL("Coal"),
    PLATINUM("Platinum"),
    ZINC_COPPER("Zinc/Copper"),
    CHROME("Chrome"),
    DIAMONDS("Diamonds"),
    GOLD("Gold"),
    IRON_ORE("Iron Ore"),
    GOLD_URANIUM("Gold/Uranium"),
    ALUMINIUM("Aluminium"),
    CORPORATE("Corporate");

    private String id;

    Sectors(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Sectors fromId(String id) {
        for (Sectors at : Sectors.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}