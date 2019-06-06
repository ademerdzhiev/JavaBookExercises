package Exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex_14_2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(12, 12, 12, 12));
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double rand = Math.random();
                if (Math.random() < 0.5) {
                    ImageView imageView = new ImageView(new Image("images/x.gif"));
                    gridPane.add(imageView, i, j);
                } else if (Math.random() >= 0.5) {
                    ImageView imageView = new ImageView(new Image("images/o.gif"));
                    gridPane.add(imageView, i, j);
                }
            }
        }


        Scene scene = new Scene(gridPane, 400, 400);

        stage.setScene(scene);
        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
