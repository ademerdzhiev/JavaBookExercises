package Listings;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Listing_14_11 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(12.5, 13.5, 14.5, 15.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        gridPane.add(new Label("First name: "), 0,0);
        gridPane.add(new TextField(), 1, 0);
        gridPane.add(new Label("MI: "), 0, 1);
        gridPane.add(new TextField(), 1, 1);
        gridPane.add(new Label("Last name"), 0, 2 );
        gridPane.add(new TextField(), 1, 2);

        Button bt = new Button("Enter NAME");
        gridPane.add(bt, 1, 3);
        GridPane.setHalignment(bt, HPos.RIGHT);


        Scene scene= new Scene(gridPane, 400, 400);
        stage.setScene(scene);
        stage.setTitle("ShowGridPana");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
