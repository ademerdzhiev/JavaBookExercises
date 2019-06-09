package Exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Ex_14_3 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(12, 12, 12, 12));
//
//        BorderPane pane = new BorderPane();
//        pane.setCenter(hBox);


//        File[] files = getCardNames();

        for (int i = 0; i < 3; i++) {
            int rand = (int)(Math.random()*54 + 1);
            String path = "images/card/" + rand + ".png";
            hBox.getChildren().add(new ImageView(new Image(path)));
        }

        hBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(hBox);


        stage.setScene(scene);
        stage.setTitle("RANDOM CARDS");
        stage.show();
    }

    public static File[] getCardNames() {
        File folder = new File("images/card");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i <= 54; i ++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File: " + listOfFiles[i].getName() );
            }
        }

        return listOfFiles;
    }

    public static ArrayList<Integer> createRandomList() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 54; i ++) {
            list.add(i);
        }

        Collections.shuffle(list);

        return list;
    }

    public static void main(String[] args) {
        launch();
    }
}
