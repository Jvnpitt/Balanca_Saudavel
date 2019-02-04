/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import balancasaudavel.balanca.Balanca;
import balancasaudavel.balanca.Imc;
import balancasaudavel.balanca.Medidas;
import balancasaudavel.balanca.Prato;
import balancasaudavel.main.TelaMenu;
import balancasaudavel.main.TelaScore;
import balancasaudavel.usuario.Logado;
import balancasaudavel.usuario.Usuario;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jjbvi
 */
public class ScoreController implements Initializable {
    
    private ServiceUsuario serviceUsuario = new ServiceUsuario();

    @FXML
    private Label player;
    
    @FXML
    private Text  Dicas;
    
    @FXML
    private Label Carboidrato;

    @FXML
    private Label Proteina;

    @FXML
    private Label GorduraTotal;

    @FXML
    private Button BtVoltar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Prato prato = new Prato();
        Usuario user = Logado.getInstance();
       
        double imc = Imc.imc(user.getAltura(), user.getPeso());
        int medida = Medidas.medidas(imc, user.getAltura());
        
        double carboidrato = Balanca.carboidrato(prato);
        double Proteina = Balanca.proteina(prato);
        double gorduraTotal = Balanca.gorduraTotal(prato);
        Medida(medida, carboidrato, Proteina, gorduraTotal, user);

        
        this.BtVoltar.setOnMouseClicked(event ->{
            voltar();
        });
    }
    
    private void voltar(){
        TelaMenu telaMenu = new TelaMenu();
        try {
            telaMenu.start(new Stage());
            fechar();
        } catch (Exception ex) {
            Logger.getLogger(ScoreController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fechar(){
        TelaScore.getStage().close();
    }
    
    public void Medida(int i, double carboidrato, double proteina, double gorduraTotal, Usuario user){
        switch(i){
            case 1:
                this.player.setText("Você está abaixo do peso ideal para sua altura e idade");
                this.Carboidrato.setText(String.valueOf(carboidrato));
                this.Proteina.setText(String.valueOf(proteina));
                this.GorduraTotal.setText(String.valueOf(gorduraTotal));
                this.Dicas.setText("Tome cuidado pois isso pode levar a Fadiga, Stress e ansiedade\n"
                        + "Você poderia fazer uma dieta mais rica em carboidratos e gordurais boas");
                user.setScore(50);
                break;
            case 2:
                this.player.setText("Você está com o peso ideal");
                this.Carboidrato.setText(String.valueOf(carboidrato));
                this.Proteina.setText(String.valueOf(proteina));
                this.GorduraTotal.setText(String.valueOf(gorduraTotal));
                this.Dicas.setText("Parabéns");
                user.setScore(100);
                break;
            case 3:
                this.player.setText("Você está com sobrepeso para sua altura e idade");
                this.Carboidrato.setText(String.valueOf(carboidrato));
                this.Proteina.setText(String.valueOf(proteina));
                this.GorduraTotal.setText(String.valueOf(gorduraTotal));
                this.Dicas.setText("Tome cuidado pois isso pode levar a Fadiga, má circulação, varizes e diabetes\n"
                        + "Você poderia fazer uma dieta mais com menos carboidratos e manerar no açúcar");
                user.setScore(55);
                break;
            case 4:
                this.player.setText("Você está com o obesidade");
                this.Carboidrato.setText(String.valueOf(carboidrato));
                this.Proteina.setText(String.valueOf(proteina));
                this.GorduraTotal.setText(String.valueOf(gorduraTotal));
                this.Dicas.setText("Tome muito cuidado, você deve procurar o médico");
                user.setScore(40);
                break;
            case 5:
                this.player.setText("Você está com o obesidade");
                this.Carboidrato.setText(String.valueOf(carboidrato));
                this.Proteina.setText(String.valueOf(proteina));
                this.GorduraTotal.setText(String.valueOf(gorduraTotal));
                this.Dicas.setText("Tome muito cuidado, você deve procurar o médico");
                user.setScore(30);
                break;
        }
    }
    
}
