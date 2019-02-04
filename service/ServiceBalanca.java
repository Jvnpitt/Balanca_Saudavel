/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import balancasaudavel.balanca.Imc;
import balancasaudavel.balanca.Medidas;
import balancasaudavel.balanca.Prato;

/**
 *
 * @author jjbvi
 */
public class ServiceBalanca {
    public static int balanca(double altura, double peso, Prato prato){
        double imc = Imc.imc(altura, peso);
        return Medidas.medidas(imc, altura);
    } 
}
