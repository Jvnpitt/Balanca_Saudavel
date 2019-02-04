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
public class Strognoff extends ComidaAbstract{
    private final double carboidrato = 2.6;
    private final double proteina = 17.6;
    private final double gordurasTotais = 8.0;
    private final double porcao = 100;
    private int codigo = 12;

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
        return "Strognoff{" + "carboidrato=" + carboidrato + ", proteina=" + proteina + ", gordurasTotais=" + gordurasTotais + ", porcao=" + porcao + ", codigo=" + codigo + '}';
    }
    
    
}
