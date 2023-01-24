package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum ImperialFists {
    IMPERIAL_FIST("imperial fist"),
    // HQ
    LYSANDER("lysander"),
    PEDRO_KANTOR("pedro kantor"),
    TOR_GARADON("tor garadon");

    private final String name;

    ImperialFists(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (ImperialFists value: ImperialFists.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
