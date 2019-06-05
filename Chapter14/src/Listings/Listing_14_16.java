package Listings;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Listing_14_16 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setFill(Color.WHITE);
        r1.setStroke(Color.BLUE);

        Rectangle r2 = new Rectangle(25, 50, 60, 30);

        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setArcHeight(25);
        r3.setArcWidth(15);

        Group group = new Group();
        group.getChildren().addAll(new Text(10, 27, "r1"), r1, new Text(10, 67, "r2"), r2
                , new Text(10, 107, "r3"), r3);

        for (int i = 0; i < 4; i++) {
            Rectangle r  = new Rectangle(100, 50, 100, 30);
            r.setRotate(i*360/8);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            r.setFill(Color.WHITE);
            group.getChildren().add(r);

        }

        group.setScaleX(2);
        group.setScaleY(2);

        Scene scene = new Scene(new BorderPane(group), 500, 300);

        stage.setScene(scene);
        stage.setTitle("Rectangle");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
