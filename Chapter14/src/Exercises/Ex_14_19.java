package Exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex_14_19 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new SineCosine(), 400, 200);

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

            Text textMinusPi = new Text(getWidth()/2 - getWidth()/6, getHeight()/2 + 15, "-\u03c0");
            textMinusPi.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 18));
            getChildren().add(textMinusPi);


            Text textPi = new Text( getWidth()/2 + getWidth()/10, getHeight()/2 + 15, "\u03c0");
            textPi.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 18));
            getChildren().add(textPi);

            Text textMinus2Pi = new Text(getWidth()/2 - getWidth()/3, getHeight()/2 + 15, "-2\u03c0");
            textMinus2Pi.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 18));
            getChildren().add(textMinus2Pi);


            Text text2Pi = new Text( getWidth()/2 + getWidth()/5, getHeight()/2 + 15, "2\u03c0");
            text2Pi.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 18));
            getChildren().add(text2Pi);

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

            for (double x = -getWidth()/2.6; x <= getWidth()/2.6; x++) {
                listSine.add(x + getWidth()/2);
                listSine.add(getHeight()/2 - 50 * Math.sin((x / 100) * 2 * Math.PI));
            }

            getChildren().add(polylineSine);


            Polyline polylineCosine = new Polyline();
            ObservableList<Double> listCosine = polylineCosine.getPoints();

            for (double x = -getWidth()/2.6; x <= getWidth()/2.6; x++) {
                listCosine.add(x +  getWidth()/2);
                listCosine.add(getHeight()/2 - 50 * Math.cos((x / 100) * 2 * Math.PI));
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
