/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.movimentacao;

import balancasaudavel.enuns.EnumAlimento;
import javafx.scene.image.ImageView;

/**
 *
 * @author jjbvi
 */
public class MovimentacaoPlayer {
    public static void movimentaPlayer(ImageView player, EnumAlimento alimento){
        switch(alimento){
            case Ovo:
                    player.setLayoutX(29);
                    player.setLayoutY(150);              
                break;
                
            case arroz:
                    player.setLayoutX(94);
                    player.setLayoutY(150);              
                break;
                
            case Sushi:
                    player.setLayoutX(169);
                    player.setLayoutY(150);
                break;
                
            case frango:
                    player.setLayoutX(94);
                    player.setLayoutY(150);      
                break;
                
            case ArrozIntegral:
                    player.setLayoutX(169);
                    player.setLayoutY(150);
                break;
                
            case Macarrao:
                player.setLayoutX(250);
                player.setLayoutY(150);
                break;
                
            case carne:
                player.setLayoutX(29);
                player.setLayoutY(150);
                break;
                
            case maionese:
                player.setLayoutX(250);
                player.setLayoutY(150);
                break;
                
            case peixe:
                player.setLayoutX(312);
                player.setLayoutY(150);
                break;
                
            case pureBatata:
                player.setLayoutX(327);
                player.setLayoutY(150);
                break;
                
            case pureBatataDoce:
                player.setLayoutX(388);
                player.setLayoutY(150);
                break;
                
            case salada:
                player.setLayoutX(416);
                player.setLayoutY(150);
                break;
                
            case strognoff:
                player.setLayoutX(463);
                player.setLayoutY(150);
                break;
                
            case feijao:
                player.setLayoutX(484);
                player.setLayoutY(150);
                break;
                
            case farofa:
                player.setLayoutX(539);
                player.setLayoutY(150);
                break;
        }
    }
}
