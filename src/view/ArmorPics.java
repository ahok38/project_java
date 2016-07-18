package view;

import javafx.scene.image.Image;

import java.util.HashMap;

/**
 * Created by tito on 17.07.16.
 */
public class ArmorPics {

    private Image animal_skin = new Image("/view/images/armor/animal_skin.png");
    private Image banded_mail = new Image("/view/images/armor/banded_mail.png");
    private Image breast_plate = new Image("/view/images/armor/breast_plate.png");
    private Image cloak = new Image("/view/images/armor/cloak.png");
    private Image dragon_armor = new Image("/view/images/armor/dragon_armor.png");
    private Image dwarvish_cloak = new Image("/view/images/armor/dwarvish_cloak.png");
    private Image dwarvish_mithril_coat = new Image("/view/images/armor/dwarvish_mithril_coat.png");
    private Image elven_mithril_coat = new Image("/view/images/armor/elven_mithril_coat.png");
    private Image leather_armor = new Image("/view/images/armor/leather_armor.png");
    private Image opera_cloak = new Image("/view/images/armor/opera_cloak.png");
    private Image orcish_chain_mail = new Image("/view/images/armor/orcish_chain_mail.png");
    private Image splint_mail = new Image("/view/images/armor/splint_mail.png");

    String[] armorNames = {"animal_skin", "banded_mail", "breast_plate", "cloak", "dragon_armor",
        "dwarvish_cloak", "dwarvish_mithril_coat", "elven_mithril_coat", "leather_armor",
        "opera_cloak", "orcish_chain_mail", "splint_mail"};

    Image[] armorPics = {animal_skin, banded_mail, breast_plate, cloak, dragon_armor, dwarvish_cloak,
        dwarvish_mithril_coat, elven_mithril_coat, leather_armor, opera_cloak, orcish_chain_mail,
        splint_mail};

    HashMap<String, Image> armorPicsMap = new HashMap<>();
    private int itemCount;

    public ArmorPics() {
        this.itemCount = 0;
        createPictureMap();
    }

    private void createPictureMap() {
        for(int n = 0; n < armorNames.length; n++) {
            for(int p = 0; p < armorPics.length; p++) {
                this.armorPicsMap.put(armorNames[n], armorPics[p]);
            }
        }
    }

    public Image getNextItem() {
        if(this.itemCount < this.armorPics.length)
        {
            return this.armorPics[this.itemCount++];
        }
        else
        {
            this.itemCount = 0;
            return this.armorPics[itemCount++];
        }
    }
}
