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

import java.util.HashSet;
import java.util.Set;

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

    public static Set<String> variables = new HashSet<>();
    public static Set<String> functions = new HashSet<>();

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


