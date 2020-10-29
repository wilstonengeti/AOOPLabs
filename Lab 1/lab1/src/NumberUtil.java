/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class NumberUtil {

 public static String getMultiplictionTable(int n, int until){
  StringBuilder builder = new StringBuilder();
  
  for(int i=1; i<until; i++){
   builder.append(n).append("*").append(i).append("=").append(n*i).append("\n");
  }
  
  return builder.toString();
 }
 
 public static String get2MultiplicationTable(){
  return getMultiplictionTable(2, 10);
 }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
