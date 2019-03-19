package com.company;

public class memento {
    protected String estadoNome;
    protected int estadoLogin;
    public memento(String nome, int login){
        estadoNome = nome;
        estadoLogin = login;
    }
    public String getEstadoNome(){
        return estadoNome;
    }
    public  int getEstadoLogin(){
        return estadoLogin;
    }
}
