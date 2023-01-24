package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum AdeptaSoroitas {
    ADEPTA_SOROITA("adepta soroita"),
    // HQ
    CANONESS("canoness"),
    CELESTINE("celestine"),
    EPHRAEL_STERN("ephrael stern"),
    JUNITH("junith"),
    MISSIONARY("missionary"),
    MORVENN("morvenn"),
    PALATINE("palatine"),
    KATHERINE("katherine"),
    // TROOPS
    BATTLE_SISTER("battle sister"),
    SISTERS_NOVITIATE("sisters novitiate"),
    // ELIETS
    AESTRED("aestred"),
    AGATHAE("agathae"),
    ARCO_FLAGELLANT("arco-flagellant"),
    SACRESANT("sacresant"),
    CRUSADER("crusader"),
    DEATH_CULT("death cult"),
    DIALOGUS("dialogus"),
    DOGMATA("dogmata"),
    HOSPITALLER("hospitaller"),
    IMAGIFIER("imagifier"),
    PARAGON("paragon"),
    PREACHER("preacher"),
    REPENTIA("repentia"),
    ZEPHYRIM("zephyrim"),
    // FAST ATTACK
    DOMINION("dominion"),
    SERAPHIM("seraphim"),
    // HEAVY SUPPORT
    CASTIGATOR("castigator"),
    EXORCIST("exorcist"),
    MORTIFIER("mortifier"),
    PENITENT("penitent"),
    RETRIBUTOR("retributor"),
    // TRANSPORT
    IMMOLATOR("immolator"),
    SOROITAS_RHINO("soroitas rhino");

    private final String name;

    AdeptaSoroitas(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (AdeptaSoroitas value: AdeptaSoroitas.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
