package fr.esiea.enums.xenos;

import java.util.HashSet;

public enum Necrons {
    NECRON("necron"),
    // HQ
    SILENT_KING("silent king"),
    IMOTEKH("imotekh"),
    ANRAKYR("anrakyr"),
    SZERAS("szeras"),
    ZAHNDREKH("zahndrekh"),
    ORIKAN("orikan"),
    TRAZYN("trazyn"),
    OBYRON("obyron"),
    CATACOMB_COMMAND_BARGE("catacomb command barge"),
    CRYPTEK("cryptek"),
    CHRONOMANCER("chronomancer"),
    PSYCHOMANCER("psychomancer"),
    TECHNOMANCER("technomancer"),
    PLACMANCER("placmancer"),
    ROYAL_WARDEN("royal warden"),
    LORD("lord"),
    // TROOPS
    WARRIOR("warrior"),
    IMMORTAL("immortal"),
    // ELITES
    CANOPTEK("canoptek"),
    CRYPTOTHRALL("cryptothrall"),
    C_TAN("c'tan"),
    DEATHMARK("deathmark"),
    FLAYED_ONE("flayed one"),
    DESTROYER("destroyer"),
    LYCHGUARD("lychguard"),
    TRIARCH("triarch"),
    // FAST ATTACK
    TOMB_BLADE("tomb blade"),
    // HEAVY SUPPORT
    ANNIHILATION_BARGE("annihilation barge"),
    DOOMSDAY_ARK("doomsday ark"),
    // LORD OF WAR
    MONOLITH("monolith"),
    OBELISK("obelisk"),
    TESSERACT_VAULT("tesseract vault"),
    // TRANSPORT
    GHOST_ARK("ghost ark"),
    // FLYER
    DOOM_SCYTHE("doom scythe"),
    NIGHT_SCYTHE("night scythe");

    private final String name;

    Necrons(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Necrons value: Necrons.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
