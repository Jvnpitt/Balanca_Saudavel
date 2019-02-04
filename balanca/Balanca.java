/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.balanca;

import balancasaudavel.abstrato.ComidaAbstract;
import balancasaudavel.usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author jjbvi
 */
public class Balanca { 
    public static double carboidrato(Prato prato){
        ArrayList<ComidaAbstract>comidas = prato.getComidas();
        int i = 0;
        int tam = comidas.size();
        double carboidrato = 0;
        while(i < tam){
            ComidaAbstract objeto = comidas.get(i);
            carboidrato += objeto.getCarboidrato();
            i++;
        }
        return carboidrato;
    } 
    
    public static double proteina(Prato prato){
        ArrayList<ComidaAbstract>comidas = prato.getComidas();
        int i = 0;
        int tam = comidas.size();
        double proteina = 0;
        while(i < tam){
            ComidaAbstract objeto = comidas.get(i);
            proteina += objeto.getProteina();
            i++;
        }
        return proteina;
    }
    
    public static double gorduraTotal(Prato prato){
        ArrayList<ComidaAbstract>comidas = prato.getComidas();
        int i = 0;
        int tam = comidas.size();
        double gorduraTotal = 0;
        while(i < tam){
            ComidaAbstract objeto = comidas.get(i);
            gorduraTotal += objeto.getGordurasTotais();
            i++;
        }
        return gorduraTotal;
    }
}
