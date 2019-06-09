package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex_14_9 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new Taichi(), 800, 800);

        stage.setScene(scene);
        stage.setTitle("FOUR TACHIS");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class Taichi extends Pane{

    public void drawTaichi() {

        getChildren().clear();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                Circle circle = new Circle();
                circle.setRadius(getHeight()/4.5);
                circle.setStroke(Color.RED);
                circle.setFill(Color.TRANSPARENT);
                circle.setCenterY((2*j +1)*getHeight()/4) ;
                circle.setCenterX((2*i +1)*getWidth()/4);
                getChildren().add(circle);

                for (int m = 0; m < 4; m++) {
                    Arc arc = new Arc(((2*i + 1)*getWidth()/4), ((2*j + 1)*getHeight()/4),  getWidth()/5,
                            getHeight()/5, 2*m*45 +115, 45);
                    arc.setType(ArcType.ROUND);
                    getChildren().add(arc);
                }
            }
        }
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        drawTaichi();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        drawTaichi();
    }
}
