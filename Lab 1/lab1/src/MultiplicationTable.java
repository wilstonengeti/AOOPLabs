/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class MultiplicationTable extends Application {

    private Pos CENTER;

 @Override
 public void start(Stage primaryStage) {

  Button button = new Button();
  button.setText("Click Me to print multiplication table of 2");

  Text message = new Text();

  button.setOnAction(event -> {
   message.setText(NumberUtil.get2MultiplicationTable());
  });

  VBox vBox = new VBox(10, button, message);
  vBox.setAlignment(CENTER);
  

  Scene scene = new Scene(vBox, 600, 400);

  /* Set the scene to primaryStage, and call the show method */
  primaryStage.setTitle("Multiplication Table");
  primaryStage.setScene(scene);
  primaryStage.show();
 }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
