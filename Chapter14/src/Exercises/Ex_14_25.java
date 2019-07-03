package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ex_14_25 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        double paneWidth = 450;
        double paneHeight = 300;

        Circle circle = new Circle(paneWidth/2, paneHeight/2, 100);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLUE);

        pane.getChildren().addAll(circle);

        Scene scene = new Scene(pane, 450, 300);
        stage.setScene(scene);
        stage.setTitle("Random Points on a circle");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static List<Pair<Double, Double>> generateRandomPoints(double maxX, double maxY, double radius) {
        List<Pair<Double, Double>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            while (true) {
                double x = (double) (Math.random()*maxX - (maxX - radius) + (maxX - radius));
                double y = (double) (Math.random()*maxY - (maxY - radius) + (maxY - radius));



                if()

            }
        }

        return list;
    }
}
