/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jjbvi
 */
public class TelaCadastro extends Application{
    private static Stage stage;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("/balancasaudavel/views/TelaCadastro.fxml"));
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Balança Saudável");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        setStage(primaryStage);   
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        TelaCadastro.stage = stage;
    }  
}
