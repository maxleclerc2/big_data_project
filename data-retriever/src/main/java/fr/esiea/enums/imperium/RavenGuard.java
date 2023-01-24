package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum RavenGuard {
    RAVEN_GUARD("raven guard"),
    // HQ
    KAYVAAN_SHRIKE("kayvaan shrike");

    private final String name;

    RavenGuard(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (RavenGuard value: RavenGuard.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
