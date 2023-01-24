package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum Salamenders {
    SALAMENDER("salamender"),
    // HQ
    ADRAX_AGATONE("adrax agatone"),
    KRUJENI_LUCEIOR("krujeni luceior"),
    PARAON_UARI("paraon uari"),
    VULKAN_HESTAN("vulkan he'stan");

    private final String name;

    Salamenders(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Salamenders value: Salamenders.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
