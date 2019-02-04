/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.arquivo;

import balancasaudavel.usuario.Usuario;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jjbvi
 */
public class Arquivo {

    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    public void AbrirParaLeitura(File nomeArq) {
        try {
            FileInputStream arq = new FileInputStream(nomeArq);
            input = new ObjectInputStream(arq);
        } catch (IOException ioException) {
            System.exit(1);
        }
        
    }

    public void AbrirParaEscrita(File arq) {
        if (arq.exists() == false) {
            try {
                FileOutputStream fout = new FileOutputStream(arq);
                output = new ObjectOutputStream(fout);
            } catch (IOException ioException) {
                System.exit(1);
            }
        } 
        else {
            try {
                FileOutputStream fout = new FileOutputStream(arq);
                output = new ObjectOutputStream(fout) {
                    @Override
                    protected void writeStreamHeader() throws IOException {
                        reset();
                    }
                };
            } catch (IOException ioException) {
                System.exit(1);
            }
        }
    }

    public void FecharParaEscrita() {
        try {
            if (output != null) {
                output.close();
                output = null;
            }
        } catch (IOException ioException) {
            System.exit(1);
        }
    }
    
    public void FecharParaLeitura(){
        try {
            if (input != null) {
                input.close();
                input = null;
            }
        } catch (IOException ioException) {
            System.exit(1);
        }
    }

    public void saveObject(ArrayList<Usuario> list) {
        try {
            if (output != null) {
                int TAM = list.size();
                int i = 0;
                while (i <= TAM) {
                    output.writeObject(list.get(i));
                    output.flush();
                    i++;
                }
            }
        }
        catch(IOException ioException){
            System.exit(1);
        }
    }
    
    public Usuario readObject(){
        Usuario user;
        try{
            while(true){
               return user = (Usuario) input.readObject();
            }
        }
        catch(EOFException eofException){
            System.exit(1);
        }
        catch(ClassNotFoundException classNotFoundException){
            System.exit(1);
        }
        catch(IOException ioException){
            System.exit(1);
        }
        return null;
    }
}
