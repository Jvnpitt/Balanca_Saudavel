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
public class Maionese extends ComidaAbstract{
    private final double carboidrato = 7.9;
    private final double proteina = 0.6;
    private final double gordurasTotais = 30.5;
    private final double porcao = 100;
    private int codigo = 8;

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
        return "Maionese{" + "carboidrato=" + carboidrato + ", proteina=" + proteina + ", gordurasTotais=" + gordurasTotais + ", porcao=" + porcao + ", codigo=" + codigo + '}';
    }
    
    
}
