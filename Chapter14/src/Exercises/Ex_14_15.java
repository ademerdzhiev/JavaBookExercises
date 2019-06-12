package Exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ex_14_15 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new MySlowSign(), 400, 400);


        stage.setScene(scene);
        stage.setTitle("SLOW SIGN");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class MySlowSign extends StackPane {

    private void paint() {
// Create a polygon and place polygon to pane
            Polygon polygon = new Polygon();
            polygon.setFill(Color.RED);
            polygon.setStroke(Color.BLACK);
            ObservableList<Double> list = polygon.getPoints();
            double centerX = getWidth() / 2, centerY = getHeight() / 2;
            double radius = Math.min(getWidth(), getHeight()) * 0.4;
// Add points to the polygon list
            for (int i = 0; i < 8; i++) {
                list.add(centerX + radius * Math.cos(2 *(i * Math.PI / 8) + Math.PI/8));
                list.add(centerY - radius * Math.sin(2 *(i * Math.PI / 8) + Math.PI/8));
            }
            getChildren().clear();
            getChildren().add(polygon);

        Label stop = new Label("STOP");
        stop.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 70));
        stop.setTextFill(Color.WHITE);
        getChildren().add(stop);
    }


    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paint();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paint();
    }
}
