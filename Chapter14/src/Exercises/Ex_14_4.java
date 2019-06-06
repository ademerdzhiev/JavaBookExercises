package Exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ex_14_4 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(12, 12, 12, 12));
        hBox.setSpacing(5);

        Label label1 = new Label("JAVA FX");
        label1.setRotate(90);
        label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        label1.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Label label2 = new Label("JAVA FX");
        label2.setRotate(90);
        label2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        label2.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Label label3 = new Label("JAVA FX");
        label3.setRotate(90);
        label3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        label3.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Label label4 = new Label("JAVA FX");
        label4.setRotate(90);
        label4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        label4.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        Label label5 = new Label("JAVA FX");
        label5.setRotate(90);
        label5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        label5.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

        hBox.getChildren().addAll(label1, label2, label3, label4, label5);

        hBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(hBox, 800, 800);

        stage.setScene(scene);
        stage.setTitle("SHOW TEXT");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
