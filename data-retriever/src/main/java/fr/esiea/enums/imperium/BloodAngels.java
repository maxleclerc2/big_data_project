package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum BloodAngels {
    BLOOD_ANGEL("blood angel"),
    // HQ
    ASTORATH("astorath"),
    CORBULO("corbulo"),
    TYCHO("tycho"),
    MEPHISTON("mephiston"),
    COMMANDER_DANTE("commander dante"),
    GABRIEL_SETH("gabriel seth"),
    LEMARES("lemartes"),
    LIBRARIAN_DREADNOUGHT("librarian dreadnought"),
    SANGUINARY_PRIEST("sanguinary priest"),
    SNGUINOR("sanguinor"),
    // ELITES
    DEATH_COMPANY("death company"),
    FURIOSO_DREADNOUGHT("furioso dreadnought"),
    SANGUINARY_ANCIENT("sanguinary ancient"),
    // HEAVY SUPPORT
    BAAL_PREDATOR("baal predator");

    private final String name;

    BloodAngels(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (BloodAngels value: BloodAngels.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
