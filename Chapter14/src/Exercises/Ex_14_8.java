package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex_14_8 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();

        int num = 1;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {

                String path = "images/card/" + num +".png";
                Image image = new Image(path);

                gridPane.add(new ImageView(image), j, i);

                num++;

            }
        }

        Scene scene = new Scene(gridPane);

        stage.setScene(scene);
        stage.setTitle("SHOW CARDS");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
