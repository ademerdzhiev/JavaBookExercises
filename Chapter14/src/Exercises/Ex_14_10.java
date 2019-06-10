package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex_14_10 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new DrawCylinder(), 200, 300);

        stage.setScene(scene);
        stage.setTitle("CYLINDER");
        stage.show();
    }

   public static void main(String[] args) {
        launch();
    }
}

class DrawCylinder extends Pane {

    public void draw() {
        getChildren().clear();

        Ellipse ellipse = new Ellipse(getWidth()/2, (0.3)*getHeight(), 0.2*getWidth(), 0.1*getHeight());
        ellipse.setFill(Color.TRANSPARENT);
        ellipse.setStroke(Color.BLACK);
        getChildren().add(ellipse);

        Line line1 = new Line(getWidth()/2 - 0.2*getWidth(), 0.3*getHeight(), getWidth()/2 - 0.2*getWidth(),
                0.7*getHeight());
        getChildren().add(line1);

        Line line2 = new Line(getWidth()/2 + 0.2*getWidth(), 0.3*getHeight(), getWidth()/2 + 0.2*getWidth(),
                0.7*getHeight());
        getChildren().add(line2);


        Arc arc1 = new Arc(getWidth()/2, 0.7*getHeight(), 0.2*getWidth(), 0.1*getHeight(), 0, -180);
        arc1.setType(ArcType.OPEN);
        arc1.setFill(Color.TRANSPARENT);
        arc1.setStroke(Color.BLACK);
        getChildren().add(arc1);


        Arc arc2 = new Arc(getWidth()/2, 0.7*getHeight(), 0.2*getWidth(), 0.1*getHeight(), 0, 180);
        arc2.setType(ArcType.OPEN);
        arc2.setFill(Color.TRANSPARENT);
        arc2.setStroke(Color.BLACK);
        arc2.getStrokeDashArray().addAll(6.0, 21.0);

        getChildren().add(arc2);
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
