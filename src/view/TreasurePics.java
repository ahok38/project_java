package view;

import javafx.scene.image.Image;

import java.util.HashMap;

/**
 * Created by tito on 17.07.16.
 */
public class TreasurePics {

    private Image book_of_the_dead = new Image("/view/images/treasure/book_of_the_dead.png");
    private Image candelabrum = new Image("/view/images/treasure/candelabrum.png");
    private Image celtic_amulet = new Image("/view/images/treasure/celtic_amulet.png");
    private Image chest = new Image("/view/images/treasure/chest.png");
    private Image credit_card = new Image("/view/images/treasure/credit_card.png");
    private Image crystal_ball = new Image("/view/images/treasure/crystal_ball.png");
    private Image diamond = new Image("/view/images/treasure/diamond.png");
    private Image emerald = new Image("/view/images/treasure/emerald.png");
    private Image gold = new Image("/view/images/treasure/gold.png");
    private Image jade_ring = new Image("/view/images/treasure/jade_ring.png");
    private Image ruby_ring = new Image("/view/images/treasure/ruby_ring.png");
    private Image sapphire = new Image("/view/images/treasure/sapphire.png");
    private Image sapphire_ring = new Image("/view/images/treasure/sapphire_ring.png");
    private Image shiny_ring = new Image("/view/images/treasure/shiny_ring.png");
    private Image skeleton_key = new Image("/view/images/treasure/skeleton_key.png");
    private Image spectral_amulet = new Image("/view/images/treasure/spectral_amulet.png");
    private Image spellbook = new Image("/view/images/treasure/spellbook.png");
    private Image trumpet = new Image("/view/images/treasure/trumpet.png");
    private Image unicorn_horn = new Image("/view/images/treasure/unicorn_horn.png");
    private Image violet_gem = new Image("/view/images/treasure/violet_gem.png");

    String[] treasureNames = {"book_of_the_dead", "candelabrum", "celtic_amulet", "chest", "credit_card",
        "crystal_ball", "diamond", "emerald", "gold", "jade_ring", "ruby_ring", "sapphire", "sapphire_ring",
        "shiny_ring", "skeleton_key", "spectral_amulet", "spellbook", "trumpet", "unicorn_horn", "violet_gem"};

    Image[] treasurePics = {book_of_the_dead, candelabrum, celtic_amulet, chest, credit_card, crystal_ball,
        diamond, emerald, gold, jade_ring, ruby_ring, sapphire, sapphire_ring, shiny_ring, skeleton_key,
        spectral_amulet, spellbook, trumpet, unicorn_horn, violet_gem};

    HashMap<String, Image> treasurePicsMap = new HashMap<>();
    private int itemCount;

    public TreasurePics() {
        createPictureMap();
    }

    private void createPictureMap() {
        for(int n = 0; n < treasureNames.length; n++) {
            for(int p = 0; p < treasurePics.length; p++) {
                this.treasurePicsMap.put(treasureNames[n], treasurePics[p]);
            }
        }
    }
    public Image getNextItem() {
        if(this.itemCount < this.treasurePics.length)
        {
            return this.treasurePics[this.itemCount++];
        }
        else
        {
            this.itemCount = 0;
            return this.treasurePics[itemCount++];
        }
    }

}
