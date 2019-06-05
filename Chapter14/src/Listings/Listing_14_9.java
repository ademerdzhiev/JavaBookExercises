package Listings;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Listing_14_9 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(10, 50000, 50000000, 5));
        //((HBox) pane).setSpacing(100);
        Image image1 = new Image("russianF.png");
        ImageView imageView1 = new ImageView(image1);

        ImageView imageView2 = new ImageView(new Image("russianF.png"));
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(200);

        ImageView imageView3 = new ImageView(new Image("russianF.png"));

        imageView3.setRotate(30);

        pane.getChildren().add(imageView1);

        pane.getChildren().add(imageView2);

        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);

        stage.show();


    }
}
