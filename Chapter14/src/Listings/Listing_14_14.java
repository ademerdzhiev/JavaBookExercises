package Listings;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Listing_14_14 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5 , 5, 5));

        Text text1 = new Text(20, 20, "Programming is fun");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        text1.setStrikethrough(true);

        Text text2 = new Text(60, 60,"Programming is fun");
        text2.setFont(Font.font("LiberationSheriff", FontWeight.BOLD, FontPosture.REGULAR, 17));
        text2.setUnderline(true);

        Text text3 = new Text(80, 100, "Programming is fun");
        text3.setFont(Font.font("Arial", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC, 16));

        pane.getChildren().addAll(text1, text2, text3);

        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.setTitle("Font");
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }
}
