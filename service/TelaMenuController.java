/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import balancasaudavel.main.TelaInicial;
import balancasaudavel.main.TelaJogo;
import balancasaudavel.main.TelaMenu;
import balancasaudavel.main.TelaScore2;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jjbvi
 */
public class TelaMenuController implements Initializable {
    
    @FXML
    private Button BtIniciar;

    @FXML
    private Button BtScore;

    @FXML
    private Button BtSair;
    
   

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BtScore.setOnMouseClicked(EVENT ->{
            TelaScore2 telaScore2 = new TelaScore2();
            try {
                telaScore2.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechar();
        });
        
        BtIniciar.setOnMouseClicked((MouseEvent e) ->{
            TelaJogo telaJogo = new TelaJogo();
            try {
                telaJogo.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechar();
        });
        BtIniciar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
               TelaJogo telaJogo = new TelaJogo();
               try {
                   telaJogo.start(new Stage());
               } catch (Exception ex) {
                   Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
               }
               fechar();
            }
        });
        

        BtSair.setOnKeyPressed((KeyEvent e)->{
            TelaInicial telaInicial = new TelaInicial();
            try {
                telaInicial.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechar();
        });
        BtSair.setOnMouseClicked((MouseEvent e)->{
            TelaInicial telaInicial = new TelaInicial();
            try {
                telaInicial.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechar();
        });
    }

    public void fechar(){
        TelaMenu.getStage().close();
    }   
    
}
