package com.company.scenes;

import com.company.Character;
import com.company.factories.CharacterFactory;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    RESOURCES:
        Art: https://opengameart.org/
        Icons: https://game-icons.net/
        Forms: https://docs.oracle.com/javafx/2/get_started/form.htm
        Charts: https://docs.oracle.com/javafx/2/charts/chart-overview.htm#CJAHHJCB
        3D Graphics: https://docs.oracle.com/javase/8/javafx/graphics-tutorial/javafx-3d-graphics.htm#JFXGR256
        Canvas: https://docs.oracle.com/javase/8/javafx/graphics-tutorial/canvas.htm#JFXGR214
        Animations: https://docs.oracle.com/javase/8/javafx/visual-effects-tutorial/basics.htm#CIHHAACG
        Threading: https://docs.oracle.com/javase/8/javafx/interoperability-tutorial/concurrency.htm#JFXIP546
 */

public class UserInterface extends Application {

    private Image heroImage = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    private Image helper1Image = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    private Image helper2Image = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    private Image helper3Image = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    private Image enemy1Image = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    private Image enemy2Image = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    private Image enemy3Image = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    private Image enemy4Image = new Image("com/company/scenes/resources/Template.png", 64, 0, true, true);
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        int inputRow = 6;
        int titleRow = 0;
        int canvasRow = 2;//spans 3 rows (2, 3, and 4)
        //leave rows 1 and 5 as gaps

        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        //grid.setAlignment(Pos.CENTER);
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        //grid.setPadding(new Insets(25,25,25,25));
        grid.setId("grid");

        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 7, 3, 1);

        Scene scene = new Scene(grid, 500, 500);
        scene.getStylesheets().add(UserInterface.class.getResource("UserInterface.css").toExternalForm());
        primaryStage.setScene(scene);

        TextField userTextField = new TextField();
        userTextField.setMaxWidth(150);
        userTextField.setMinWidth(150);
        userTextField.setId("userText");
        Tooltip t = new Tooltip("Enter Name");
        userTextField.setTooltip(t);
        grid.add(userTextField, 0, 0, 2, 1);

        ImageView heroIV = new ImageView();
        heroIV.setImage(heroImage);
        grid.add(heroIV, 0, 1);

        ImageView helper1IV = new ImageView();
        helper1IV.setImage(helper1Image);
        grid.add(helper1IV, 0, 2);

        ImageView helper2IV = new ImageView();
        helper2IV.setImage(helper2Image);
        grid.add(helper2IV, 0, 3);

        ImageView helper3IV = new ImageView();
        helper3IV.setImage(helper3Image);
        grid.add(helper3IV, 0, 4);

        TextArea gameTextField = new TextArea();
        int gtFieldSize = 300;
        gameTextField.setMinHeight(gtFieldSize);
        gameTextField.setMaxHeight(gtFieldSize);
        gameTextField.setMinWidth(gtFieldSize);
        gameTextField.setMaxWidth(gtFieldSize);
        gameTextField.setId("gameField");
        gameTextField.setWrapText(true);
        grid.add(gameTextField, 1, 1, 4, 4);

        ObservableList<String> options = FXCollections.observableArrayList(
                "Wizard","Bard","Berserker","Dragonborn","Elf",
                "Monk","Priest","Warrior","Samurai","Hacker","Robot"
        );
        final ComboBox comboBox = new ComboBox(options);
        comboBox.setValue("Race");
        comboBox.setMinWidth(150);
        comboBox.setMaxWidth(150);
        comboBox.setId("combobox");
        grid.add(comboBox,2, 0, 2, 1);

        Button btn = new Button("Create");
        btn.setMinWidth(150);
        btn.setMaxWidth(150);
        grid.add(btn, 4, 0, 2, 1);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                actiontarget.setId("actiontarget");
                Character hero = new CharacterFactory().spawnCharacter(comboBox.getValue().toString(), userTextField.getText());
                actiontarget.setText("You created: " + hero.getName() + ", a " + hero.getRace() + " at (" +
                        hero.getX() + "," + hero.getY() + ") WOW!");
                Image img = new Image("com/company/scenes/resources/" + hero.getRace() + ".png",
                        64, 0, true, true);
                ImageView iv = new ImageView();
                iv.setImage(img);
                heroIV.setImage(img);
                //grid.add(iv, 1, 1);
            }
        });

        primaryStage.show();
    }
}
