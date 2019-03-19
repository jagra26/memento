package com.company;

import java.util.ArrayList;

public class caretaker {
    ArrayList<memento> estados;
    public caretaker(){
        estados = new ArrayList<>();
    }
    void addMemento(memento memento){
        estados.add(memento);
    }
    memento getEstado(){
        memento estadoSalvo = estados.get(estados.size()-1);
        //estados.remove(estados.size()-1);
        return estadoSalvo;
    }
    void atualizar(){
        estados.remove(estados.size()-1);
    }
}
