package fr.esiea.enums.chaos;

import java.util.HashSet;

public enum DeathGuard {
    DEATH_GUARD("death guard"),
    // HQ
    CONTAGION("contagion"),
    VIRULENCE("virulence"),
    PLAGUECASTER("plaguecaster"),
    TYPHUS("typhus"),
    // TROOPS
    PLAGUE_MARINE("plague marine"),
    POXWALKER("poxwalker"),
    // ELITES
    BIOLOGUS("biologus"),
    BLIGHTLORD("blightlord"),
    DEATHSHROUD("deathshroud"),
    BLIGHSPAWN("blightspawn"),
    BLIGHTBRINGER("blightbringer"),
    PLAGUE_SURGEON("plague surgeon"),
    TALLYMAN("tallyman"),
    // FAST ATTACK
    BLOAT_DRONE("bloat drone"),
    BLIGHT_HAULER("blight-hauler"),
    // HEAVY SUPPORT
    PLAGUEBURST("plagueburst"),
    // LORD OF WAR
    MORTARION("mortarion");

    private final String name;

    DeathGuard(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (DeathGuard value: DeathGuard.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
