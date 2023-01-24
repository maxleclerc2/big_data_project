package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum OfficioAssassinorum {
    OFFICIO_ASSASSINORUM("officia assassinorum"),
    // ELITES
    ASSASSIN("assassin"),
    CALLIDUS("callidus"),
    CULEXUS("culexus"),
    EVERSOR("eversor"),
    VINDICARE("vindicare");

    private final String name;

    OfficioAssassinorum(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (OfficioAssassinorum value: OfficioAssassinorum.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
