package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum AdeptusMechanicus {
    ADEPTUS_MECHANICUS("adeptus mechanicus"),
    // HQ
    BELISARIUS_CAWL("belisarius cawl"),
    TECH_PRIEST("tech-priest"),
    TECHNOARCHEOLOGIST("technoarcheologist"),
    // TROOPS
    KATAPHRON("kataphron"),
    SKITARII("skitarii"),
    // ELITES
    ELECTRO_PRIEST("electro-priest"),
    CYBERNETICA_DATASMITH("cybernetica datasmith"),
    SERVITOR("servitor"),
    SICARIAN("sicarian"),
    // FAST ATTACK
    IRONSTRIDER_BALLISTARII("ironstrider ballistarii"),
    PTERAXII("pteraxii"),
    SERBERYS("serberys"),
    SYDONIAN("sydonian"),
    // HEAVY SUPPORT
    KASTELAN("kastellan"),
    ONAGER_DUNECRAWLER("onager dunecrawler"),
    SKORPIUS("skorpius"),
    // FLYER
    ARCHAEOPTER("archaeopter");

    private final String name;

    AdeptusMechanicus(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (AdeptusMechanicus value: AdeptusMechanicus.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
