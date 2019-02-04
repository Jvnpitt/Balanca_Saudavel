/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.movimentacao;

import balancasaudavel.balanca.Prato;
import balancasaudavel.enuns.EnumAlimento;
import javafx.scene.image.ImageView;

/**
 *
 * @author jjbvi
 */
public class VerificaMovimentacao {

    public static boolean verificaMovimento(EnumAlimento alimento, double x, double y, ImageView image, Prato prato) {
        switch (alimento) {
            case Ovo:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(alimento)) {
                        image.setLayoutX(550);
                        image.setLayoutY(50);
                        return true;
                    } else {
                        image.setLayoutX(29);
                        image.setLayoutY(343);
                        return false;
                    }
                }
                else{
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(29);
                        image.setLayoutY(343);
                        prato.tirarComida(alimento);
                        return false; 
                    }
                    else{
                        image.setLayoutX(29);
                        image.setLayoutY(343);
                        return false;
                    }
                }
                
            case arroz:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(alimento)) {
                        image.setLayoutX(550);
                        image.setLayoutY(30);
                        return true;
                    }
                    else{
                        image.setLayoutX(99);
                        image.setLayoutY(343);
                        return false;
                    }
                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(99);
                        image.setLayoutY(343);
                        prato.tirarComida(alimento);
                        return false;
                    }else{
                        image.setLayoutX(99);
                        image.setLayoutY(343);
                        return false;
                    }                
                }

            case Sushi:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.Sushi)) {
                        image.setLayoutX(599);
                        image.setLayoutY(50);
                        return prato.InseriComida(alimento);
                        
                    }
                    else{
                        image.setLayoutX(169);
                        image.setLayoutY(302);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(169);
                        image.setLayoutY(302);
                        prato.tirarComida(alimento);
                        return false;
                    }else{
                        image.setLayoutX(169);
                        image.setLayoutY(302);
                        return false;
                    }
                    
                }

            case frango:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(alimento)) {
                        image.setLayoutX(570);
                        image.setLayoutY(20);
                        return true;
                    }
                    else{
                        image.setLayoutX(94);
                        image.setLayoutY(302);
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(94);
                        image.setLayoutY(302);
                        prato.tirarComida(alimento);
                        return false;
                    }
                    else{
                        image.setLayoutX(94);
                        image.setLayoutY(302);
                        return false;
                    }
                }

            case ArrozIntegral:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(alimento)) {
                        image.setLayoutX(599);
                        image.setLayoutY(30);
                        return true;
                    }
                    else{
                        image.setLayoutX(165);
                        image.setLayoutY(345);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(165);
                        image.setLayoutY(345);
                        prato.tirarComida(alimento);
                        return false;
                    }else{
                        image.setLayoutX(165);
                        image.setLayoutY(345);
                        return false;
                    }
                }

            case carne:

                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(alimento)) {
                        image.setLayoutX(540);
                        image.setLayoutY(20);
                        return true;
                    } 
                    else {
                        image.setLayoutX(29);
                        image.setLayoutY(302);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(29);
                        image.setLayoutY(302);
                        prato.tirarComida(alimento);
                        return false;
                    }else{
                        image.setLayoutX(29);
                        image.setLayoutY(302); 
                        return false;
                    }
                }

            case Macarrao:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.Macarrao)) {
                        image.setLayoutX(580);
                        image.setLayoutY(60);
                        return true;
                    } else {
                        image.setLayoutX(250);
                        image.setLayoutY(343);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(250);
                        image.setLayoutY(343);
                        prato.tirarComida(EnumAlimento.Macarrao);
                        return false;
                    }else{
                        image.setLayoutX(250);
                        image.setLayoutY(343);
                        return false;
                    }
                }

            case peixe:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.peixe)) {
                        image.setLayoutX(630);
                        image.setLayoutY(50);
                        return true;
                    } else {
                        image.setLayoutX(312);
                        image.setLayoutY(343);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(312);
                        image.setLayoutY(343);
                        prato.tirarComida(EnumAlimento.peixe); 
                        return false;
                    }
                    else{
                        image.setLayoutX(312);
                        image.setLayoutY(343);
                        return false;
                    }
                }

            case maionese:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.maionese)) {
                        image.setLayoutX(620);
                        image.setLayoutY(30);
                        return true;
                    } else {
                        image.setLayoutX(250);
                        image.setLayoutY(297);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(250);
                        image.setLayoutY(297);
                        prato.tirarComida(EnumAlimento.maionese);
                        return false;
                    }
                    else{
                        image.setLayoutX(250);
                        image.setLayoutY(297);
                        return false;
                    }
                    
                }

            case pureBatata:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.pureBatata)) {
                        image.setLayoutX(590);
                        image.setLayoutY(20);
                        return true;
                    } else {
                        image.setLayoutX(327);
                        image.setLayoutY(300);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(327);
                        image.setLayoutY(300);
                        prato.tirarComida(EnumAlimento.pureBatata);
                        return false;
                    }else{
                        image.setLayoutX(327);
                        image.setLayoutY(300);
                        return false;
                    }
                    
                }

            case pureBatataDoce:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.pureBatataDoce)) {
                        image.setLayoutX(580);
                        image.setLayoutY(20);
                        return true;
                    } else {
                        image.setLayoutX(388);
                        image.setLayoutY(345);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(388);
                        image.setLayoutY(345);
                        prato.tirarComida(EnumAlimento.pureBatataDoce); 
                        return false;
                    }else{
                        image.setLayoutX(388);
                        image.setLayoutY(345);
                        return false; 
                    }
                    

                }

            case salada:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.salada)) {
                        image.setLayoutX(550);
                        image.setLayoutY(40);
                        return true;
                    } else {
                        image.setLayoutX(416);
                        image.setLayoutY(303);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(416);
                        image.setLayoutY(303);
                        prato.tirarComida(EnumAlimento.salada);
                        return false;
                    }else{
                        image.setLayoutX(416);
                        image.setLayoutY(303);
                        return false;
                    }                   
                }

            case strognoff:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.strognoff)) {
                        image.setLayoutX(569);
                        image.setLayoutY(50);
                        return true;
                    } else {
                        image.setLayoutX(463);
                        image.setLayoutY(347);
                        return false;
                    }

                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(463);
                        image.setLayoutY(347);
                        prato.tirarComida(EnumAlimento.strognoff);
                        return false;
                    }
                    else{
                        image.setLayoutX(463);
                        image.setLayoutY(347);
                        return false;
                    }
                    
                }

            case feijao:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.feijao)) {
                        image.setLayoutX(590);
                        image.setLayoutY(39);
                        return true;
                    } else {
                        image.setLayoutX(489);
                        image.setLayoutY(299);
                        return false;
                    }
                } else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(489);
                        image.setLayoutY(299);
                        prato.tirarComida(EnumAlimento.feijao);
                        return false;
                    }
                    else{
                        image.setLayoutX(489);
                        image.setLayoutY(299);
                        return false;
                    }
                    
                }

            case farofa:
                if (x > 470 && x < 665 && y > 0 && y < 200) {
                    if (prato.InseriComida(EnumAlimento.farofa)) {
                        image.setLayoutX(620);
                        image.setLayoutY(50);
                        return true;
                    } else {
                        image.setLayoutX(539);
                        image.setLayoutY(347);
                        return false;
                    }
                } 
                else {
                    if(!prato.verifica(alimento)){
                        image.setLayoutX(539);
                        image.setLayoutY(347);
                        prato.tirarComida(EnumAlimento.farofa);
                        return false;
                    }else{
                        image.setLayoutX(539);
                        image.setLayoutY(347);
                        return false;
                    }
                    
                }
        }
        return false;
    }
}
