/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.service;

import static balancasaudavel.enuns.EnumDao.DaoArquivo;
import balancasaudavel.factory.FactoryDao;
import balancasaudavel.interfaces.DaoBridge;
import balancasaudavel.usuario.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author jjbvi
 */
public class ServiceUsuario {
    private DaoBridge dao = FactoryDao.GETINSTANCE(DaoArquivo);
    
    public boolean cadastrar(Usuario user){
        return dao.Register(user);
    }
    
    public Usuario find(Usuario user){
        return dao.find(user);
    }
    
    public void save() throws IOException{
        dao.save();
    }
    
    public void load() throws IOException, FileNotFoundException, ClassNotFoundException{
        dao.load();
    }
}
