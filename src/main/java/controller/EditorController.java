package controller;

import grammar.generator.CMM_PARSER;
import grammar.generator.ParseException;
import grammar.parser.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;


public class EditorController implements Initializable {

    @FXML
    private TextArea codeText;
    @FXML
    private TextArea outcomeText;
    @FXML
    private TextArea numText;

    public static Scene show() throws IOException {
        URL xmlRes=EditorController.class.getResource("/fxml/Editor.fxml");
        AnchorPane ap= FXMLLoader.load(xmlRes);
        return new Scene(ap,750,600);
    }

    @FXML
    public void onRun() throws IOException {
        codeText.setStyle("-fx-text-fill:black");
        String s=codeText.getText();
        String url="src/main/resources/codeFile/code.cmm";
        FileWriter fileWriter=new FileWriter(url);
        fileWriter.write(s);
        fileWriter.flush();
        fileWriter.close();
        Main.in = new FileInputStream("src/main/resources/codeFile/code.cmm");
        CMM_PARSER.ReInit(Main.in);
        try {
            CMM_PARSER.program();
            outcomeText.setText("语法正确！");
        } catch (ParseException e) {
            e.printStackTrace();
            outcomeText.setText("Error:\n"+e.getMessage());
            String err=e.getMessage();
            int x= Integer.parseInt(err.substring(err.indexOf("line")+5,err.indexOf(",",err.indexOf("line"))));
            int y= Integer.parseInt(err.substring(err.indexOf("column")+7,err.indexOf(".",err.indexOf("column"))));
            System.out.println("x:"+x+" y:"+y);
            codeText.setStyle("-fx-text-fill:red");
        }
    }

    @FXML
    public void onSave() throws IOException {
        String s=codeText.getText();
        String url="src/main/resources/codeFile/code.cmm";
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(url);
            fileWriter.write(s);
            fileWriter.flush();
            fileWriter.close();
            outcomeText.setText("保存成功！");
        } catch (IOException e) {
            e.printStackTrace();
            outcomeText.setText("保存失败！\n");
            outcomeText.setText(e.getMessage());
        }
        String[] strings=s.split("\n");
        int k=strings.length;
        String num="";
        for (int i = 1; i <= k; i++) {
            num+=(i+"\n");
        }
        numText.setText(num);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
