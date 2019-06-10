package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex_14_13 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new MyPieChart(),  400, 400);

        stage.setScene(scene);
        stage.setTitle("MY PIE CHART");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class MyPieChart extends Pane {
    private void drawPieChart() {
        getChildren().clear();

        Arc huawei = new Arc(getHeight()/2, getWidth()/2, getWidth()/3, getHeight()/3,
                0, 0.45*360);
        huawei.setType(ArcType.ROUND);
        huawei.setFill(Color.RED);

        getChildren().add(huawei);


        Arc xiaomi = new Arc(getHeight()/2, getWidth()/2, getWidth()/3, getHeight()/3,
                0.45*360, 0.35*360);
        xiaomi.setType(ArcType.ROUND);
        xiaomi.setFill(Color.BLUE);

        getChildren().add(xiaomi);

        Arc apple = new Arc(getHeight()/2, getWidth()/2, getWidth()/3, getHeight()/3,
                0.35*360 + 0.45*360, 0.05*360);
        apple.setType(ArcType.ROUND);
        apple.setFill(Color.BLACK);

        getChildren().add(apple);


        Arc others = new Arc(getHeight()/2, getWidth()/2, getWidth()/3, getHeight()/3,
                0.35*360 + 0.45*360 + 0.05*360, 0.15*360);
        others.setType(ArcType.ROUND);
        others.setFill(Color.GREEN);

        getChildren().add(others);

        Text huaweiText = new Text(getWidth()/2,getHeight()/2 - getHeight()/3 , "Huawei -- 45%");
        getChildren().add(huaweiText);

        Text xiaomiText = new Text(getWidth()/2 - 150*getWidth()/getHeight(),getHeight()/2 + getHeight()/5 , "Xiaomi -- 35%");
        getChildren().add(xiaomiText);

        Text appleText = new Text(getWidth()/2,getHeight()/2 + getHeight()/2.7 , "apple -- 5%");
        getChildren().add(appleText);

    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        drawPieChart();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        drawPieChart();
    }
}
