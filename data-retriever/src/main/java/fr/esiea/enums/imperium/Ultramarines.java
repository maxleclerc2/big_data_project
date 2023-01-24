package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum Ultramarines {
    ULTRAMARINE("ultramarine"),
    // HQ
    SICARIUS("sicarius"),
    CASSIUS("cassius"),
    TIGURIUS("tigurius"),
    MARNEUS_CALGAR("marneus calgar"),
    CHRONUS("chronus"),
    TELION("telion"),
    // ELITES
    CHAPTER_ANCIENT("chapter ancient"),
    CHAPTER_CHAMPION("chapter champion"),
    HONOUR_GUARD("honour guard"),
    WAR_VETERANS("war veterans"),
    // LORD OF WAR
    ROBOUTE_GUILLIMAN("roboute guilliman");

    private final String name;

    Ultramarines(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Ultramarines value: Ultramarines.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
