/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancasaudavel.usuario;

import java.io.Serializable;

/**
 *
 * @author jjbvi
 */
public class Usuario implements Serializable{
    private String login;
    private String senha;
    private int idade;
    private double altura;
    private double peso;
    private double Score;
    private boolean sexo;

    public Usuario(String login, String senha, int idade, double altura, double peso) {
        this.login = login;
        this.senha = senha;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
    
    public Usuario(String login) {
        this.login = login;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Login: "); sb.append(this.login);
        sb.append(" Score: "); sb.append(this.Score);
        sb.append(this.altura);
        return sb.toString();
    }
}
