package fr.esiea.enums.xenos;

import java.util.HashSet;

public enum Orks {
    ORK("ork"),
    // HQ
    BOSS("boss"),
    BEASTBOSS("beastboss"),
    SNIKROT("snikrot"),
    ZAGSTRUK("zagstruk"),
    DEFFKILLA("deffkilla"),
    GHAZGHKULL("ghazghkull"),
    KAPTIN_BADRUKK("kaptin badrukk"),
    MAKARI("makari"),
    MOZROG("mozrog"),
    PAINBOSS("painboss"),
    WARBOSS("warboss"),
    WEIRDBOY("weirdboy"),
    WURRBOY("wurrboy"),
    ZODGROD("zodgrog"),
    // TROOPS
    BOYZ("boyz"),
    GRETCHIN("gretchin"),
    // ELITES
    MEK("mek"),
    KOMMANDOS("kommandos"),
    GROTSNIK("grotsnik"),
    NOBZ("nobz"),
    PAINBOY("painboy"),
    RUNTHERD("runtherd"),
    TANKBUSTA("tankbusta"),
    // FAST ATTACK
    SNAZZWAGON("snazzwagon"),
    DEFFKOPTA("deffkopta"),
    BOOSTA_BLASTA("boosta-blasta"),
    SCRAPJET("scrapjet"),
    SQUIGBUGGIES("squigbuggies"),
    DRAGSTA("dragsta"),
    WARBIKER("warbiker"),
    // HEAVY SUPPORT
    BATTLEWAGON("battlewagon"),
    BONEBREAKA("bonebreaka"),
    DEFF_DREAD("deff dread"),
    FLASH_GITZ("flash gitz"),
    GUNWAGON("gunwagon"),
    HUNTA_RIG("hunta rig"),
    KILL_RIG("kill rig"),
    KILLA_KAN("killa kan"),
    LOOTA("loota"),
    // LORD OF WAAAGH
    GORKANAUT("gorkanaut"),
    MORKANAUT("morkanaut"),
    STOMPA("stompa"),
    // TRANSPORT
    TRUKK("trukk"),
    // FLYER
    BOMMER("bommer"),
    DAKKAJET("dakkajet"),
    BLASTAJET("blastajet");

    private final String name;

    Orks(String name) {
        this.name = name;
    }

    public static HashSet<String> getValues() {
        HashSet<String> hashSet = new HashSet<>();
        for (Orks value: Orks.values()) {
            hashSet.add(value.name);
        }
        return hashSet;
    }
}
