package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum BlackTemplars {
    BLACK_TEMPLAR("black templar"),
    // HQ
    GRIMALDUS("grimaldus"),
    HIGH_MARSHALL_HELBRECHT("high marshall helbrecht"),
    EMPEROR_CHAMPION("emperor's champion"),
    // TROOPS
    CRUSADER_SQUAD("crusader squad"),
    // ELITES
    BRETHREN("brethren");

    private final String name;

    BlackTemplars(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (BlackTemplars value: BlackTemplars.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
