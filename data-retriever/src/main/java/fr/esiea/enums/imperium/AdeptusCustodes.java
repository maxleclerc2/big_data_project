package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum AdeptusCustodes {
    ADEPTUS_CUSTODES("adeptus custodes"),
    // HQ
    ALEYA("aleya"),
    BLADE_CHAMPION("blade champion"),
    KNIGHT_CENTURA("knight centura"),
    SHIELD_CAPTAIN("shield captain"),
    TRAJANN_VALORIS("trajan valoris"),
    VALERIAN("valerian"),
    // TROOPS
    CUSTODIAN("custodian"),
    PROSECUTORS("prosecutor"),
    // ELITES
    VENERABLE_CONTEMPTOR_DREADNOUGHT("venerable contemptor dreadnought"),
    VEXILUS_PRAETOR("vexilus praetor"),
    VIGILATOR("vigilator"),
    // FAST ATTACK
    VERTUS_PRAETOR("vertus praetor"),
    WITCHSEEKER("witchseeker"),
    // HEAVY SUPPORT
    VENERABLE_LAND_RAIDER("venerable land raider"),
    // TRANSPORT
    ANATHEMA_PSYKANA_RHINO("anathema psykana rhino");

    private final String name;

    AdeptusCustodes(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (AdeptusCustodes value: AdeptusCustodes.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
