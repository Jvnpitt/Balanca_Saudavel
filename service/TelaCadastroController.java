/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import balancasaudavel.main.TelaCadastro;
import balancasaudavel.main.TelaInicial;
import balancasaudavel.usuario.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jjbvi
 */
public class TelaCadastroController implements Initializable {

    private ServiceUsuario serviceUsuario = new ServiceUsuario();

    
    @FXML
    private TextField CadastroLogin;

    @FXML
    private Button BtCadastrar;

    @FXML
    private Label ConfCadastro;

    @FXML
    private Button BtVoltar;

    @FXML
    private PasswordField TxtSenha;

    @FXML
    private PasswordField TxtConfirSenha;

    @FXML
    private TextField TxtIdade;

    @FXML
    private Button BtMasculino;

    @FXML
    private Button BtFeminino;

    @FXML
    private TextField TxtAltura;

    @FXML
    private TextField TxtPeso;

    public void initialize(URL url, ResourceBundle rb) {

        BtVoltar.setOnMouseClicked((MouseEvent e) -> {
            try {
                voltar();
            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        BtVoltar.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                try {
                    voltar();
                } catch (Exception ex) {
                    Logger.getLogger(TelaCadastroController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        BtCadastrar.setOnMouseClicked((MouseEvent e) -> {
            cadastrar();
        });

    }

    public void voltar() throws Exception {
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.start(new Stage());
        fechar();
    }

    public void fechar() {
        TelaCadastro.getStage().close();
    }

    public void cadastrar() {
        if (TxtSenha.getText().compareTo(TxtConfirSenha.getText()) != 0) {
            this.ConfCadastro.setText("As senhas não são iguais");
        } 
        else {
            int idade = Integer.valueOf(this.TxtIdade.getText());
            double Altura = Double.valueOf(this.TxtAltura.getText());
            double peso = Double.valueOf(this.TxtPeso.getText());
            Usuario user = new Usuario(CadastroLogin.getText(), TxtSenha.getText(), idade, Altura, peso);
            
            this.BtMasculino.setOnMouseClicked(event ->{
                user.setSexo(true);
            });
            this.BtFeminino.setOnMouseClicked(event ->{
                user.setSexo(false);
            });
            
            try {
                if (serviceUsuario.find(user) != null) {
                    this.ConfCadastro.setText("Login já está em uso");
                } 
                else {
                    this.ConfCadastro.setText("Cadastro feito");
                    this.serviceUsuario.cadastrar(user);
                    this.serviceUsuario.save();
                }
            } catch (IOException ex) {
                Logger.getLogger(TelaCadastroController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    
        }
    }
}