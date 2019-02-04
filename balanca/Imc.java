/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.balanca;

/**
 *
 * @author jjbvi
 */
public class Imc {
    public static double imc(double altura, double peso){
        double imc =  peso/(altura * altura);
        System.out.println(imc);
        return imc;
    }
}
