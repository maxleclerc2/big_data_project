package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum GreyKnights {
    GREY_KNIGHT("grey knight"),
    // HQ
    BROTHER_CAPTAIN("brother captain"),
    BROTHERHOOD("brotherhood"),
    CASTELLAN_CROWE("castellan crowe"),
    GRAND_MASTER("grand master"),
    KALDOR_DRAIGO("kaldor draigo"),
    // TROOPS
    STRIKE_SQUAD("strike squad"),
    // ELITES
    PALADIN_ANCIENT("paladin ancient"),
    PALADIN_SQUAD("paladin squad"),
    // HEAVY SUPPORT
    NEMESIS_DREADKNIGHT("nemesis dreadknight"),
    PURGATION("purgation");

    private final String name;

    GreyKnights(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (GreyKnights value: GreyKnights.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
