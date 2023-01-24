package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum SpaceWolves {
    SPACE_WOLVES("space wolves"),
    SPACE_WOLF("space wolf"),
    FENRIS("fenris"),
    // HQ
    ARJAC_ROCKFIST("arjac rockfist"),
    BJORN("bjorn"),
    CANIS_WOLFBORN("canis wolfborn"),
    HARALD_DEATHWOLF("harald deathwolf"),
    KROM_DRAGONGAZE("krom gragongaze"),
    LOGAN_GRIMNAR("logan grimnar"),
    NJAL_STORMCALLER("njal stormcaller"),
    RAGNAR_BLACKMANE("ragnar blackmane"),
    ULRIK("ulrik"),
    // TROOPS
    BLOOD_CLAWS("blood claws"),
    GREY_HUNTERS("grey hunters"),
    // ELITES
    MORKAI("morkai"),
    LUKAS("lukas"),
    MURDERFANG("murderfang"),
    WOLF_GUARD("wolf guard"),
    WULFEN("wulfen"),
    // FAST ATTACK
    CYBERWOLVES("cyberwolves"),
    FENRISIAN("fenrisian"),
    SKYCLAW("skyclaw"),
    THUNDERWOLF("thuderwolf"),
    // HEAVY SUPPORT
    LONG_FANG("long fang"),
    // FLYER
    STORMFANG("stormfang"),
    STORMWOLF("stormwolf");

    private final String name;

    SpaceWolves(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (SpaceWolves value: SpaceWolves.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
