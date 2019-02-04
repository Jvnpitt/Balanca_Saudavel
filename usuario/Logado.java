/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.usuario;

/**
 *
 * @author jjbvi
 */
public class Logado {
    private static Usuario user;
    
    public static void instance(Usuario usuario){
        user = usuario;
    }
    
    public static Usuario getInstance(){
        return user;
    }
}
