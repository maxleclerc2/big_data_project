package fr.esiea.enums.xenos;

import java.util.HashSet;

public enum Drukhari {
    DRUKHARI("drukhari"),
    // HQ
    ARCHON("archon"),
    DRAZHAR("drazhar"),
    HAEMONCULUS("haemonculus"),
    HESPERAX("hesperax"),
    SUCCUBUS("succubus"),
    RAKARTH("rakarth"),
    // TROOPS
    KABALITE_WARRIOR("kabalite warrior"),
    WRACK("wrack"),
    WYCHE("wyche"),
    // ELITES
    BEASTMASTER("beastmaster"),
    GROTESQUE("grotesque"),
    INCUBI("incubi"),
    MANDRAKE("mandrake"),
    // FAST ATTACK
    CLAWED_FRIEND("clawed friend"),
    HELLION("hellion"),
    KHYMERAE("khymerae"),
    RAZORWING("razorwing"),
    REAVER("reaver"),
    SCOURGE("scourge"),
    // HEAVY SUPPORT
    CRONOS("cronos"),
    RAVAER("ravager"),
    TALOS("talos"),
    // TRANSPORT
    RAIDER("raider"),
    VENOM("venom"),
    // FLYER
    VOIDRAVEN("voidraven");

    private final String name;

    Drukhari(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Drukhari value: Drukhari.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
