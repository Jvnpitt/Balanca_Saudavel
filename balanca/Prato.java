/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.balanca;

import balancasaudavel.abstrato.ComidaAbstract;
import balancasaudavel.comidas.Arroz;
import balancasaudavel.comidas.ArrozIntegral;
import balancasaudavel.comidas.Carne;
import balancasaudavel.comidas.Farofa;
import balancasaudavel.comidas.Feijao;
import balancasaudavel.comidas.Frango;
import balancasaudavel.comidas.Macarrao;
import balancasaudavel.comidas.Maionese;
import balancasaudavel.comidas.Ovo;
import balancasaudavel.comidas.Peixe;
import balancasaudavel.comidas.PureBatata;
import balancasaudavel.comidas.PureBatataDoce;
import balancasaudavel.comidas.Salada;
import balancasaudavel.comidas.Strognoff;
import balancasaudavel.comidas.Sushi;
import balancasaudavel.enuns.EnumAlimento;
import java.util.ArrayList;

/**
 *
 * @author jjbvi
 */
public class Prato {
    private static ArrayList<ComidaAbstract> comidas = new ArrayList<>();
    private int numComidas = 0;
    
    public int getNumComidas(){
        return this.numComidas;
    }

    public ArrayList<ComidaAbstract> getComidas() {
        return comidas;
    }
    
    public boolean InseriComida(EnumAlimento alimento){
        switch(alimento){
            case carne:
                if(this.numComidas < 5){
                  comidas.add(new Carne());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }
            case Ovo:
                if(this.numComidas < 5){
                  comidas.add(new Ovo());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }
            case frango:
                if(this.numComidas < 5){
                  comidas.add(new Frango());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }
            case arroz:
                if(this.numComidas < 5){
                  comidas.add(new Arroz());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }
            case ArrozIntegral:
                if(this.numComidas < 5){
                  comidas.add(new ArrozIntegral());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }
            case Macarrao:
                if(this.numComidas < 5){
                  comidas.add(new Macarrao());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }
            case Sushi:
                if(this.numComidas < 5){
                  comidas.add(new Sushi());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }    
            case maionese:
                if(this.numComidas < 5){
                  comidas.add(new Maionese());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                } 
            case peixe:
                if(this.numComidas < 5){
                  comidas.add(new Peixe());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                } 
            case pureBatata:
                if(this.numComidas < 5){
                  comidas.add(new PureBatata());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                } 
            case pureBatataDoce:
                if(this.numComidas < 5){
                  comidas.add(new PureBatataDoce());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }
            case salada:
                if(this.numComidas < 5){
                  comidas.add(new Salada());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                } 
            case strognoff:
                if(this.numComidas < 5){
                  comidas.add(new Strognoff());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }  
            case feijao:
                if(this.numComidas < 5){
                  comidas.add(new Feijao());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }  
            case farofa:
                if(this.numComidas < 5){
                  comidas.add(new Farofa());
                  this.numComidas++;
                  return true;
                }
                else{
                    return false;
                }  
            }
        return false;
        }
    public boolean tirarComida(EnumAlimento alimento){
        switch(alimento){
            case carne:    
                comidas.remove(new Carne());
                this.numComidas --;
                return true;
                
            case Ovo:
                comidas.remove(new Ovo());
                this.numComidas --;
                return true;
                
            case frango:
                comidas.remove(new Frango());
                this.numComidas --;
                return true;
                
            case arroz:
                comidas.remove(new Arroz());
                this.numComidas --;
                return true;
                
            case ArrozIntegral:
               comidas.remove(new ArrozIntegral());
               this.numComidas --;
                return true;
                
            case Macarrao:
               comidas.remove(new Macarrao());
               this.numComidas --;
                return true;
                
            case Sushi:
                comidas.remove(new Sushi());
                this.numComidas --;
                return true;
                
            case maionese:
                comidas.remove(new Maionese());
                this.numComidas --;
                return true;
                
            case peixe:
                comidas.remove(new Peixe());
                this.numComidas --;
                return true;
                
            case pureBatata:
                comidas.remove(new PureBatata());
                this.numComidas --;
                return true;
                
            case pureBatataDoce:
                comidas.remove(new PureBatataDoce());
                this.numComidas --;
                return true;
                
            case salada:
                comidas.remove(new Salada());
                this.numComidas --;
                return true;
                
            case strognoff:
                comidas.remove(new Strognoff());
                this.numComidas --;
                return true;
                
            case feijao:
                comidas.remove(new Feijao());
                this.numComidas --;
                return true;
                
            case farofa:
                comidas.remove(new Farofa());
                this.numComidas --;
                return true; 
            }
        return false;
    }
    
    public boolean verifica(EnumAlimento alimento){
        switch(alimento){
            case carne:    
                return comidas.contains(new Carne());
                
            case Ovo:
                return comidas.contains(new Ovo());
                
            case frango:
                return comidas.contains(new Frango());
                
            case arroz:
                return comidas.contains(new Arroz());
                
            case ArrozIntegral:
               return comidas.contains(new ArrozIntegral());
                
            case Macarrao:
               return comidas.contains(new Macarrao());
                
            case Sushi:
                return comidas.contains(new Sushi());
                
            case maionese:
                return comidas.contains(new Maionese());
                
            case peixe:
                return comidas.contains(new Peixe());
                
            case pureBatata:
                return comidas.contains(new PureBatata());
                
            case pureBatataDoce:
                return comidas.contains(new PureBatataDoce());
                
            case salada:
                return comidas.contains(new Salada());
                
            case strognoff:
                return comidas.contains(new Strognoff());
                
            case feijao:
                return comidas.contains(new Feijao());
                
            case farofa:
                return comidas.contains(new Farofa());
            }
        return false;
        }
    }
    


