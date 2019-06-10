package Exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex_14_12_v2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new MyBarChart(), 400, 200);

        stage.setScene(scene);
        stage.setTitle("BAR CHART");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class MyBarChart extends Pane {

    private void drawBarChart() {
        getChildren().clear();

        Rectangle huawei = new Rectangle(getWidth()*0.1, 0.4*getHeight() + 0.05*getHeight(),
                0.2*getWidth(), 0.45*getHeight());
        huawei.setFill(Color.RED);
        getChildren().add(huawei);

        Text huaweiText = new Text(getWidth()*0.1, 0.45*getHeight() - 5*getWidth()/getHeight(),
                "Huawei -- 45%");
        getChildren().add(huaweiText);

        Rectangle xiaomi = new Rectangle(getWidth()*0.1 + 10*getWidth()/getHeight() + 0.2*getWidth(),
                0.4*getHeight() + 0.15*getHeight(),
                0.2*getWidth(), 0.35*getHeight());
        xiaomi.setFill(Color.RED);
        getChildren().add(xiaomi);

        Text xiaomiText = new Text(getWidth()*0.1 + 10*getWidth()/getHeight() + 0.2*getWidth(),
                0.4*getHeight() + 0.15*getHeight() - 5*getWidth()/getHeight(),
                "Xiaomi -- 35%");
        getChildren().add(xiaomiText);


        Rectangle apple = new Rectangle(getWidth()*0.1 + 20*getWidth()/getHeight() + 2*0.2*+getWidth(),
                0.4*getHeight() +0.45*getHeight(),
                0.2*getWidth(), 0.05*getHeight());
        apple.setFill(Color.BLACK);
        getChildren().add(apple);

        Text appleText = new Text(getWidth()*0.1 + 20*getWidth()/getHeight() + 2*0.2*+getWidth(),
                0.4*getHeight() +0.45*getHeight() - 5*getWidth()/getHeight(),
                "Apple -- 5%");
        getChildren().add(appleText);


        Rectangle others = new Rectangle(getWidth()*0.1 + 30*getWidth()/getHeight() + 3*0.2*+getWidth(),
                0.4*getHeight() +0.4*getHeight(),
                0.2*getWidth(), 0.1*getHeight());
        others.setFill(Color.RED);
        getChildren().add(others);

        Text othersText = new Text(getWidth()*0.1 + 30*getWidth()/getHeight() + 3*0.2*+getWidth(),
                0.4*getHeight() +0.4*getHeight() - 5*getWidth()/getHeight(),
                "Others -- 10%");
        getChildren().add(othersText);



    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        drawBarChart();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        drawBarChart();
    }
}
