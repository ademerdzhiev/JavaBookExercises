package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_14_24 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 450);



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
}
