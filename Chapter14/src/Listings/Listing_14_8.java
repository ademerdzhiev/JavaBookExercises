package Listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Listing_14_8 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        Circle circle = new Circle();
        circle.setRadius(50);
//        circle.setCenterY(0);
//        circle.setCenterX(0);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        Label label = new Label("JAVA FX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        pane.getChildren().add(label);

        Scene scene = new Scene(pane, 200, 200);

        stage.setTitle("FONT DEMO");
        stage.setScene(scene);

        for (String fontName : Font.getFontNames()) {
            System.out.println(fontName);
        }

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
