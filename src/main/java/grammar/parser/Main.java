package grammar.parser;

import controller.EditorController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene show =EditorController.show();
        primaryStage.setScene(show);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }

}


