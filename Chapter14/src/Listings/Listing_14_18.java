package Listings;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Listing_14_18 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Arc arc1 = new Arc(150, 100, 80, 80, 30, 35);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(150, 100, 80, 80, 30 + 90, 35);
        arc2.setFill(Color.YELLOW);
        arc2.setStroke(Color.BLACK);
        arc2.setType(ArcType.OPEN);


        Arc arc3 = new Arc(150, 100, 80, 80, 30 + 180, 35);
        arc3.setFill(Color.BLUE);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);

        Group group = new Group();
        group.getChildren().addAll(new Text(210, 40, "arc1: round "), arc1,
                new Text(20, 40, "arc2: open "), arc2,
                new Text(20, 170, "arc3: chord "), arc3);

        Scene scene = new Scene(new BorderPane(group), 300, 200);

        stage.setTitle("ARC");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
