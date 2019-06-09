package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex_14_5 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        String[] string = "JavaFX Learning".split("");

        double centerX = 400;
        double centerY = 400;
        double radius = Math.min(800, 800)*0.8*0.5;

        Circle circle = new Circle(centerX, centerY, radius);


        for (int i = string.length -1; i >= 0; i--) {
            Text label = new Text(centerX -  radius*Math.cos(i*2*Math.PI/(string.length+1) + Math.PI/5),  centerY -
                    radius*Math.sin(i*2*Math.PI/(string.length+1) + Math.PI/5) ,string[i]);

            label.setRotate(i*180/(string.length));
            label.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 100));
            pane.getChildren().add(label);
        }

        Scene scene = new Scene(pane, 800, 800);

        stage.setScene(scene);
        stage.setTitle("Round Text");
        stage.show();


    }




    public static void main(String[] args) {
        launch();
    }
}
