package hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML private Label label;

    @FXML
    private void initialize() {
        String j = System.getProperty("java.version");
        String fx = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + fx + "\nRunning on Java " + j);
    }
}

