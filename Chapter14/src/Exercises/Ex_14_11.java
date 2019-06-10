package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex_14_11 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new DrawSmileyFace(), 300, 300);

        stage.setScene(scene);
        stage.setTitle("SMILEY FACE");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class DrawSmileyFace extends Pane {

    public void draw() {
        getChildren().clear();

        Circle eye1 = new Circle(getWidth()/2 + 0.15*getWidth(), 0.4*getHeight(),
                10*(getWidth()/getHeight()));
        eye1.setFill(Color.GREEN);
        getChildren().add(eye1);

        Arc eyeLine1 = new Arc(getWidth()/2 + 0.15*getWidth(), 0.4*getHeight(), 25*(getWidth()/getHeight())
                , 15*getWidth()/getHeight(), 0, 360);
        eyeLine1.setType(ArcType.OPEN);
        eyeLine1.setFill(Color.TRANSPARENT);
        eyeLine1.setStroke(Color.BLACK);
        getChildren().add(eyeLine1);


        Circle eye2 = new Circle(getWidth()/2 - 0.15*getWidth(), 0.4*getHeight(),
                10*getWidth()/getHeight());
        eye2.setFill(Color.GREEN);
        getChildren().add(eye2);

        Arc eyeLine2 = new Arc(getWidth()/2 - 0.15*getWidth(), 0.4*getHeight(), 25*(getWidth()/getHeight())
                , 15*getWidth()/getHeight(), 0, 360);
        eyeLine2.setType(ArcType.OPEN);
        eyeLine2.setFill(Color.TRANSPARENT);
        eyeLine2.setStroke(Color.BLACK);
        getChildren().add(eyeLine2);

        Arc smile = new Arc(getWidth()/2, 0.7*getHeight(), 70*getWidth()/getHeight(), 25*getWidth()/getHeight(), 0, -180);
        smile.setType(ArcType.OPEN);
        smile.setFill(Color.TRANSPARENT);
        smile.setStroke(Color.BLACK);
        getChildren().add(smile);

        Line nose1 = new Line(getWidth()/2 + 0.1*getWidth(), getHeight()/2 + 0.1*getHeight(),
                getWidth()/2 - 0.1*getWidth(), getHeight()/2 + 0.1*getHeight());
        getChildren().add(nose1);

        Line nose2 = new Line(getWidth()/2 + 0.1*getWidth(), getHeight()/2 + 0.1*getHeight(),
                getWidth()/2, getHeight()/2 - 0.06*getHeight());
        getChildren().add(nose2);

        Circle face = new Circle(getWidth()/2, getHeight()/2, 100*getHeight()/getWidth());
        face.setFill(Color.TRANSPARENT);
        face.setStroke(Color.BLACK);
        getChildren().add(face);


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
