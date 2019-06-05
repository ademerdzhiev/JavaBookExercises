package CaseStudy;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayClock extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        CREATE CLOCK AND LABEL
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + " : " + clock.getMinute() + " : " + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

//        PLACE CLOCK AND LABEL ON BORDER PANE
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(clock);
        borderPane.setBottom(lblCurrentTime);
        borderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

//        CREATE SCENE AND PLACE IN THE STAGE
        Scene scene = new Scene(borderPane, 250, 250);
        stage.setTitle("CLOCK");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
