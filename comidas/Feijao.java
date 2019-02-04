/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.comidas;

import balancasaudavel.abstrato.ComidaAbstract;

/**
 *
 * @author jjbvi
 */
public class Feijao extends ComidaAbstract{
    private final double carboidrato = 13.6;
    private final double proteina = 4.8;
    private final double gordurasTotais = 0.5;
    private final double porcao = 100;
    private int codigo = 13;
    

    @Override
    public double getCarboidrato() {
        return carboidrato;
    }

    @Override
    public double getProteina() {
        return proteina;
    }

    @Override
    public double getGordurasTotais() {
        return gordurasTotais;
    }

    @Override
    public double getPorcao() {
        return porcao;
    }

    @Override
    public String toString() {
        return "Feijao{" + "carboidrato=" + carboidrato + ", proteina=" + proteina + ", gordurasTotais=" + gordurasTotais + ", porcao=" + porcao + ", codigo=" + codigo + '}';
    }
    
    
}
