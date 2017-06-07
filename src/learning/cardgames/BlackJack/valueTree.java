/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.cardgames.BlackJack;

import java.util.HashSet;
import java.util.Iterator;
import learning.cardgames.Carta;

/**
 *
 * @author gustavo.armando
 */
public class valueTree {
    public void generarPosibleManos(HashSet <Carta> mano){
        Iterator it=mano.iterator();
        while (it.hasNext()){
            NodoArbol nodo=new NodoArbol();
            Carta card=(Carta) it.next();
            
        }
        
    }
    
    
}

class NodoArbol{
    private int valora,valorb;
    public void setValora(int valor){
        this.valora=valor;
    }
    public void setValorb(int valor){
        this.valorb=valor;
    }
    public int getValora(){
        return this.valora;
    }
    public int getValorb(){
        return this.valorb;
    }
    
    private nodo padre,hijo1,hijo2;
    public void setPadre(nodo nodo){
        this.padre=nodo;
    }
    public void setHijo1(nodo nodo){
        this.hijo1=nodo;
    }
    public void setHijo2(nodo nodo){
        this.hijo2=nodo;
    }
    public nodo getPadre(){
        return this.padre;
    }
    public nodo getHijo1(){
        return this.hijo1;    
    }
    public nodo getHijo2(){
        return this.hijo2;
    }
    
}