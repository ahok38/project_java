package view;

import javafx.scene.image.Image;

import java.util.HashMap;

/**
 * Created by thorsten on 17.07.16.
 *
 * contains a collection of monster images for use
 * in the graphical views of the game interface
 *
 * the pictures are accessible from other classes as:
 * -    an array of images or
 * -    a hashmap of images
 */
public class MonsterPics {

    private Image ancient_lich = new Image("view/images/monsters/ancient_lich.png");
    private Image antaeus = new Image("view/images/monsters/antaeus.png");
    private Image asmodeus = new Image("view/images/monsters/asmodeus.png");
    private Image asmodeus_new = new Image("view/images/monsters/asmodeus_new.png");
    private Image baby_purple_worm = new Image("view/images/monsters/baby_purple_worm.png");
    private Image balrug = new Image("view/images/monsters/balrug.png");
    private Image beholder = new Image("view/images/monsters/beholder.png");
    private Image black_dragon = new Image("view/images/monsters/black_dragon.png");
    private Image black_naga = new Image("view/images/monsters/black_naga.png");
    private Image blue_death = new Image("view/images/monsters/blue_death.png");
    private Image bone_devil = new Image("view/images/monsters/bone_devil.png");
    private Image cacodemon = new Image("view/images/monsters/cacodemon.png");
    private Image carnivorous_ape = new Image("view/images/monsters/carnivorous_ape.png");
    private Image cave_spider = new Image("view/images/monsters/cave_spider.png");
    private Image centipede = new Image("view/images/monsters/centipede.png");
    private Image cerebov = new Image("view/images/monsters/cerebov.png");
    private Image cyclops = new Image("view/images/monsters/cyclops.png");
    private Image deep_elf_death_mage = new Image("view/images/monsters/deep_elf_death_mage.png");
    private Image deep_elf_fighter = new Image("view/images/monsters/deep_elf_fighter.png");
    private Image dispater = new Image("view/images/monsters/dispater.png");
    private Image dragon = new Image("view/images/monsters/dragon.png");
    private Image dwarf_king = new Image("view/images/monsters/dwarf_king.png");
    private Image dwarf_lord = new Image("view/images/monsters/dwarf_lord.png");
    private Image efreet = new Image("view/images/monsters/efreet.png");
    private Image ereshkigal = new Image("view/images/monsters/ereshkigal.png");
    private Image ettin = new Image("view/images/monsters/ettin.png");
    private Image ettin_new = new Image("view/images/monsters/ettin_new.png");
    private Image executioner = new Image("view/images/monsters/executioner.png");
    private Image eye_of_devastation = new Image("view/images/monsters/eye_of_devastation.png");
    private Image fiend = new Image("view/images/monsters/fiend.png");
    private Image fire_giant = new Image("view/images/monsters/fire_giant.png");
    private Image flying_skull = new Image("view/images/monsters/flying_skull.png");
    private Image frost_giant = new Image("view/images/monsters/frost_giant.png");
    private Image gargoyle = new Image("view/images/monsters/gargoyle.png");
    private Image geryon = new Image("view/images/monsters/geryon.png");
    private Image ghoul = new Image("view/images/monsters/ghoul.png");
    private Image giant_spider = new Image("view/images/monsters/giant_spider.png");
    private Image gloorx_vloq = new Image("view/images/monsters/gloorx_vloq.png");
    private Image gnome_king = new Image("view/images/monsters/gnome_king.png");
    private Image gnomish_wizard = new Image("view/images/monsters/gnomish_wizard.png");
    private Image golden_dragon = new Image("view/images/monsters/golden_dragon.png");
    private Image gremlin = new Image("view/images/monsters/gremlin.png");
    private Image hill_giant = new Image("view/images/monsters/hill_giant.png");
    private Image homunculus = new Image("view/images/monsters/homunculus.png");
    private Image hydra = new Image("view/images/monsters/hydra.png");
    private Image ice_fiend = new Image("view/images/monsters/ice_fiend.png");
    private Image imp = new Image("view/images/monsters/imp.png");
    private Image incubus = new Image("view/images/monsters/incubus.png");
    private Image iron_dragon = new Image("view/images/monsters/iron_dragon.png");
    private Image iron_troll = new Image("view/images/monsters/iron_troll.png");
    private Image killer_bee = new Image("view/images/monsters/killer_bee.png");
    private Image leprechaun = new Image("view/images/monsters/leprechaun.png");
    private Image lich = new Image("view/images/monsters/lich.png");
    private Image lich_old = new Image("view/images/monsters/lich_old.png");
    private Image lom_lobon = new Image("view/images/monsters/lom_lobon.png");
    private Image manes = new Image("view/images/monsters/manes.png");
    private Image manticore = new Image("view/images/monsters/manticore.png");
    private Image manticore_new = new Image("view/images/monsters/manticore_new.png");
    private Image minotaur = new Image("view/images/monsters/minotaur.png");
    private Image mnoleg = new Image("view/images/monsters/mnoleg.png");
    private Image moth_of_wrath = new Image("view/images/monsters/moth_of_wrath.png");
    private Image nazgul = new Image("view/images/monsters/nazgul.png");
    private Image ogre_lord = new Image("view/images/monsters/ogre_lord.png");
    private Image olog_hai = new Image("view/images/monsters/olog_hai.png");
    private Image orb_guardian = new Image("view/images/monsters/orb_guardian.png");
    private Image orc_high_priest = new Image("view/images/monsters/orc_high_priest.png");
    private Image orc_shaman = new Image("view/images/monsters/orc_shaman.png");
    private Image orc_warrior = new Image("view/images/monsters/orc_warrior.png");
    private Image pit_fiend = new Image("view/images/monsters/pit_fiend.png");
    private Image plains_centaur = new Image("view/images/monsters/plains_centaur.png");
    private Image python = new Image("view/images/monsters/python.png");
    private Image quasit = new Image("view/images/monsters/quasit.png");
    private Image queen_ant = new Image("view/images/monsters/queen_ant.png");
    private Image quicksilver_dragon = new Image("view/images/monsters/quicksilver_dragon.png");
    private Image redback = new Image("view/images/monsters/redback.png");
    private Image red_dragon = new Image("view/images/monsters/red_dragon.png");
    private Image rock_troll = new Image("view/images/monsters/rock_troll.png");
    private Image sandestin = new Image("view/images/monsters/sandestin.png");
    private Image sasquatch = new Image("view/images/monsters/sasquatch.png");
    private Image scorpion = new Image("view/images/monsters/scorpion.png");
    private Image serpent_of_hell = new Image("view/images/monsters/serpent_of_hell.png");
    private Image shadow_dragon = new Image("view/images/monsters/shadow_dragon.png");
    private Image shadow_fiend = new Image("view/images/monsters/shadow_fiend.png");
    private Image skeletal_dragon = new Image("view/images/monsters/skeletal_dragon.png");
    private Image skeletal_warrior = new Image("view/images/monsters/skeletal_warrior.png");
    private Image snorg = new Image("view/images/monsters/snorg.png");
    private Image soldier_ant = new Image("view/images/monsters/soldier_ant.png");
    private Image spectral_warrior = new Image("view/images/monsters/spectral_warrior.png");
    private Image storm_giant = new Image("view/images/monsters/storm_giant.png");
    private Image succubus = new Image("view/images/monsters/succubus.png");
    private Image tengu = new Image("view/images/monsters/tengu.png");
    private Image tiger = new Image("view/images/monsters/tiger.png");
    private Image titan = new Image("view/images/monsters/titan.png");
    private Image two_headed_ogre = new Image("view/images/monsters/two_headed_ogre.png");
    private Image unseen_horror = new Image("view/images/monsters/unseen_horror.png");
    private Image vampire = new Image("view/images/monsters/vampire.png");
    private Image vampire_bat = new Image("view/images/monsters/vampire_bat.png");
    private Image vampire_lord = new Image("view/images/monsters/vampire_lord.png");
    private Image vault_guardian = new Image("view/images/monsters/vault_guardian.png");
    private Image wraith = new Image("view/images/monsters/wraith.png");
    private Image wyvern = new Image("view/images/monsters/wyvern.png");
    private Image xan = new Image("view/images/monsters/xan.png");
    private Image xtahua = new Image("view/images/monsters/xtahua.png");
    private Image yeenoghu = new Image("view/images/monsters/yeenoghu.png");
    private Image yellow_dragon = new Image("view/images/monsters/yellow_dragon.png");


    String[] monsterNames = {"ancient_lich", "antaeus", "asmodeus", "asmodeus_new", "baby_purple_worm",
            "balrug", "beholder", "black_dragon", "black_naga", "blue_death", "bone_devil", "cacodemon",
            "carnivorous_ape", "cave_spider", "centipede", "cerebov", "cyclops", "deep_elf_death_mage",
            "deep_elf_fighter", "dispater", "dragon", "dwarf_king", "dwarf_lord", "efreet", "ereshkigal",
            "ettin", "ettin_new", "executioner", "eye_of_devastation", "fiend", "fire_giant", "flying_skull",
            "frost_giant", "gargoyle", "geryon", "ghoul", "giant_spider", "gloorx_vloq", "gnome_king",
            "gnomish_wizard", "golden_dragon", "gremlin", "hill_giant", "homunculus", "hydra", "ice_fiend",
            "imp", "incubus", "iron_dragon", "iron_troll", "killer_bee", "leprechaun", "lich", "lich_old",
            "lom_lobon", "manes", "manticore", "manticore_new", "minotaur", "mnoleg", "moth_of_wrath",
            "nazgul", "ogre_lord", "olog_hai", "orb_guardian", "orc_high_priest", "orc_shaman", "orc_warrior",
            "pit_fiend", "plains_centaur", "python", "quasit", "queen_ant", "quicksilver_dragon", "redback",
            "red_dragon", "rock_troll", "sandestin", "sasquatch", "scorpion", "serpent_of_hell", "shadow_dragon",
            "shadow_fiend", "skeletal_dragon", "skeletal_warrior", "snorg", "soldier_ant", "spectral_warrior",
            "storm_giant", "succubus", "tengu", "tiger", "titan", "two_headed_ogre", "unseen_horror", "vampire",
            "vampire_bat", "vampire_lord", "vault_guardian", "wraith", "wyvern", "xan", "xtahua", "yeenoghu",
            "yellow_dragon"};

    Image[] monsterPics = {ancient_lich, antaeus, asmodeus, asmodeus_new, baby_purple_worm, balrug,
            beholder, black_dragon, black_naga, blue_death, bone_devil, cacodemon, carnivorous_ape, cave_spider,
            centipede, cerebov, cyclops, deep_elf_death_mage, deep_elf_fighter, dispater, dragon, dwarf_king,
            dwarf_lord, efreet, ereshkigal, ettin, ettin_new, executioner, eye_of_devastation, fiend,
            fire_giant, flying_skull, frost_giant, gargoyle, geryon, ghoul, giant_spider, gloorx_vloq,
            gnome_king, gnomish_wizard, golden_dragon, gremlin, hill_giant, homunculus, hydra, ice_fiend,
            imp, incubus, iron_dragon, iron_troll, killer_bee, leprechaun, lich, lich_old, lom_lobon,
            manes, manticore, manticore_new, minotaur, mnoleg, moth_of_wrath, nazgul, ogre_lord, olog_hai,
            orb_guardian, orc_high_priest, orc_shaman, orc_warrior, pit_fiend, plains_centaur, python,
            quasit, queen_ant, quicksilver_dragon, redback, red_dragon, rock_troll, sandestin, sasquatch,
            scorpion, serpent_of_hell, shadow_dragon, shadow_fiend, skeletal_dragon, skeletal_warrior,
            snorg, soldier_ant, spectral_warrior, storm_giant, succubus, tengu, tiger, titan, two_headed_ogre,
            unseen_horror, vampire, vampire_bat, vampire_lord, vault_guardian, wraith, wyvern, xan, xtahua,
            yeenoghu, yellow_dragon};

    HashMap<String, Image> monsterPicsMap = new HashMap<>();
    private int itemCount;

    public MonsterPics() {
        createPictureMap();
        this.itemCount = 0;
    }

    private void createPictureMap() {
        for(int n = 0; n < monsterNames.length; n++) {
            for(int p = 0; p < monsterPics.length; p++) {
               this.monsterPicsMap.put(monsterNames[n], monsterPics[p]);
            }
        }
    }

    public Image getNextItem() {
        if (this.itemCount < this.monsterPics.length)
        {
            return this.monsterPics[this.itemCount++];
        }
        else
        {
            this.itemCount = 0;
            return this.monsterPics[itemCount++];
        }
    }

}
