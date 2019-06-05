package Listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Listing_14_7 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        Circle circle = new Circle();
        circle.setCenterY(0);
        circle.setCenterY(0);
        circle.setRadius(60);
        Button btOk = new Button("OK");
        circle.setStyle("-fx-stroke: blue; -fx-fill: white;");

        pane.getChildren().add(circle);
        System.out.println(pane.contains(200, 200));
        pane.setRotate(60);
//        pane.setScaleX(4);
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.setTitle("RotateDemo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
