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
public class TelaInicial extends Application {
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/balancasaudavel/views/TelaInicial.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Balança Saudável");
        stage.setScene(scene);
        stage.show();
        
        setStage(stage);   
        
    }

    public static Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        TelaInicial.stage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
