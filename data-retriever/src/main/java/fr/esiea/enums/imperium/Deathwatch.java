package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum Deathwatch {
    DEATHWATCH("deathwatch"),
    // HQ
    CHAPLAIN_CASSIUS("chaplain cassius"),
    CODICIER_NATORIAN("codicier natorian"),
    WATCH_CAPTAIN("watch captain"),
    WATCH_MASTER("watch master"),
    // TROOPS
    KILL_TEAM("kill team"),
    // FAST ATTACK
    VETERAN_BIKE_SQUAD("veteran bike squad"),
    // FLYER
    CORVUS_BLACKSTAR("corvus blackstar");

    private final String name;

    Deathwatch(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Deathwatch value: Deathwatch.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
