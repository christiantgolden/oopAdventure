package com.company.UI;

import com.company.Character;
import com.company.factories.CharacterFactory;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        grid.setId("grid");

        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 7, 3, 1);

        Scene scene = new Scene(grid, 500, 500);
        scene.getStylesheets().add(UserInterface.class.getResource("UserInterface.css").toExternalForm());
        primaryStage.setScene(scene);

        TextField userTextField = new TextField();
        userTextField.setMaxWidth(150);
        userTextField.setMinWidth(150);
        //userTextField.setText("Name");
        userTextField.setId("userText");
        grid.add(userTextField, 0, 0);

        ObservableList<String> options = FXCollections.observableArrayList(
                "Wizard","Bard","Berserker","Dragonborn","Elf",
                "Monk","Priest","Warrior","Samurai","Hacker"
        );
        final ComboBox comboBox = new ComboBox(options);
        comboBox.setValue("Race");
        comboBox.setMinWidth(150);
        comboBox.setMaxWidth(150);
        comboBox.setId("combobox");
        grid.add(comboBox,1, 0);

        Button btn = new Button("Create");
        btn.setMinWidth(150);
        btn.setMaxWidth(150);
        grid.add(btn, 2, 0);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                actiontarget.setId("actiontarget");
                Character hero = new CharacterFactory().spawnCharacter(comboBox.getValue().toString(), userTextField.getText());
                actiontarget.setText("You created: " + hero.getName() + ", a " + hero.getRace() + " at (" +
                        hero.getX() + "," + hero.getY() + ")");
                Image img = new Image("com/company/UI/resources/" + hero.getRace() + ".png",
                        150, 0, true, true);
                ImageView iv = new ImageView();
                iv.setImage(img);
                grid.add(iv, 1, 1);
            }
        });

        primaryStage.show();
    }
}
