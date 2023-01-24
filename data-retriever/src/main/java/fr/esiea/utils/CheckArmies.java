package fr.esiea.utils;

import fr.esiea.enums.chaos.*;
import fr.esiea.enums.imperium.*;
import fr.esiea.enums.xenos.*;

import java.util.*;

public class CheckArmies {
    private static final Set<String> imperiumArmies = setImperiumArmies();
    private static final Set<String> chaosArmies = setChaosArmies();
    private static final Set<String> xenosArmies = setXenosArmies();

    public static String checkArmies(String content, String text, int likes) {
        HashSet<String> hashSet;

        /*
         *   IMPERIUM
         */

        // ADEPTA SOROITAS
        hashSet = AdeptaSoroitas.getValues();
        content = check("adepta soroita", text, hashSet, content, likes);

        // ADEPTUS CUSTODES
        hashSet = AdeptusCustodes.getValues();
        content = check("adeptus custodes", text, hashSet, content, likes);

        // ADEPTUS MECHANICUS
        hashSet = AdeptusMechanicus.getValues();
        content = check("adeptus mechanicus", text, hashSet, content, likes);

        // ASTRA MILITARUM
        hashSet = AstraMilitarum.getValues();
        content = check("astra militarum", text, hashSet, content, likes);

        // BLACK TEMPLARS
        hashSet = BlackTemplars.getValues();
        content = check("black templar", text, hashSet, content, likes);

        // BLOOD ANGELS
        hashSet = BloodAngels.getValues();
        content = check("blood angel", text, hashSet, content, likes);

        // DARK ANGELS
        hashSet = DarkAngels.getValues();
        content = check("dark angel", text, hashSet, content, likes);

        // DEATHWATCH
        hashSet = Deathwatch.getValues();
        content = check("deathwatch", text, hashSet, content, likes);

        // ELUCIDIAN STARSTRIDERS
        hashSet = ElucidianStarstriders.getValues();
        content = check("elucidian starstrider", text, hashSet, content, likes);

        // GREY KNIGHTS
        hashSet = GreyKnights.getValues();
        content = check("grey knight", text, hashSet, content, likes);

        // IMPERIAL FISTS
        hashSet = ImperialFists.getValues();
        content = check("imperial fist", text, hashSet, content, likes);

        // IMPERIAL KNIGHTS
        hashSet = ImperialKnights.getValues();
        content = check("imperial knight", text, hashSet, content, likes);

        // INQUISITION
        hashSet = Inquisition.getValues();
        content = check("inquisition", text, hashSet, content, likes);

        // IRON HANDS
        hashSet = IronHands.getValues();
        content = check("iron hand", text, hashSet, content, likes);

        // OFFICIO ASSASSINORUM
        hashSet = OfficioAssassinorum.getValues();
        content = check("officio assassinorum", text, hashSet, content, likes);

        // RAVEN GUARD
        hashSet = RavenGuard.getValues();
        content = check("raven guard", text, hashSet, content, likes);

        // SALAMENDERS
        hashSet = Salamenders.getValues();
        content = check("salamender", text, hashSet, content, likes);

        // SPACE MARINES
        hashSet = SpaceMarines.getValues();
        content = check("space marine", text, hashSet, content, likes);

        // SPACE WOLVES
        hashSet = SpaceWolves.getValues();
        content = check("space wolf", text, hashSet, content, likes);

        // ULTRAMARINES
        hashSet = Ultramarines.getValues();
        content = check("ultramarine", text, hashSet, content, likes);

        // WHITE SCARS
        hashSet = WhiteScars.getValues();
        content = check("white scar", text, hashSet, content, likes);

        /*
         *   CHAOS
         */

        // DEAMONS
        hashSet = ChaosDaemons.getValues();
        content = check("chaos daemon", text, hashSet, content, likes);

        // KNIGHTS
        hashSet = ChaosKnights.getValues();
        content = check("chaos knight", text, hashSet, content, likes);

        // SPACE MARINES
        hashSet = ChaosSpaceMarines.getValues();
        content = check("chaos space marine", text, hashSet, content, likes);

        // DEATH GUARD
        hashSet = DeathGuard.getValues();
        content = check("death guard", text, hashSet, content, likes);

        // GELLERPOX INFECTED
        hashSet = GellerpoxInfected.getValues();
        content = check("gellerpox infected", text, hashSet, content, likes);

        // THOUSAND SONS
        hashSet = ThousandSons.getValues();
        content = check("thousand sons", text, hashSet, content, likes);

        /*
         *   XENOS
         */

        // AELDARI
        hashSet = Aeldari.getValues();
        content = check("aeldari", text, hashSet, content, likes);

        // DRUKHARI
        hashSet = Drukhari.getValues();
        content = check("drukhari", text, hashSet, content, likes);

        // GENESTEALER CULT
        hashSet = GenestealerCults.getValues();
        content = check("genestealer", text, hashSet, content, likes);

        // NECRON
        hashSet = Necrons.getValues();
        content = check("necron", text, hashSet, content, likes);

        // ORK
        hashSet = Orks.getValues();
        content = check("ork", text, hashSet, content, likes);

        // T'AU
        hashSet = TauEmpire.getValues();
        content = check("tau", text, hashSet, content, likes);

        // TYRANIDS
        hashSet = Tyranids.getValues();
        content = check("tyranid", text, hashSet, content, likes);

        return content;
    }

    private static String check(String army, String text, HashSet<String> hashSet, String content, int likes) {
        Set<String> toSave = new HashSet<>();
        StringBuilder contentBuilder = new StringBuilder(content);

        hashSet.forEach(value -> {
            if (text.contains(value)) toSave.add(value);
        });

        if (!toSave.isEmpty()) {
            if (CheckArmies.imperiumArmies.contains(army)) {
                toSave.add("imperium");
                contentBuilder.append("likes imperium::").append(likes).append(";;");
            } else if (CheckArmies.chaosArmies.contains(army)) {
                toSave.add("chaos");
                contentBuilder.append("likes chaos::").append(likes).append(";;");
            } else if (CheckArmies.xenosArmies.contains(army)) {
                toSave.add("xenos");
                contentBuilder.append("likes xenos::").append(likes).append(";;");
            }

            if (army.equals("tau"))
                toSave.remove("t'au");
            toSave.add(army);
            for (String save: toSave) {
                contentBuilder.append(save).append("::1;;");
            }
            contentBuilder.append("likes ").append(army).append("::").append(likes).append(";;");
            content = contentBuilder.toString();
        }

        return content;
    }

    private static Set<String> setImperiumArmies() {
        Set<String> set = new HashSet<>();
        set.add("adepta soroita");
        set.add("adeptus custodes");
        set.add("adeptus mechanicus");
        set.add("astra militarum");
        set.add("black templar");
        set.add("blood angel");
        set.add("dark angel");
        set.add("deathwatch");
        set.add("elucidian starstrider");
        set.add("grey knight");
        set.add("imperial fist");
        set.add("imperial knight");
        set.add("inquisition");
        set.add("iron hand");
        set.add("officio assassinorum");
        set.add("raven guard");
        set.add("salamender");
        set.add("space marine");
        set.add("space wolf");
        set.add("ultramarine");
        set.add("white scar");

        return set;
    }

    private static Set<String> setChaosArmies() {
        Set<String> set = new HashSet<>();
        set.add("chaos daemon");
        set.add("chaos knight");
        set.add("chaos space marine");
        set.add("death guard");
        set.add("gellerpox infected");
        set.add("thousand sons");

        return set;
    }

    private static Set<String> setXenosArmies() {
        Set<String> set = new HashSet<>();
        set.add("aeldari");
        set.add("drukhari");
        set.add("genestealer");
        set.add("necron");
        set.add("ork");
        set.add("tau");
        set.add("tyranid");

        return set;
    }
}
