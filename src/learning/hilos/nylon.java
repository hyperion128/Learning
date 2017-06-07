/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.hilos;

/**
 *
 * @author gustavo.armando
 */
public class nylon extends Thread{
    /*
     Implementacion de hilos por medio de herrencia sobre la clase Thread, requiere override sobre su metodo run(), 
     se corre ejecutando el metodo start del objeto que se cree de esta clase.
    */
    String color="";
    public nylon(String color){
        this.color=color;
    }
    public void run(){
        for (int i=1; i<10; i++)System.out.println("Maquilando carrete "+i+" de color "+color);
    }
}
