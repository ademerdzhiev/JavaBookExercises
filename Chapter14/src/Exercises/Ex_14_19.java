package Exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Ex_14_19 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new SineCosine());

        stage.setScene(scene);
        stage.setTitle("Sine-Cosine");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

    class SineCosine extends Pane {

        private void draw() {
            getChildren().clear();

            Line lineX = new Line(0.1*getWidth(), getHeight()/2,
                    getWidth() - 0.1*getWidth(), getHeight()/2);
            lineX.setStroke(Color.BLACK);
            getChildren().add(lineX);

            Line lineY =  new Line(getWidth()/2, 0.1*getHeight(),
                    getWidth()/2, getHeight() - 0.1*getHeight());
            lineY.setStroke(Color.BLACK);
            getChildren().add(lineY);

            Polyline polylineSine = new Polyline();
            ObservableList<Double> listSine = polylineSine.getPoints();
            double scaleFactor = 50;

            for (double x = -getWidth()/2; x <= getWidth()/2; x++) {
                listSine.add(x + 200.0);
                listSine.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
            }

            getChildren().add(polylineSine);


            Polyline polylineCosine = new Polyline();
            ObservableList<Double> listCosine = polylineCosine.getPoints();

            for (double x = -getWidth()/2; x <= getWidth()/2; x++) {
                listCosine.add(x + 200.0);
                listCosine.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
            }

            getChildren().add(polylineCosine);
        }

        @Override
        protected void setWidth(double v) {
            super.setWidth(v);
            draw();
        }

        @Override
        protected void setHeight(double v) {
            super.setHeight(v);
            draw();
        }
}
