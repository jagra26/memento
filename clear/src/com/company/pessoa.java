package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class pessoa {
    public String nome;
    public int login;
    caretaker caretaker;
    @Override
    public String toString() { return "nome: "+ this.nome + "\nlogin:" + this.login + "\n";}
    pessoa(){
        System.out.print("insira um nome:\n");
        Scanner entrada = new Scanner(System.in);
        this.nome = entrada.nextLine();
        System.out.print("insira um login:\n");
        this.login = entrada.nextInt();
        this.caretaker = new caretaker();
        caretaker.addMemento(new memento(this.nome, this.login));
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
                alterar_infos();
                break;
            case 2:
                break;
        }
    }
    void alterar_infos(){
        System.out.print("insira o novo nome:");
        Scanner entrada = new Scanner(System.in);
        this.nome = entrada.nextLine();
        System.out.print("insira o novo login:");
        this.login = entrada.nextInt();
        caretaker.addMemento(new memento(this.nome, this.login));
    }
    void undo(){
        nome = caretaker.getEstado().getEstadoNome();
        login = caretaker.getEstado().getEstadoLogin();
        caretaker.atualizar();
        info();
    }

}
