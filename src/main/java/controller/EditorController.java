package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditorController implements Initializable {

    @FXML
    private TextArea codeText;

    public static Scene show() throws IOException {
        URL xmlRes=EditorController.class.getResource("/fxml/Editor.fxml");
        AnchorPane ap= FXMLLoader.load(xmlRes);
        return new Scene(ap,750,600);
    }

    @FXML
    public void onRun(){
        String s=codeText.getText();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
