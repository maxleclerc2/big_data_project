package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum Inquisition {
    INQUISITION("inquisition"),
    // HQ
    INQUISITOR("inquisitor"),
    // ELITES
    DEAMONHOST("deamonhost"),
    JOKAERO("jokaero");

    private final String name;

    Inquisition(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Inquisition value: Inquisition.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
