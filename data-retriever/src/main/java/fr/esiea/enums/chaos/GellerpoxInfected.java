package fr.esiea.enums.chaos;

import java.util.HashSet;

public enum GellerpoxInfected {
    GELLERPOX_INFECTED("gellerpox infected"),
    // HQ
    VULGRAR("vulgrar"),
    // TROOPS
    GLITCHLING("glitchling"),
    VOX_SHAMBLER("vox-shambler"),
    // ELITES
    HULLBREAKER("hullbreaker"),
    // FAST ATTACK
    CURSEMITE("cursemite"),
    EYESTINGER("eyestinger"),
    SLUDGE_GRUB("sludge-grub");

    private final String name;

    GellerpoxInfected(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (GellerpoxInfected value: GellerpoxInfected.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
