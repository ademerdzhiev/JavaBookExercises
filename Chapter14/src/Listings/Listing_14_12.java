package Listings;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Listing_14_12 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();

        borderPane.setTop(new CustomPane("Top"));
        borderPane.setBottom(new CustomPane("Bottom"));
        borderPane.setLeft(new CustomPane("Left"));
        borderPane.setRight(new CustomPane("Right"));
        borderPane.setCenter(new CustomPane("Center"));

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("BorderPane");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class CustomPane extends StackPane {
    public CustomPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: red");
            setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}
