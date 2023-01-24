package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum DarkAngels {
    DARK_ANGEL("dark angel"),
    // HQ
    ASMODAI("asmodai"),
    AZRAEL("azrael"),
    BELIAL("belial"),
    EZEKIEL("ezekiel"),
    INTERROGATOR_CHAPLAIN("interrogator-chaplain"),
    LAZARUS("lazarus"),
    SAMMAEL("sammael"),
    // ELITES
    DEATHWING("deathwing"),
    RAVENWING("ravenwing"),
    // FLYER
    NEPHILIM_JETFIGHTER("nephilim jetfighter");

    private final String name;

    DarkAngels(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (DarkAngels value: DarkAngels.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
