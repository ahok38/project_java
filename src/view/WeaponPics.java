package view;

import javafx.scene.image.Image;

import java.util.HashMap;

/**
 * Created by tito on 17.07.16.
 */
public class WeaponPics {

    private Image athame = new Image("/view/images/weapons/athame.png");
    private Image battle_axe1 = new Image("/view/images/weapons/battle_axe1.png");
    private Image battle_axe2 = new Image("/view/images/weapons/battle_axe2.png");
    private Image boomerang = new Image("/view/images/weapons/boomerang.png");
    private Image broadsword = new Image("/view/images/weapons/broadsword.png");
    private Image copper = new Image("/view/images/weapons/copper.png");
    private Image crysknife = new Image("/view/images/weapons/crysknife.png");
    private Image demon_trident = new Image("/view/images/weapons/demon_trident.png");
    private Image elven_bow = new Image("/view/images/weapons/elven_bow.png");
    private Image hammer = new Image("/view/images/weapons/hammer.png");
    private Image morningstar = new Image("/view/images/weapons/morningstar.png");
    private Image orcish_bow = new Image("/view/images/weapons/orcish_bow.png");
    private Image sabre = new Image("/view/images/weapons/sabre.png");
    private Image scimitar = new Image("/view/images/weapons/scimitar.png");
    private Image scythe = new Image("/view/images/weapons/scythe.png");
    private Image staff1 = new Image("/view/images/weapons/staff1.png");
    private Image staff2 = new Image("/view/images/weapons/staff2.png");
    private Image sword1 = new Image("/view/images/weapons/sword1.png");
    private Image sword2 = new Image("/view/images/weapons/sword2.png");
    private Image tin = new Image("/view/images/weapons/tin.png");

    String[] weaponNames = {"athame", "battle_axe1", "battle_axe2", "boomerang", "broadsword", "copper",
        "crysknife", "demon_trident", "elven_bow", "hammer", "morningstar", "orcish_bow", "saber", "scimitar",
        "scythe", "staff1", "staff2", "sword1", "sword2", "tin"};

    Image[] weaponPics = {athame, battle_axe1, battle_axe2, boomerang, broadsword, copper, crysknife,
        demon_trident, elven_bow, hammer, morningstar, orcish_bow, sabre, scimitar, scythe, staff1, staff2,
        sword1, sword2, tin};

    HashMap<String, Image> weaponPicsMap = new HashMap<>();
    private int itemCount;

    public WeaponPics() {
        createPictureMap();
        this.itemCount = 0;
    }

    private void createPictureMap() {
        for(int n = 0; n < weaponNames.length; n++) {
            for(int p = 0; p < weaponPics.length; p++) {
                this.weaponPicsMap.put(weaponNames[n], weaponPics[p]);
            }
        }
    }

    public Image getNextItem() {
        if (this.itemCount < this.weaponPics.length)
        {
            return this.weaponPics[this.itemCount++];
        }
        else
        {
            this.itemCount = 0;
            return this.weaponPics[itemCount++];
        }
    }
}
