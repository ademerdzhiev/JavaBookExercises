package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex_14_6 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        GridPane gridPane = new GridPane();

        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j++) {
                Rectangle rectangle = new Rectangle(i*100, j*100, 100, 100);

                if (i % 2 == 0) {
                    if (j % 2 != 0) {
                        rectangle.setFill(Color.BLACK);
                    } else if (j % 2 == 0) {
                        rectangle.setFill(Color.WHITE);
                    }
                } else if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        rectangle.setFill(Color.BLACK);
                    } else if (j % 2 != 0) {
                        rectangle.setFill(Color.WHITE);
                    }
                }

                gridPane.add(rectangle, i, j);
            }
        }

        Scene scene = new Scene(gridPane, 1000, 1000);

        stage.setScene(scene);
        stage.setTitle("Chess Board");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
