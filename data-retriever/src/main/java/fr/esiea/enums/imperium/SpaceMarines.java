package fr.esiea.enums.imperium;

import java.util.HashSet;

public enum SpaceMarines {
    SPACE_MARINE("space marine"),
    PRIMARIS("primaris"),
    // HQ
    CAPTAIN("captain"),
    CHAPLAIN("chaplain"),
    LIBRARIAN("librarian"),
    LIEUTENANT("lieutenant"),
    TECHMARINE("techmarine"),
    // TROOPS
    INFILTRATOR_SQUAD("infiltrator squad"),
    INFILTRATOR("infiltrator"),
    INTERCESSOR_SQUAD("intercessor squad"),
    INTERCESSOR("intercessor"),
    SCOUT_SQUAD("scout squad"),
    SCOUT("scout"),
    TACTICAL_SQUAD("tactical squad"),
    TACTICAL("tactical"),
    // ELITES
    AGGRESSOR_SQUAD("aggressor squad"),
    AGGRESSOR("aggressor"),
    APOTHECARY("apothecary"),
    BLADEGUARD("bladeguard"),
    ASSAULT_SQUAD("assault squad"),
    ASSAULT("assault"),
    COMPANY_ANCIENT("company ancient"),
    COMPANY_CHAMPION("company champion"),
    COMPANY_VETERAN("company veteran"),
    DREADNOUGHT("dreadnought"),
    JUDICIAR("judiciar"),
    REIVER_SQUAD("reiver squad"),
    REIVER("reiver"),
    SERVITOR("servitor"),
    STERNGUARD("sternguard"),
    VANGUARD("venguard"),
    VETERAN_SQUAD("veteran squad"),
    TERMINATOR_SQUAD("terminator squad"),
    TERMINATOR("terminator"),
    // FAST ATTACK
    BIKE_SQUAD("bike squad"),
    INCEPTOR_SQUAD("inceptor squad"),
    INCEPTOR("inceptor"),
    INVADER_SQUAD("invader squad"),
    INVADER("invader"),
    LAND_SPEEDER("land speeder"),
    OUTRIDER_SQUAD("outrider squad"),
    OUTRIDER("outrider"),
    STORM_SPEEDER("storm speeder"),
    SUPPRESSOR_SQUAD("suppressor squad"),
    SUPPRESSOR("suppressor"),
    // HEAVY SUPPORT
    DEVASTATOR_SQUAD("devastator squad"),
    DEVASTATOR("devastator"),
    ELIMINATOR_SQUAD("eliminator squad"),
    ELIMINATOR("eliminator"),
    ERADICATOR_SQUAD("eradicator squad"),
    ERADICATOR("eradicator"),
    FIRESTRIKE("firestrike"),
    GLADIATOR("gladiator"),
    HELLBLASTER_SQUAD("hellblaster squad"),
    HELLBLASTER("hellbaster"),
    HUNTER("hunter"),
    LAND_RAIDER("land raider"),
    PREDATOR_ANNIHILATOR("predator annihilator"),
    PREDATOR_DESTRUCTOR("predator destructor"),
    PREDATOR("predator"),
    STALKER("stalker"),
    THUNDERFIRE("thunderfire"),
    VINDICATOR("vindicator"),
    WHIRLWIND("whirlwind"),
    // TRANSPORT
    DROP_POD("drop pod"),
    IMPULSOR("impulsor"),
    LADE_SPEEDER("lade speeder"),
    RAZORBACK("razorback"),
    REPULSOR("repulsor"),
    RHINO("rhino"),
    // FLYER
    STORMHAWK("stormhawk"),
    STORMRAVEN("stormraven"),
    STORMTALON("stormtalon");

    private final String name;

    SpaceMarines(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (SpaceMarines value: SpaceMarines.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
