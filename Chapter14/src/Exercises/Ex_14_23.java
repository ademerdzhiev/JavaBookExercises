package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Ex_14_23 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of the first rectangle:/n");
        double centerX1 = Double.valueOf(scanner.nextLine());
        double centerY1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter the width and the height of the first rectangle:/n");
        double width1 = Double.valueOf(scanner.nextLine());
        double height1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter coordinates of the second rectangle:/n");
        double centerX2 = Double.valueOf(scanner.nextLine());
        double centerY2 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter the width and the height of the second rectangle:/n");
        double width2 = Double.valueOf(scanner.nextLine());
        double height2 = Double.valueOf(scanner.nextLine());

        Rectangle rectangle1 = drawRectangle(centerX1, centerY1, width1, height1);
        Rectangle rectangle2 = drawRectangle(centerX2, centerY2, width2, height2);

        Text text = rectangularRelationship(rectangle1, rectangle2);


        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 330);

        pane.getChildren().addAll(rectangle1, rectangle2, text);

        stage.setScene(scene);
        stage.setTitle("TWO RECTANGLES");
        stage.show();

    }

    public static void main(String[] args) {


        launch(args);
    }

    private static Rectangle drawRectangle(double centerX, double centerY, double width, double height) {
        Rectangle rectangle = new Rectangle(centerX, centerY, width, height);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);

        return  rectangle;
    }

    private static Text rectangularRelationship(Rectangle rectangle1, Rectangle rectangle2) {
        if (rectangle1.contains(rectangle2.getX(), rectangle2.getY())) {
            if (rectangle1.getX() + rectangle1.getWidth() > rectangle2.getX() + rectangle2.getWidth() &&
                    rectangle1.getY() + rectangle1.getHeight() > rectangle2.getY() + rectangle2.getHeight()) {
                return new Text(20, 300, "One Rectangle Contains The Other");
            } else {
                return new Text(20, 300, "Rectangles OverLap");

            }
        }

        if (rectangle2.contains(rectangle1.getX(), rectangle1.getY())) {
            if (rectangle2.getX() + rectangle2.getWidth() > rectangle1.getX() + rectangle1.getWidth() &&
                    rectangle2.getY() + rectangle2.getHeight() > rectangle1.getY() + rectangle1.getHeight()) {
                return new Text(20, 300, "One Rectangle Contains The Other");
            } else {
                return new Text(20, 300, "Rectangles OverLap");
            }
        }


        return new Text(20, 300, "The Rectangles Do Not Overlap");
    }
}
