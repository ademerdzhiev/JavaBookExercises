package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex_14_22 extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        Pane pane = new Pane();

        Scene scene = new Scene(pane,450, 450);


        double paneWidth = scene.getWidth() - 15;
        double paneHeight = scene.getHeight() - 15;

        double centerX1 = Math.random()*paneWidth;
        double centerY1 = Math.random()*paneHeight;

        double centerX2 = Math.random()*paneWidth;
        double centerY2 = Math.random()*paneHeight;

        conncectCircles(centerX1, centerY1, centerX2, centerY2, pane);

        stage.setScene(scene);
        stage.setTitle("CONNECT MY CIRCLES");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static void conncectCircles(double centerX1, double centerY1, double centerX2, double centerY2, Pane pane) {
        double radius = 15;

        Circle circle1 = new Circle(centerX1, centerY1, radius);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle(centerX2, centerY2, radius);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);


        double slope = (centerY1 - centerY2)/(centerX1 - centerX2);
        double arctan = Math.atan(slope);


        double startX = centerX1 + Math.cos(arctan)*radius;
        double startY = centerY1 + Math.sin(arctan)*radius;

        double endX = centerX2 - Math.cos(arctan)*radius;
        double endY = centerY2 - Math.sin(arctan)*radius;


        if (centerX1 > centerX2) {
            startX = centerX1 - Math.cos(arctan)*radius;
            startY = centerY1 - Math.sin(arctan)*radius;

            endX = centerX2 + Math.cos(arctan)*radius;
            endY = centerY2 + Math.sin(arctan)*radius;
        }


        Text text1 = new Text(centerX1, centerY1, "1");
        Text text2 = new Text(centerX2, centerY2, "2");

        Line line = new Line(startX, startY, endX, endY);

        pane.getChildren().addAll(circle1, circle2, line, text1, text2);
    }
}
