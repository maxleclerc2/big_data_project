package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum IronHands {
    IRON_HAND("iron hand"),
    // HQ
    IRON_FATHER_FEIRROS("iron father feirros");

    private final String name;

    IronHands(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (IronHands value: IronHands.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
