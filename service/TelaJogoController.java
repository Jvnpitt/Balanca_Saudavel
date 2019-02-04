/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import balancasaudavel.balanca.Prato;
import balancasaudavel.enuns.EnumAlimento;
import balancasaudavel.main.TelaJogo;
import balancasaudavel.main.TelaMenu;
import balancasaudavel.main.TelaScore;
import balancasaudavel.movimentacao.MovimentacaoPlayer;
import balancasaudavel.movimentacao.VerificaMovimentacao;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jjbvi
 */
public class TelaJogoController implements Initializable {
    
    private Prato Comida = new Prato();
    
   @FXML
    private ImageView prato;

    @FXML
    private ImageView carne;

    @FXML
    private ImageView player;

    @FXML
    private ImageView Ovo;

    @FXML
    private ImageView frango;

    @FXML
    private ImageView arroz;

    @FXML
    private ImageView ArrozIntergal;

    @FXML
    private ImageView Macarrao;

    @FXML
    private ImageView Sushi;

    @FXML
    private ImageView Maionese;

    @FXML
    private ImageView peixe;

    @FXML
    private ImageView PureBatata;

    @FXML
    private ImageView PureBatataDoce;

    @FXML
    private ImageView Salada;

    @FXML
    private ImageView Strognoff;

    @FXML
    private ImageView Feijao;

    @FXML
    private ImageView Farofa;
    
    @FXML
    private Label comida1;

    @FXML
    private Label comida2;
    
    @FXML
    private Label comida3;

    @FXML
    private Label comida4;

    @FXML
    private Label comida5;
    
    @FXML
    private Button BtPesar;

    @FXML
    private Button BtVoltar;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        BtPesar.setOnMouseClicked(event ->{
            TelaScore telaScore = new TelaScore();
            try {
                telaScore.start(new Stage());
                fechar();
            } catch (Exception ex) {
                Logger.getLogger(TelaJogoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        BtVoltar.setOnMouseClicked(event ->{
            try {
                voltar();
            } catch (Exception ex) {
                Logger.getLogger(TelaJogoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Ovo.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.Ovo);
            movimentacaoMouse(Ovo);
        });
        Ovo.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.Ovo);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.Ovo, Ovo.getLayoutX(), Ovo.getLayoutY(), this.Ovo, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Ovo");
                               
            }
            else{
                TirarLabels(EnumAlimento.Ovo);      
            }
            
        });
        
        arroz.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.arroz);
            movimentacaoMouse(arroz);
        });
        arroz.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.arroz);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.arroz, arroz.getLayoutX(), arroz.getLayoutY(), this.arroz, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Arroz");
            }
            else{
                TirarLabels(EnumAlimento.arroz);
            }
        });
        
        Sushi.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.Sushi);
            movimentacaoMouse(Sushi);
        });
        Sushi.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.Sushi);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.Sushi, Sushi.getLayoutX(), Sushi.getLayoutY(), this.Sushi, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Sushi");
            }
            else{
                TirarLabels(EnumAlimento.Sushi);
            }
        });
        
        frango.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.frango);
            movimentacaoMouse(frango);
        });
        frango.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.frango);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.frango, frango.getLayoutX(), frango.getLayoutY(), this.frango, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Frango");           
            }
            else{
                TirarLabels(EnumAlimento.frango);
            }
        });
        
        ArrozIntergal.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.ArrozIntegral);
            movimentacaoMouse(ArrozIntergal);
        });
        ArrozIntergal.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.ArrozIntegral);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.ArrozIntegral, ArrozIntergal.getLayoutX(), ArrozIntergal.getLayoutY(), this.ArrozIntergal, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Arroz Integral");          
            }
            else{
                TirarLabels(EnumAlimento.frango);
            }
        });
        
        Macarrao.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.Macarrao);
            movimentacaoMouse(Macarrao);
        });
        Macarrao.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.Macarrao);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.Macarrao, Macarrao.getLayoutX(), Macarrao.getLayoutY(), this.Macarrao, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Macarrão");            
            }
            else{
                TirarLabels(EnumAlimento.Macarrao);
            }
        });
        
        carne.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.carne);
            movimentacaoMouse(carne);
        });
        carne.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.carne);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.carne, carne.getLayoutX(), carne.getLayoutY(), this.carne, this.Comida)){              
                labels(EnumAlimento.Ovo, "x1 Carne");
            }
            else{
                TirarLabels(EnumAlimento.carne);
            }
        });
        
        Maionese.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.maionese);
            movimentacaoMouse(Maionese);
        });
        Maionese.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.maionese);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.maionese, Maionese.getLayoutX(), Maionese.getLayoutY(), this.Maionese, this.Comida)){               
                labels(EnumAlimento.Ovo, "x1 Maionese");
            }
            else{
                TirarLabels(EnumAlimento.maionese);
            }
        });
        
        peixe.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.peixe);
            movimentacaoMouse(peixe);
        });
        peixe.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.peixe);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.peixe, peixe.getLayoutX(), peixe.getLayoutY(), this.peixe, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Peixe");              
            }
            else{
                TirarLabels(EnumAlimento.peixe);
            }
        });
        
        PureBatata.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.pureBatata);
            movimentacaoMouse(PureBatata);
        });
        PureBatata.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.pureBatata);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.pureBatata, PureBatata.getLayoutX(), PureBatata.getLayoutY(), this.PureBatata, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Pure de Batata");         
            }
            else{
                TirarLabels(EnumAlimento.pureBatata);
            }
        });
        
        PureBatataDoce.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.pureBatataDoce);
            movimentacaoMouse(PureBatataDoce);
        });
        PureBatataDoce.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.pureBatataDoce);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.pureBatataDoce, PureBatataDoce.getLayoutX(), PureBatataDoce.getLayoutY(), this.PureBatataDoce, this.Comida)){               
                labels(EnumAlimento.Ovo, "x1 Pure de Batata Doce");
            }
            else{
                TirarLabels(EnumAlimento.pureBatataDoce);
            }
        });
        
        Salada.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.salada);
            movimentacaoMouse(Salada);
        });
        Salada.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.salada);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.salada, Salada.getLayoutX(), Salada.getLayoutY(), this.Salada, this.Comida)){
                labels(EnumAlimento.Ovo, "x1 Salada");            
            }
            else{
                TirarLabels(EnumAlimento.salada);
                
            }
        });
        
        Strognoff.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.strognoff);
            movimentacaoMouse(Strognoff);
        });
        Strognoff.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.strognoff);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.strognoff, Strognoff.getLayoutX(), Strognoff.getLayoutY(), this.Strognoff, this.Comida)){               
                labels(EnumAlimento.Ovo, "x1 Strognoff");
            }
            else{
                TirarLabels(EnumAlimento.strognoff);

            }
        });
        
        Feijao.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.feijao);
            movimentacaoMouse(Feijao);
        });
        Feijao.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.feijao);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.feijao, Feijao.getLayoutX(), Feijao.getLayoutY(), this.Feijao, this.Comida)){             
                labels(EnumAlimento.Ovo, "x1 Feijão");
            }
            else{
                TirarLabels(EnumAlimento.feijao);

            }
        });
        
        Farofa.setOnMouseDragged(event -> {
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.farofa);
            movimentacaoMouse(Farofa);
        });
        Farofa.setOnMouseReleased((MouseEvent event) ->{
            MovimentacaoPlayer.movimentaPlayer(player, EnumAlimento.farofa);
            if(VerificaMovimentacao.verificaMovimento(EnumAlimento.farofa, Farofa.getLayoutX(), Farofa.getLayoutY(), this.Farofa, this.Comida)){              
                labels(EnumAlimento.Ovo, "x1 Farofa");
            }
            else{
                TirarLabels(EnumAlimento.strognoff);
                
            }
        });
        
        
    }

    private void movimentacaoMouse(ImageView imagem) {
        imagem.setOnMouseDragged(event -> {
            imagem.setLayoutX(event.getSceneX()-10);
            imagem.setLayoutY(event.getSceneY()-10);
        });
    }
    
    private void voltar() throws Exception{
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.start(new Stage());
        fechar();
    }
    
    private void fechar(){
        TelaJogo.getStage().close();
    }
    
    private void labels(EnumAlimento alimento, String comida){
        switch(alimento){
            case Ovo:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case carne:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case frango:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case arroz:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case ArrozIntegral:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case Macarrao:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case Sushi:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case maionese:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case peixe:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case pureBatata:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case pureBatataDoce:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case salada:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case strognoff:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case feijao:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case farofa:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText(comida);
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText(comida);
                }
                else{
                    System.out.println("Prato Cheio");
                }
            }   
        }
    
    public void TirarLabels(EnumAlimento alimento){
        switch(alimento){
            case Ovo:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case carne:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case frango:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case arroz:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case ArrozIntegral:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case Macarrao:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case Sushi:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case maionese:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case peixe:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case pureBatata:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case pureBatataDoce:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case salada:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case strognoff:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case feijao:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
                
            case farofa:
                if(this.Comida.getNumComidas() == 1){
                    this.comida1.setText("");
                }
                else if(this.Comida.getNumComidas() == 2){
                    this.comida2.setText("");
                }
                else if(this.Comida.getNumComidas() == 3){
                    this.comida3.setText("");
                }
                else if(this.Comida.getNumComidas() == 4){
                    this.comida4.setText("");
                }
                else if(this.Comida.getNumComidas() == 5){
                    this.comida5.setText("");
                }
                else{
                    System.out.println("Prato Cheio");
                }
            }
    }

}
