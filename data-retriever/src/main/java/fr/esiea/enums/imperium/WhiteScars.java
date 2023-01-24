package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum WhiteScars {
    WHITE_SCAR("white scar"),
    // HQ
    KHAN("khan");

    private final String name;

    WhiteScars(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (WhiteScars value: WhiteScars.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
