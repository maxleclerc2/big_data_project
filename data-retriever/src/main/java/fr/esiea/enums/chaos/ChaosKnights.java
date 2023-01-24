package fr.esiea.enums.chaos;

import java.util.HashSet;

public enum ChaosKnights {
    CHAOS_KNIGHT("chaos knight"),
    // LORD OF WAR
    ABOMINANT("abominant"),
    DESECRATOR("desecrator"),
    DESPOILER("despoiler"),
    RAMPAGER("rampager"),
    TYRANT("tyrant"), // TYRANID DE CES MORT
    WAR_DOG("war dog");

    private final String name;

    ChaosKnights(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (ChaosKnights value: ChaosKnights.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
