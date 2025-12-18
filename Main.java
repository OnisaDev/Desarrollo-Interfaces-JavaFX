package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = FXMLLoader.load(getClass().getResource("/hellofx/hellofx.fxml"));
        stage.setScene(new Scene(root, 400, 250));
        stage.setTitle("HelloFX");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}


