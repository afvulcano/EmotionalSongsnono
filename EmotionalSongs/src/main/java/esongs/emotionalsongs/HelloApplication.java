package esongs.emotionalsongs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("registration.fxml"));
            Scene scene = new Scene(root, 600, 400);
            stage.setMinWidth(600);
            stage.setMinHeight(400);
            stage.setTitle("Emotional Songs <3");

            // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("homepage.fxml")); //loading the first page
            //  Scene scene = new Scene(fxmlLoader.load(), 0, 0);


            stage.setScene(scene);
            stage.show();

            //Centering the window in the screen
            Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
            stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);


        } catch (Exception e) {
            e.printStackTrace();
            }

    }
}