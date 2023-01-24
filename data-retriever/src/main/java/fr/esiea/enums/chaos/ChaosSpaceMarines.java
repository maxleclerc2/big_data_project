package fr.esiea.enums.chaos;

import java.util.HashSet;

public enum ChaosSpaceMarines {
    CHAOS_SPACE_MARINE("chaos space marine"),
    // HQ
    ABADDON("abaddon"),
    CHAOS_LORD("chaos lord"),
    CYPHER("cypher"),
    DARK_APOSTLE("dark apostle"),
    DARK_COMMUNE("dark commune"),
    EXALTED_CHAMPION("exalted champion"),
    FABIUS_BILE("fabius bile"),
    HAARKEN("haarken"),
    HURON("huron"),
    LORD_DISCORDANT("lord discordant"),
    LUCIUS("lucius"),
    MASTER_OF_POSSESSION("master of possession"),
    SORCERER("sorcerer"),
    WARPSMITH("warpsmith"),
    // TROOPS
    CULTIST("cultist"),
    LEGIONARIES("legionaries"),
    // ELITES
    CHAOS_TERMINATOR("chaos terminator"),
    CHOSEN("chosen"),
    HELBRUTE("helbrute"),
    MASTER_OF_EXECUTIONS("master of executions"),
    NOISE_MARINE("noise marine"),
    POSSESSED("possessed"),
    // FAST ATTACK
    CHAOS_BIKER("chaos biker"),
    CHAOS_SPAWN("chaos spawn"),
    RAPTOR("raptor"),
    WARP_TALON("warp talon"),
    // HEAVY SUPPORT
    CHAOS_LAND8RAIDER("chaos land raider"),
    CHAOS_PREDATOR_ANNIHILATOR("chaos predator annihilator"),
    CHAOS_PREDATOR_DESTRUCTOR("chaos predator destructor"),
    CHAOS_VINDICATOR("chaos vindicator"),
    DEFILER("defiler"),
    FORGEFIEND("forgefiend"),
    HAVOC("havoc"),
    MAULERFIEND("maulerfiend"),
    OBLITERATOR("obliterator"),
    VENOMCRAWLER("venomcrawler"),
    // LORD OF WAR
    KHORNE("khorne"),
    // TRANSPORT
    CHAOS_RHINO("chaos rhino"),
    // FLYER
    HELDRAKE("heldrake");

    private final String name;

    ChaosSpaceMarines(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (ChaosSpaceMarines value: ChaosSpaceMarines.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
