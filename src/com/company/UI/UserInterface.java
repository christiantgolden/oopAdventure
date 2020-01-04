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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.nio.file.attribute.UserPrincipalNotFoundException;

/*
    RESOURCES:
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

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 5);

        Scene scene = new Scene(grid, 500, 500);
        scene.getStylesheets().add(UserInterface.class.getResource("UserInterface.css").toExternalForm());
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, titleRow, 2, 1);

        Label userName = new Label("Character Name: ");
        grid.add(userName, 0, inputRow);

        TextField userTextField = new TextField();
        userTextField.setMaxWidth(150);
        grid.add(userTextField, 1, inputRow);

        /*Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        grid.add(canvas, 1, 3, 3, 3);*/

        Image img = new Image("com/company/UI/resources/sprites/player/base/centaur_brown_female.png",
                100, 0, true, true);
        ImageView iv = new ImageView();
        iv.setImage(img);
        grid.add(iv, 1, 4);


        //grid.setGridLinesVisible(true);

        ObservableList<String> options = FXCollections.observableArrayList(
                "Wizard","Bard","Berserker","Dragonborn","Elf",
                "Monk","Priest","Warrior"
        );
        final ComboBox comboBox = new ComboBox(options);
        comboBox.setValue("Race");
        comboBox.setMinWidth(100);
        comboBox.setMaxWidth(100);
        comboBox.setId("combobox");
        grid.add(comboBox,2, inputRow);

        Button btn = new Button("Create");
        btn.setMinWidth(100);
        btn.setMaxWidth(100);
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 3, inputRow);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                actiontarget.setId("actiontarget");
                Character hero = new CharacterFactory().spawnCharacter(comboBox.getValue().toString(), userTextField.getText());
                actiontarget.setText("You created: " + hero.getName() + ", a " + hero.getRace() + " at (" +
                        hero.getX() + "," + hero.getY() + ")");
            }
        });

        primaryStage.show();
    }
    private void drawShapes(GraphicsContext gc){
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                new double[]{210, 210, 240, 240}, 4);
    }
}
