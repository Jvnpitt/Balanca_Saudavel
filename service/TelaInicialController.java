/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import balancasaudavel.main.TelaCadastro;
import balancasaudavel.main.TelaInicial;
import balancasaudavel.main.TelaMenu;
import balancasaudavel.usuario.Logado;
import balancasaudavel.usuario.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author jjbvi
 */
public class TelaInicialController implements Initializable {

    private ServiceUsuario serviceUsuario = new ServiceUsuario();

    @FXML
    private Button btEntrar;

    @FXML
    private TextField TxLogin;

    @FXML
    private PasswordField TxPassword;

    @FXML
    private Button BtCadastrar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            this.serviceUsuario.load();
        } 
        catch (IOException ex) {
            Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        btEntrar.setOnMouseClicked((MouseEvent e) -> {
            try {
                logar();
                
            } catch (IOException ex) {
                Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        btEntrar.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                try {
                    logar();
                } catch (IOException ex) {
                    Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        TxPassword.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                try {
                    logar();
                } catch (IOException ex) {
                    Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        BtCadastrar.setOnMouseClicked((MouseEvent e) -> {
            cadastrar();
        });

        BtCadastrar.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                cadastrar();
            }

        });
    }

    public void fechar() {
        TelaInicial.getStage().close();
    }

    public void logar() throws IOException, FileNotFoundException, ClassNotFoundException {
        
        Usuario user = new Usuario(TxLogin.getText(), TxPassword.getText());
        Usuario aux = this.serviceUsuario.find(user);
        if (aux == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Opss, algo deu errado!");
            alert.setContentText("Nome de usuário ou senha inválido");
            alert.show();
        } 
        else {
            Logado.instance(aux);
            TelaMenu telaMenu = new TelaMenu();
            try {
                telaMenu.start(new Stage());
                fechar();
            } 
            catch (Exception ex) {
                Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }           
    }

    public void cadastrar() {
        TelaCadastro telaCadastro = new TelaCadastro();
        try {
            telaCadastro.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
        }
        fechar();
    }

}
