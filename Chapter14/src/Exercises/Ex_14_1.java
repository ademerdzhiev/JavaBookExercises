package Exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex_14_1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(12.0, 12.0, 12.0, 12.0));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(new ImageView(new Image("images/china.gif")), 0, 0);
        gridPane.add(new ImageView(new Image("images/Russia.gif")), 1, 0);
        gridPane.add(new ImageView(new Image("images/denmark.gif")), 0, 1);
        gridPane.add(new ImageView(new Image("images/introjb4.jpg")), 1, 1);



        Scene scene = new Scene(gridPane, 500, 500);
        stage.setTitle("FLAGS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
