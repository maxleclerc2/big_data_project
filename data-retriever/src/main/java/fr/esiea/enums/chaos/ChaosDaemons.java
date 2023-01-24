package fr.esiea.enums.chaos;

import java.util.HashSet;

public enum ChaosDaemons {
    CHAOS_DAEMONS("chaos daemons"),
    // HQ
    BE_LAKOR("be'lakor"),
    BLOOD_THRONE("blood throne"),
    BLOODMASTER("bloodmaster"),
    BLOODTHIRSTER("bloodthirster"),
    CHANGECASTER("changecaster"),
    CONTORTED_EPITOME("contorted epitome"),
    DEAMON_PRINCE("deamon prince"),
    EPIDEMIUS("epidemius"),
    FATESKIMMER("fateskimmer"),
    FLUXMASTER("fluxmaster"),
    GREAT_UNCLEAN_ONE("great unclean one"),
    HERALD("herald"),
    HORTICULOUS("horticulous"),
    INFERNAL_ENRAPTURESS("infernal enrapturess"),
    KAIROS("kairos"),
    KARANAK("karanak"),
    KEEPER_OF_SECRETS("keeper of secret"),
    LORD_OF_CHANGE("lord of change"),
    POXBRINGER("poxbringer"),
    ROTIGUS("rotigus"),
    SHALAXI("shalaxi"),
    SKARBRAND("skarbrand"),
    SKULLMASTER("skullmaster"),
    SKULLTAKER("skulltaker"),
    SLOPPITY("sloppity"),
    SPOILPOX("spoilpox"),
    SYLL_ESSKE("syll'esske"),
    BLUE_SCRIBE("blue scribe"),
    CHANGELING("changeling"),
    MASQUE_OF_SLAANESH("masque of slaanesh"),
    // TROOPS
    BLOODLETTER("bloodletter"),
    DEAMONETTE("deamonette"),
    HORROR("horror"),
    NURGLING("nurgling"),
    PLAGUEBEARER("plaguebearer"),
    // ELITES
    BEASTS_OF_NURGLE("beasts of nurgle"),
    BLOODCRUSHER("bloodcrusher"),
    FLAMER("flamer"),
    FIEND("fiend"),
    // FAST ATTACK
    FLESH_HOUND("flesh hound"),
    FURIES("furies"),
    HELLFLAYER("hellflayer"),
    SCREAMER("screamer"),
    SEEKER("seeker"),
    // HEAVY SUPPORT
    BURNING_CHARIOT("burning chariot"),
    SKULL_CANNON("skull cannon"),
    SOUL_GRINDER("soul grinder");

    private final String name;

    ChaosDaemons(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (ChaosDaemons value: ChaosDaemons.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
