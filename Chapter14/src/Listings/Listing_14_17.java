package Listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Listing_14_17 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new MyEllipse(), 300, 400);

        stage.setScene(scene);


        stage.setTitle("Ellipse");
        stage.show();
    }

    class MyEllipse extends Pane {
        private void paint(){
            getChildren().clear();

            for (int i = 0; i < 16; i++) {
                Ellipse e1 = new Ellipse(getWidth()/2, getHeight()/2, getWidth()/2 - 50, getHeight()/2 -5);
                e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
                e1.setFill(Color.WHITE);
                e1.setRotate(i* 180 / 16);
                getChildren().add(e1);
            }
        }
        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            paint();
        }

        @Override
        public void setHeight(double height) {
            super.setHeight(height);
            paint();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}
