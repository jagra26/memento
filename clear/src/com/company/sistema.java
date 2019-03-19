package com.company;

import java.util.Scanner;

public class sistema {
    public pessoa eu;
    boolean menu_inicial(){
        System.out.print("1-novo usuario 2- sair\n");
        Scanner entrada = new Scanner(System.in);
        int resposta = entrada.nextInt();
        if (resposta == 1){
            return menu2();
        }
        else {
            return false;
        }
    }
    boolean menu2(){
        this.eu = new pessoa();
        return menu3();
    }
    boolean menu3(){
        boolean sair = false;
        while (!sair){
            System.out.print("1- info 2- alterar info 3- undo 4- sair \n");
            Scanner entrada = new Scanner(System.in);
            int resp = entrada.nextInt();
            if (resp == 1){
                this.eu.info();
            }
            else if(resp == 2){
                this.eu.alterar_info();
            }
            else if(resp == 3){
                this.eu.undo();
            }
            else{
                sair = true;
            }
        }
        return  sair;
    }
}
