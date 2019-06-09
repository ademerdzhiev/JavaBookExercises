package Exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ex_14_7 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(12, 12, 12, 12));

        gridPane.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-padding: 2; -fx-hgap: 7;" +
                " -fx-vgap: 7; -fx-background-color: lightgray");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String num = String.valueOf(zeroOrOne());
                TextField text = new TextField(num);
                text.setPrefWidth(40);
                text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));

                gridPane.add(text, i, j);
            }
        }

        Scene scene = new Scene(gridPane);

        stage.setScene(scene);
        stage.setTitle("remdom o and 1");
        stage.show();
    }

    public static int zeroOrOne() {
        double num = Math.random();
        if (num < 0.5 ) {
            return 0;
        } else if (num >= 0.5) {
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        launch();
    }
}
