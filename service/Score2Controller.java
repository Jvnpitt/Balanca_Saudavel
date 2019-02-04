/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import balancasaudavel.main.TelaMenu;
import balancasaudavel.main.TelaScore2;
import balancasaudavel.usuario.Logado;
import balancasaudavel.usuario.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jjbvi
 */
public class Score2Controller implements Initializable {
    
    @FXML
    private Label Pontuacao;

    @FXML
    private Label dica;
    
    @FXML
    private Button Voltar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Usuario user = Logado.getInstance();
        int pont = (int) user.getScore();
        this.Pontuacao.setText(String.valueOf(pont));
        switch(pont){
            case 50:
                this.dica.setText("Você está abaixo do peso Ideal");
                break;
            case 100:
                this.dica.setText("Parabéns seu IMC está Ótimo");
                break;
            case 55:
                this.dica.setText("Você está com sobre peso");
                break;
            default:
                this.dica.setText("Seu IMC não está bom");
                break;
        }
        Voltar.setOnMouseClicked(event ->{
            TelaMenu telaMenu = new TelaMenu();
        try {
            telaMenu.start(new Stage());
            fechar();
        } catch (Exception ex) {
            Logger.getLogger(ScoreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        });
    }    
    public void fechar(){
        TelaScore2.getStage().close();
    }
    
}
