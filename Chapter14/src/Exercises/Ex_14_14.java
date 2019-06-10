package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Ex_14_14 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new MyRectanguloid(), 300, 300);

        stage.setScene(scene);
        stage.setTitle("RECTANGULOID");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class MyRectanguloid extends Pane {
    private void drawRectanguloid() {
        getChildren().clear();

        Polygon downPolygon = new Polygon(getWidth()/2 - 0.30*getWidth(), getHeight()/2 + 0.4*getHeight(),
                getWidth()/2 + 0.30*getWidth(), getHeight()/2 + 0.4*getHeight(),
                getWidth()/2 + 0.20*getWidth(), getHeight()/2 + 0.2*getHeight(),
                getWidth()/2 - 0.40*getWidth(), getHeight()/2 + 0.2*getHeight());
        downPolygon.setStroke(Color.BLACK);
        downPolygon.setFill(Color.TRANSPARENT);

        getChildren().add(downPolygon);



        Polygon upPolygon = new Polygon(getWidth()/2 + 0.2*getWidth(), getHeight()/2 - 0.4*getHeight(),
                getWidth()/2 - 0.40*getWidth(), getHeight()/2 - 0.4*getHeight(),
                getWidth()/2 - 0.30*getWidth(), getHeight()/2 - 0.2*getHeight(),
                getWidth()/2 + 0.30*getWidth(), getHeight()/2 - 0.2*getHeight());
        upPolygon.setStroke(Color.BLACK);
        upPolygon.setFill(Color.TRANSPARENT);

        getChildren().add(upPolygon);

        Polygon leftPolygon = new Polygon( getWidth()/2 - 0.4*getWidth(), getHeight()/2 + 0.2*getHeight(),
                getWidth()/2 - 0.4*getWidth(), getHeight()/2 - 0.40*getHeight(),
                getWidth()/2 - 0.30*getWidth(), getHeight()/2 - 0.2*getHeight(),
                getWidth()/2 - 0.30*getWidth(), getHeight()/2 + 0.4*getHeight());
        leftPolygon.setStroke(Color.BLACK);
        leftPolygon.setFill(Color.TRANSPARENT);

        getChildren().add(leftPolygon);


        Line rightPolygonLine1 = new Line( getWidth()/2 + 0.30*getWidth(), getHeight()/2 + 0.4*getHeight(),
                getWidth()/2 + 0.30*getWidth(), getHeight()/2 - 0.2*getHeight());
        rightPolygonLine1.setStroke(Color.BLACK);


        getChildren().add(rightPolygonLine1);


        Line rightPolygonLine2 = new Line( getWidth()/2 + 0.20*getWidth(), getHeight()/2 + 0.2*getHeight(),
                getWidth()/2 + 0.2*getWidth(), getHeight()/2 - 0.4*getHeight());
        rightPolygonLine2.setStroke(Color.BLACK);


        getChildren().add(rightPolygonLine2);


    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        drawRectanguloid();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        drawRectanguloid();
    }
}
