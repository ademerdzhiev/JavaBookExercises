package Listings;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Listing_14_13 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(getHbox());
        borderPane.setBottom(getVbox());

        Scene scene = new Scene(borderPane);
        stage.setTitle("VboxHBox");
        stage.setScene(scene);


        stage.show();
    }

    private HBox getHbox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: blue");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Physics"));

        ImageView imageView = new ImageView(new Image("RussianF.png"));

        hBox.getChildren().add(imageView);

        return hBox;
    }


    private VBox getVbox() {
        VBox vBox = new VBox(15);

        vBox.setPadding(new Insets(15, 15, 15, 15));
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CS_Physics"), new Label("CS_Math"), new Label("CS_Java")};

        for (Label label : courses) {
            vBox.getChildren().add(label);
        }

        return  vBox;
    }



    public static void main(String[] args) {
        launch();
    }
}
