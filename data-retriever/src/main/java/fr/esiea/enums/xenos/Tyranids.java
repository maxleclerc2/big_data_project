package fr.esiea.enums.xenos;

import java.util.HashSet;

public enum Tyranids {
    TYRANID("tyranid"),
    // HQ
    BROODLORD("broodlord"),
    HIVE("hive"),
    OLD_ONE_EYE("old one eye"),
    NEUROTHROPE("neurothrope"),
    TERVIGON("tervigon"),
    SWARMLORD("swarmlord"),
    TRYGON("trygon"),
    // TROOPS
    HORMAGAUNT("hormagaunt"),
    TERMAGANT("termagant"),
    // ELITES
    DEATHLEAPER("deathleaper"),
    GENESTEALER("genestealer"),
    HARUSPEX("haruspex"),
    LICTOR("lictor"),
    MALECEPTOR("maleceptor"),
    PYROVORE("pyrovore"),
    TOXICRENE("toxicrene"),
    TYRANT("tyrant"),
    VENOMTHROPE("venomthrope"),
    ZOANTHROPE("zoanthrope"),
    // FAST ATTACK
    GARGOYLE("gargoyle"),
    MAWLOC("mawloc"),
    MUCOLID("mucolid"),
    MORTREX("mortrex"),
    RAVENER("ravener"),
    RIPPER("ripper"),
    SPORE("spore"),
    // HEAVY SUPPORT
    BIOVORE("biovore"),
    CARNIFEX("carnifex"),
    EXOCRINE("exocrine"),
    SCREAMER_KILLER("screamer killer"),
    THORNBACK("thornback"),
    TYRANNOCYTE("tyrannocyte"),
    TYRANNOFEX("tyrannofex"),
    // FLYER
    HARPY("harpy");

    private final String name;

    Tyranids(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Tyranids value: Tyranids.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
