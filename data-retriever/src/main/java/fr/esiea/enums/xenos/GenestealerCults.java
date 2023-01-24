package fr.esiea.enums.xenos;

import java.util.HashSet;

public enum GenestealerCults {
    GENESTEALER("genestealer"),
    // HQ
    ACOLYTE("acolyte"),
    JACKAL("jackal"),
    MAGUS("magus"),
    PATRIARCH("patriarch"),
    PRIMUS("primus"),
    // TROOPS
    NEOPHYTE("neophyte"),
    HYBRID("hybrid"),
    // ELITES
    ABERRANT("aberrant"),
    ABOMINANT("abominant"),
    BIOPHAGUS("biophagus"),
    CLAMAVUS("clamavus"),
    KELERMORPH("kelermorph"),
    LOCUS("locus"),
    NEXOS("nexos"),
    PURESTRAIN("purestrain"),
    REDUCTUS_SABOTEUR("reductus saboteur"),
    SANCTUS("sanctus"),
    // FAST ATTACK
    RIDGERUNNER("ridgerunner"),
    // HEAVY SUPPORT
    GOLIATH("goliath");

    private final String name;

    GenestealerCults(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (GenestealerCults value: GenestealerCults.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
