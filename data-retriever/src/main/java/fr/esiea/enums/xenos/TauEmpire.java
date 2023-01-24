package fr.esiea.enums.xenos;

import java.util.HashSet;

public enum TauEmpire {
    TAU("tau"),
    T_AU("t'au"),
    // HQ
    AUN_SHI("aun'shi"),
    AUN_VA("aun'va"),
    FIREBLADE("fireblade"),
    FARSIGHT("farsight"),
    COLDSTAR_BATTLESUIT("coldstar battlesuit"),
    XV86("xv86"),
    ENFORCER_BATTLESUIT("enforcer battlesuit"),
    XV85("xv85"),
    SHADOWSUN("shadowsun"),
    DARKSTRIDER("darkstrider"),
    ETHEREAL("ethereal"),
    LONGSTRIKE("longstrike"),
    // TROOPS
    BREACHER_TEAM("breacher team"),
    STRIKE_TEAM("strike team"),
    KROOT("kroot"),
    // ELITES
    CRISIS_BATTLESUIT("crisis battlesuit"),
    XV8("xv8"),
    CRISIS_BODYGUARDS("crisis bodyguards"),
    GHOSTKEEL("ghostkeel"),
    XV95("xv95"),
    RIPTIDE("riptide"),
    XV104("xv104"),
    STEALTH_BATTLESUIT("stealth battlesuit"),
    XV25("xv25"),
    FIRESIGHT_MARKSMAN("firesight marksman"),
    SNIPER_DRONE("sniper drone"),
    MV71("mv71"),
    KROOTOX("krootox"),
    // FAST ATTACK
    PATHFINDER_TEAM("pathfinder team"),
    PIRANHA("piranha"),
    TX4("tx4"),
    VESPID("vespid"),
    // HEAVY SUPPORT
    BROADSIDE("broadside"),
    XV88("xv88"),
    HAMMERHEAD("hammerhead"),
    TX7("tx7"),
    SKY_RAY("sky ray"),
    TX78("tx78"),
    // FLYER
    RAZORSHARK("razorshark"),
    AX3("ax3"),
    SUN_SHARK("sun shark"),
    AX39("ax39"),
    // TRANSPORT
    DEVILFISH("devilfish"),
    TY7("ty7"),
    // LORD OF WAR
    STORMSURGE("stormsurge"),
    KV128("kv128"),
    // FORTIFICATION
    TIDEWALL("tidewall")
    ;

    private final String name;

    TauEmpire(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (TauEmpire value: TauEmpire.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
