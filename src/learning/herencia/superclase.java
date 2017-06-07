/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.herencia;

/**
 *
 * @author gustavo.armando
 */
public class superclase {
    private int varprivada;
    protected int varrestringida;
    public int varpublica;
    int varsinmodifier;
    
    public superclase(){
        varprivada=10;
        varrestringida=20;
        varpublica=30;
        varsinmodifier=40;
    }
    superclase(int a, int b, int c, int d){
        varprivada=a;
        varrestringida=b;
        varpublica=c;
        varsinmodifier=d;
    }


    
    public void setvarprivada(int valor){
        this.varprivada=valor;
    }
    
    public int getvarprivada(){
        return this.varprivada;
    }
}
