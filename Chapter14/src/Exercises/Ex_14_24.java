package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_14_24 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 450);

        List<Double> points = enterPoints();
        Polygon polygon = new Polygon(points.get(0), points.get(1),
                points.get(2), points.get(3),
                points.get(4), points.get(5),
                points.get(6), points.get(7));

        polygon.setFill(Color.TRANSPARENT);
        polygon.setStroke(Color.BLACK);

        Text text = new Text();
        text.setX(20);
        text.setY(300);

        if (checkPoint(polygon, points.get(8), points.get(9))) {
            text.setText("point inside polygon");
        } else {
            text.setText("point outside polygon");
        }

        Circle circle = new Circle(points.get(8), points.get(9), 15);

        pane.getChildren().addAll(polygon, circle, text);

        stage.setScene(scene);
        stage.setTitle("INSIDE A POLYGON");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    private static List<Double> enterPoints() {
        Scanner scanner = new Scanner(System.in);

        List<Double> points = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter x coordinate:");
            double pointX = Double.valueOf(scanner.nextLine());

            System.out.println("Enter y coordinate:");
            double pointY = Double.valueOf(scanner.nextLine());
            points.add(pointX);
            points.add(pointY);
        }

        return points;
    }

    private static boolean checkPoint(Polygon polygon, double x, double y) {
        return polygon.contains(x, y);
    }

}
