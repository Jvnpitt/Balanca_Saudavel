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
public class Medidas {
    public static int medidas(double imc, double altura){
       if(altura >= 1.46 && altura <= 1.54){
            if(imc <= 24.0){
                return 2;
            }
            else if(imc <=29.0){
                return 3;
            }
            else if(imc <= 39.0){
                return 4;
            }
            else{
                return 5;
            }
       }
       else if(altura <= 1.60){
           if(imc <= 17){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc  <= 29){
               return 3;
           }
           else if(imc <= 38){
               return 4;
           }
           else{
               return 5;
           }
       }
       else if(altura <= 1.65){
           if(imc <= 18){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc <= 29){
               return 3;
           }
           else if(imc <= 35){
               return 4;
           }
           else{
               return 5;
           }
       }
       else if(altura <= 1.70){
           if(imc <= 18){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc <= 29){
               return 3;
           }
           else if(imc <= 32){
               return 4;
           }
           else{
               return 5;
           }
       }
       else if(altura <= 1.75){
           if(imc <= 17){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc <= 29){
               return 3;
           }
           else if(imc <= 31){
               return 4;
           }
           else{
               return 5;
           }
       }
       else if(altura <= 1.80){
           if(imc <= 18){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc <= 29){
               return 3;
           }
           else if(imc <= 30){
               return 4;
           }
           else{
               return 5;
           }
       }
       else if(altura <= 1.85){
           if(imc <= 17){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc <= 28){
               return 3;
           }
           else if(imc <= 50){
               return 4;
           }
           else{
               return 5;
           }
       }
       else if(altura <= 1.90){
           if(imc <= 17){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc <= 26){
               return 3;
           }
           else if(imc <= 40){
               return 4;
           }
           else{
               return 5;
           }
       }
       else{
           if(imc <= 17){
               return 1;
           }
           else if(imc <= 24){
               return 2;
           }
           else if(imc <= 26){
               return 3;
           }
           else if(imc <= 40){
               return 4;
           }
           else{
               return 5;
           }
       }
    } 
}
