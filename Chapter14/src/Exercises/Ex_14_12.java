package Exercises;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.stage.Stage;

public class Ex_14_12 extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Companies");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("%");

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Companies score");
        barChart.setBarGap(10);

        XYChart.Series<String, Number> xyChartApple = new XYChart.Series<>();
        xyChartApple.setName("Apple");
        xyChartApple.getData().add(new XYChart.Data<>("Apple", 5.0));


        XYChart.Series<String, Number> xyChartHuawei = new XYChart.Series<>();
        xyChartHuawei.setName("Huawei");
        xyChartHuawei.getData().add(new XYChart.Data<>("Huawei", 45.0));

        XYChart.Series<String, Number> xyChartXiaomi = new XYChart.Series<>();
        xyChartXiaomi.setName("Xiaomi");
        xyChartXiaomi.getData().add(new XYChart.Data<>("Xiaomi", 35.0));

        XYChart.Series<String, Number> xyChartOthers = new XYChart.Series<>();
        xyChartOthers.setName("Others");
        xyChartOthers.getData().add(new XYChart.Data<>("Others", 15));

        barChart.getData().addAll(xyChartHuawei, xyChartXiaomi, xyChartApple, xyChartOthers);



        Scene scene = new Scene(barChart);

        stage.setScene(scene);
        stage.setTitle("BAR CHART");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
