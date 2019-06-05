package Listings;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Listing_14_10 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setVgap(5);
        flowPane.setHgap(5);

        flowPane.getChildren().addAll(new Label("First Name"),
                new TextField(), new Label("MI"));

        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        flowPane.getChildren().addAll(tfMi, new Label("Last Name"),
                new TextField());

        Scene scene = new Scene(flowPane, 200, 250);
        stage.setScene(scene);
        stage.setTitle("ShowFlowPanes");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
