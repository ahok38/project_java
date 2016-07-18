package view;

import java.util.Random;

import dungeon.DnDmodel;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.TimerTask;

/**
 * Created by andreas on 13.06.16.
 */
public class DnDcontrol {


    private Scene scene;
    private Stage primaryStage;
    private String currentWorkDir;

    //@FXML
    //private Text blah;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchor"
    private AnchorPane anchor; // Value injected by FXMLLoader

    @FXML // fx:id="exit"
    private Button exit; // Value injected by FXMLLoader

    @FXML // fx:id="go_ahead"
    private Button go_ahead; // Value injected by FXMLLoader

    @FXML // fx:id="go_back"
    private Button go_back; // Value injected by FXMLLoader

    @FXML // fx:id="go_right"
    private Button go_right; // Value injected by FXMLLoader

    @FXML // fx:id="go_left"
    private Button go_left; // Value injected by FXMLLoader

    @FXML // fx:id="topLabel"
    private Label topLabel; // Value injected by FXMLLoader
    private DnDmodel model;

    @FXML // fx:id="pick_up  // stuff injected by me, tito, master of all things grok
    private Button pick_up;

    @FXML // fx:id="messageWindow"
    private TextArea messageWindow;  // also done by hand, does this work?

    @FXML // fx:id="attack"
    private Button attack;

    @FXML // fx:id="infoPic"
    private ImageView infoPic;

    @FXML // fx:id="weaponPic"
    private ImageView weaponPic;

    @FXML // fx:id="armorPic"
    private ImageView armorPic;

    @FXML // fx:id="testButton"
    private Button testButton;

    @FXML // fx:id="new_game"
    private Button new_game;

    @FXML // fx:id="clic"
    private Button clic;


    /**
     * Init control
     */
    public DnDcontrol(Stage primaryStage) {

        this.primaryStage = primaryStage;
        init();
        primaryStage.setResizable(false);
    }


    /**
     * Initialises the main window (no exception in constructor!)
     */
    private void init() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DnDMainWindow.fxml"));
        fxmlLoader.setController(this);

        try {
            Scene scene = new Scene(fxmlLoader.load());
            this.scene = scene;
            scene.getStylesheets().add("/view/styles.css");

            messageWindow.setEditable(false);   // --> player can't change the messages on-screen (thorsten)
            this.currentWorkDir = System.getProperty("user.home");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setModel(DnDmodel game) {

        this.model = game;
    }

    /**
     * Displays the main window
     */
    public void showAndWait() {

        // setting the stage
        this.primaryStage.setScene(this.scene);
        this.primaryStage.setTitle("DnD");
        this.primaryStage.show();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'DnDMainWindow.fxml'.";
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'DnDMainWindow.fxml'.";
        assert go_ahead != null : "fx:id=\"go_ahead\" was not injected: check your FXML file 'DnDMainWindow.fxml'.";
        assert go_back != null : "fx:id=\"go_back\" was not injected: check your FXML file 'DnDMainWindow.fxml'.";
        assert go_right != null : "fx:id=\"go_right\" was not injected: check your FXML file 'DnDMainWindow.fxml'.";
        assert go_left != null : "fx:id=\"go_left\" was not injected: check your FXML file 'DnDMainWindow.fxml'.";
        assert topLabel != null : "fx:id=\"topLabel\" was not injected: check your FXML file 'DnDMainWindow.fxml'.";
        // assert attack != null : "fx:id=\"attack\" was not injected: check your FXML file 'DnDMainWindow.fxml'."; // added manually

        /*
         * For each button: Assign function to action
         * (function must be defined in this or another class)
         */
        exit.setOnAction(this::exitPressed);
        go_ahead.setOnAction(this::go_aheadPressed);
        go_left.setOnAction(this::go_leftPressed);
        go_right.setOnAction(this::go_rightPressed);
        go_back.setOnAction(this::go_backPressed);
        attack.setOnAction(this::attackPressed);
        pick_up.setOnAction(this::pick_upPressed);
        testButton.setOnAction(this::testButtonPressed);
        new_game.setOnAction(this::new_gamePressed);
        clic.setOnAction(this::clicPressed);

        // nope...: fw.setOnAction(this::fwPressed);

    }

    // generate images for GUI

    MonsterPics monsterpics = new MonsterPics();
    WeaponPics weaponpics = new WeaponPics();
    ArmorPics armorpics = new ArmorPics();
    TreasurePics treasurepics = new TreasurePics();
    Image rip = new Image("/view/images/misc/grave.png");

    /**
     * Action for pressed exit button.
     * @param actionEvent
     */

    // eh.... the picture and message don't show, the program just goes to sleep and exits
    private void exitPressed(ActionEvent actionEvent) {
        infoPic.setImage(rip);
        messageWindow.appendText("\nBye bye!\n");
        pause();
        Platform.exit();        // destroys resources before exiting (calls Application.stop())
    }
    private void pause() {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException intEx) {
            Thread.currentThread().interrupt();
        }
    }

    private void pick_upPressed(ActionEvent actionEvent) {
        weaponPic.setImage(weaponpics.getNextItem());
        armorPic.setImage(armorpics.getNextItem());
    }

    //private Label testLabel;

    private void go_aheadPressed(ActionEvent actionEvent) {
        messageWindow.appendText("\nYou go north.\n");
    }

    private void go_leftPressed(ActionEvent actionEvent) {
        messageWindow.appendText("\nYou go west.\n");
    }

    private void go_rightPressed(ActionEvent actionEvent) {
        messageWindow.appendText("\nYou go east\n");
    }

    private void go_backPressed(ActionEvent actionEvent) {
        messageWindow.appendText("\nYou go south\n");
    }

    private void testButtonPressed(ActionEvent actionEvent) {
        // provide some info to this method as to which image to load (from game model)
        Random rand = new Random();
        int pic_num = rand.nextInt(monsterpics.monsterPics.length);
        changeInfoPic(pic_num);
    }

    private void new_gamePressed(ActionEvent actionEvent) {
        messageWindow.appendText("\nNah... you don't seem worthy for this epic adventure.\n");
    }

    private void clicPressed(ActionEvent actionEvent) {
        infoPic.setImage(treasurepics.getNextItem());
    }

    // implement or call the behavior expected from the game
    // when the player clicks on the "attack" button (thorsten)
    private void attackPressed(ActionEvent actionEvent) {   // test method (thorsten)
        System.out.print("\nattack pressed\n");
        Random rand = new Random();
        String[] messages = {"\nHa! Try and hit me!\n", "\nCome on, I dare you!\n",
                "\nNice one... not even close!\n", "\nFor real yo, you think I will let you beat me up?\n"};
        messageWindow.appendText(messages[rand.nextInt(messages.length)]);
    }

    // need an array/ list of images to choose from based on some
    // condition (e.g. map coordinates)
    // or supply the id of the image to show as a parameter of the function call
    private void changeInfoPic(int pic_num) {

        infoPic.setImage(monsterpics.monsterPics[pic_num]);
    }


}
