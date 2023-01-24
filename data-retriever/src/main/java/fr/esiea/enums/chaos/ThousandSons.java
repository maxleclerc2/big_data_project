package fr.esiea.enums.chaos;

import java.util.HashSet;

public enum ThousandSons {
    THOUSAND_SONS("thousand sons"),
    // HQ
    AHRIMAN("ahriman"),
    INFERNAL_MASTER("infernal master"),
    // TROOPS
    RUBRIC_MARINE("rubric marine"),
    TZAANGOR("tzaangor"),
    // ELITES
    SCARAB_OCCULT("scarab occult"),
    // HEAVY SUPPORT
    MUTALITH("mutalith"),
    // LORD OF WAR
    MAGNUS("magnus");

    private final String name;

    ThousandSons(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (ThousandSons value: ThousandSons.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
