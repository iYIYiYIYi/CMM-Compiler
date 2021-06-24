package grammar.parser;

import controller.EditorController;
import grammar.generator.CMM_PARSER;
import grammar.generator.ParseException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main extends Application {

    public static InputStream in;
    static {
        try {
            in = new FileInputStream("src/main/resources/codeFile/code.cmm");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static CMM_PARSER parser = new CMM_PARSER(in);

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene show =EditorController.show();
        primaryStage.setScene(show);
        primaryStage.show();
    }

    public static void main(String[] args) throws FileNotFoundException {

        Application.launch();


    }
}


