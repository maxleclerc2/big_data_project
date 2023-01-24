package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum ImperialKnights {
    IMPERIAL_KNIGHT("imperial knight"),
    // LORD OF WAR
    ARMIGER("armiger"),
    CANIS_REX("canis rex"),
    KNIGHT_CASTELLAN("knight castellan"),
    KNIGHT_CRUSADER("knight crusader"),
    KNIGHT_ERRANT("knight errant"),
    KNIGHT_GALLANT("knight gallant"),
    KNIGHT_PALADIN("knight paladin"),
    KNIGHT_PRECEPTOR("knight preceptor"),
    KNIGHT_VALIANT("knight valiant"),
    KNIGHT_WARDEN("knight warden");

    private final String name;

    ImperialKnights(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (ImperialKnights value: ImperialKnights.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
