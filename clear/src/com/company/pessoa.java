package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class pessoa {
    public String nome;
    public int login;
    @Override
    public String toString() { return "nome: "+ this.nome + "\nlogin:" + this.login + "\n";}
    pessoa(){
        System.out.print("insira um nome:\n");
        Scanner entrada = new Scanner(System.in);
        this.nome = entrada.nextLine();
        System.out.print("insira um login:\n");
        this.login = entrada.nextInt();
    }
    void info(){
        System.out.print(this);
    }
}
