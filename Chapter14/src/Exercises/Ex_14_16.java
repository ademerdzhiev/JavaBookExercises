package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex_14_16 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new MyGrid(),600, 400);

        stage.setScene(scene);
        stage.setTitle("4x4 GRID");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


class MyGrid extends Pane {

    private void drawGrid() {
        getChildren().clear();

        for (int i = 0; i < 4; i++) {
            Line lineH = new Line(0, i*getHeight()/4, getWidth(), i*getHeight()/4);
            lineH.setStroke(Color.BLUE);

            Line lineV = new Line(i*getWidth()/4, 0,i*getWidth()/4, getHeight());
            lineV.setStroke(Color.RED);

            getChildren().addAll(lineH, lineV);
        }

    }


    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        drawGrid();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        drawGrid();
    }
}
