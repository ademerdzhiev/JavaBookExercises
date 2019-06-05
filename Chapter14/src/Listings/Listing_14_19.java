package Listings;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Listing_14_19 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new MyPolygon(), 400, 400);
        stage.setScene(scene);
        stage.setTitle("Polygon");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    class MyPolygon extends Pane {
        private void paint() {
            Polygon polygon = new Polygon();
            polygon.setFill(Color.BLUE);
            polygon.setStroke(Color.BLACK);
            ObservableList<Double> list = polygon.getPoints();

            double centerX = getWidth()/2;
            double centerY = getHeight()/2;
            double radius = Math.min(getWidth(), getHeight())*0.4;

            for (int i = 0; i < 6; i ++) {
                list.add(centerX + radius*Math.cos(2*i* Math.PI/6));
                list.add(centerY - radius*Math.sin(2*i*Math.PI/6));
            }

            getChildren().clear();
            getChildren().add(polygon);
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
}
