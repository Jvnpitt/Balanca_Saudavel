/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.interfaces;

import balancasaudavel.usuario.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author jjbvi
 */
public interface DaoBridge {
    public boolean Register(Usuario user);
    public Usuario find(Usuario user);
    public void save()throws IOException;
    public void load()throws IOException, FileNotFoundException, ClassNotFoundException;
}
