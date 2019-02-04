/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.dao;

import balancasaudavel.arquivo.Arquivo;
import balancasaudavel.interfaces.DaoBridge;
import balancasaudavel.usuario.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jjbvi
 */
public class DaoUsuario implements DaoBridge {

    private static DaoUsuario instance;
    private ArrayList<Usuario> list;
    private Arquivo arquivo;
    private File file;

    private DaoUsuario() {
        list = new ArrayList<>();
        this.file = new File("PegaPorFavor.dat");
    }

    public static DaoUsuario GetInstance() {
        if (instance == null) {
            instance = new DaoUsuario();
        }
        return instance;
    }

    @Override
    public boolean Register(Usuario user) {
        list.add(user);
        return true;
    }

    @Override
    public Usuario find(Usuario user) {
        int tam = list.size();
        int i = 1;
        while(i < tam){
            if(user.getLogin().equals(list.get(i).getLogin())){
                if(user.getSenha().equals(list.get(i).getSenha())){
                    return list.get(i) ;
                }
            }
        }
        return null;
    }

    @Override
    public void save() throws IOException {
        arquivo.AbrirParaEscrita(this.file);
        arquivo.saveObject(list);
        arquivo.FecharParaEscrita();
    }

    @Override
    public void load() throws IOException, FileNotFoundException, ClassNotFoundException {
 
            try {
                arquivo.AbrirParaEscrita(this.file);
                arquivo.FecharParaEscrita();
                arquivo.AbrirParaLeitura(this.file);
                Usuario user = arquivo.readObject();
                    while (user != null) {
                        list.add(user);
                        user = arquivo.readObject();
                    }
                arquivo.FecharParaLeitura();
            }
            catch (NullPointerException e) {
            return;
            }
        
    }

}
