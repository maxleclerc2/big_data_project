package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum AstraMilitarum {
    ASTRA_MILITARUM("astra militarum"),
    CADIA("cadia"),
    // HQ
    COLONEL_STRAKEN("colonel straken"),
    COMPANY_COMMANDER("company commander"),
    KNIGHT_COMMANDER("knight commander"),
    LORD_CASTELLAN("lord castellan"),
    PRIMARIS_PSYKER("primaris psyker"),
    TANK_COMMANDER("tank commander"),
    TEMPESTOR_PRIME("tempestor prime"),
    // TROOPS
    CONSCRIPT("conscript"),
    INFANTRY("infantry"),
    MILITARUM_TEMPESTUS("militarum tempestus"),
    // ELITES
    ASTROPATH("astropath"),
    BULLGRYNS("bullgryns"),
    SERGEANT_KELL("sergeant kell"),
    COMMAND_SQUAD("command squad"),
    COMMISSAR("commissar"),
    CRUSADER("crusader"), // TROISIEME FOIS AVEC LE MEME NOM
    MASTER_OF_ORDANANCE("master of ordanance"),
    MINISTORUM_PRIEST("ministorum priest"),
    NORK_DEDDOG("nork deddog"),
    OFFICIER("officier"),
    OGRYNS("ogryns"),
    PLATOON("platoon"),
    RATLING("ratling"),
    HARKER("harker"),
    SERVITOR("servitor"),
    SLY_MARBO("sly marbo"),
    WEAPONS_SQUAD("weapons squad"),
    ENGINSEER("enginseer"),
    VETERAN("veteran"),
    WYRDVANE("wyrdvane"),
    // FAST ATTACK
    SENTINEL("sentinel"),
    HELLHOUND("hellhound"),
    // HEAVY SUPPORT
    BASILISK("basilisk"),
    DEATHSTRIKE("deathstrike"),
    HYDRA("hydra"),
    LEMAN_RUSS("leman russ"),
    MANTICORE("manticore"),
    WYVERN("wyvern"),
    // LORD OF WAR
    BANEBLADE("baneblade"), // BEYBLAAADE
    BANEHAMMER("banehammer"),
    BANESWORD("banesword"),
    DOOMHAMMER("doomhammer"),
    HELLHAMMER("hellhammer"),
    SHADOWSWORD("shadowsword"),
    STORMLORD("stormlord"),
    STORMSWORD("stormsword"),
    // TRANSPORT
    CHIMERA("chimera"),
    TAUROX("taurox"),
    // FLYER
    VALKYRIES("valkyries");

    private final String name;

    AstraMilitarum(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (AstraMilitarum value: AstraMilitarum.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
