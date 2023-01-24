package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum ElucidianStarstriders {
    ELUCIDIAN_STARSTRIDER("elucidian starstrider"),
    // HQ
    ELUCIA_VHANE("elucia vhane"),
    // TROOPS
    NITSCH("nitsch"),
    // ELITES
    KNOSSO("knosso"),
    LARSEN_VAN_DER_GRAUSS("larsen van der grauss"),
    SANISTASIA("sanistasia");

    private final String name;

    ElucidianStarstriders(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (ElucidianStarstriders value: ElucidianStarstriders.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
