/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.factory;

import balancasaudavel.dao.DaoUsuario;
import balancasaudavel.enuns.EnumDao;
import balancasaudavel.interfaces.DaoBridge;

/**
 *
 * @author jjbvi
 */
public class FactoryDao {
    public static DaoBridge GETINSTANCE(EnumDao dao){
        switch(dao){
            case DaoArquivo: 
                return DaoUsuario.GetInstance();
            case DaoSql:
                return null;
        }
        return null;
    }
}
