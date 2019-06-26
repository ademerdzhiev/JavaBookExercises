package Exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Ex_14_18 extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        Scene scene = new Scene(new MyCubeFuntion(),  500, 500);

        stage.setScene(scene);
        stage.setTitle("CUBE FUNCTION");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class MyCubeFuntion extends Pane {

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

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.000125;

        for (int i = -100; i < 100; i ++) {
            list.add(i + getWidth()/2);
            list.add(-scaleFactor*(Math.pow(i,3)) +  getHeight()/2);
        }

        getChildren().add(polyline);
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
