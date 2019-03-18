package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class pessoa {

    public String nome;
    public int login;
    public ArrayList<String> nomes_velhos;
    public ArrayList<Integer> logins_velhos;
    @Override
    public String toString() { return "nome: "+ this.nome + "\nlogin:" + this.login + "\n";}
    pessoa(){
        nomes_velhos = new ArrayList<>();
        logins_velhos = new ArrayList<>();
        System.out.print("insira um nome:\n");
        Scanner entrada = new Scanner(System.in);
        this.nome = entrada.nextLine();
        this.nomes_velhos.add(this.nome);
        System.out.print("insira um login:\n");
        this.login = entrada.nextInt();
        this.logins_velhos.add(this.login);
    }
    void info(){
        System.out.print(this);
    }
    void alterar_info(){
        System.out.print("voce deseja alterar a informação?\n 1- sim 2- não\n");
        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();
        switch(escolha){
            case 1:
                alterar_nome();
                alterar_login();
                break;
            case 2:
                break;
        }
    }
    void alterar_nome(){
        System.out.print("insira o novo nome:");
        this.nomes_velhos.add(this.nome);
        Scanner entrada = new Scanner(System.in);
        this.nome = entrada.nextLine();
    }
    void alterar_login(){
        System.out.print("insira o novo login:");
        this.logins_velhos.add(this.login);
        Scanner entrada = new Scanner(System.in);
        this.login = entrada.nextInt();
    }
    void undo(){
        //System.out.print(this.logins_velhos.size());
        //System.out.print(this.nomes_velhos.size());
        this.login = this.logins_velhos.get(this.logins_velhos.size()-1);
        this.nome = this.nomes_velhos.get(this.nomes_velhos.size()-1);
        this.nomes_velhos.remove(this.nomes_velhos.size()-1);
        this.logins_velhos.remove(this.logins_velhos.size()-1);
        info();
    }
}
