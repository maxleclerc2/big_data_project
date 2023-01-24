package fr.esiea.enums.xenos;

import java.util.HashSet;

public enum Aeldari {
    AELDARI("aeldari"),
    // HQ
    ASURMEN("asurmen"),
    AUTARCH("autarch"),
    KHAINE("khaine"),
    BAHARROTH("baharroth"),
    ELDRAD_ULTHRAN("eldrad ulthran"),
    FARSEER("farseer"),
    SHADOWSEER("shadowseer"),
    SPIRITSEER("spiritseer"),
    FUEGAN("fuegan"),
    NIGHTSPEAR("nightspear"),
    JAIN_ZAR("jain zar"),
    KARANDRAS("karandras"),
    MAUGAN_RA("maugan ra"),
    YRIEL("yriel"),
    VISARCH("visarch"),
    YNCARNE("yncarne"),
    YVRAINE("yvraine"),
    // TROOPS
    CORSAIR("corsair"),
    GUARDIAN("guardian"),
    RANGER("ranger"),
    TROUPE("troupe"),
    // ELITES
    JESTER("jester"),
    AVENGER("avenger"),
    FIRE_DRAGON("fire dragon"),
    BANSHEE("banshee"),
    SOLITAIRE("solitaire"),
    SCORPION("scorpion"),
    WARLOCK("warlock"),
    WRAITH("wraith"),
    // FAST ATTACK
    SHINING_SPEAR("shining spear"),
    SHROUD_RUNNER("shroud runner"),
    WEAVER("weaver"),
    SWOOPING_HAWK("swooping hawk"),
    VYPER("vyper"),
    WARP_SPIDER("warp spider"),
    WINDRIDER("windrider"),
    // HEAVY SUPPORT
    DARK_REAPER("dark reaper"),
    FALCON("falcon"),
    FIRE_PRISM("fire prism"),
    NIGHT_SPINNER("night spinner"),
    WAR_WALKER("war walker"),
    // TRANSPORT
    WAVE_SERPENT("wave serpent"),
    // FLYER
    CRIMSON_HUNTER("crimson hunter");

    private final String name;

    Aeldari(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Aeldari value: Aeldari.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
