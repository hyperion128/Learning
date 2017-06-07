/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import learning.cardgames.Baraja;
import learning.herencia.subclase;
import learning.herencia.superclase;
import learning.passwd_generator.passwd;
import learning.hilos.*;

/**
 *
 * @author gustavo.armando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        /*
        superclase objeto=new subclase();        
        System.out.println(objeto.varpublica)   ;     
        
        for(int i=0;i<10;i++)
            System.out.println(passwd.generatePasswd(15)); 
        */
      // Ejemplo de hilos con implementacion de herencia a Thread; 
      // se crea el objeto (implicitamente por herenciade tipo Thread)  y se corre su metodo start()
      /*
        nylon hilo =new nylon("Negro");
        nylon estambre =new nylon("Rojo");
        hilo.start();
        estambre.start();
        */
        
      // Ejemplo de hilos con implementacion de interface Runnable; 
      // se crea un objeto de tipo Thread y se manda a su constructor el objeto con implementacion runnable, se corre su mentodo start()
      /*
        Thread manatarms= new Thread(new Herreria("Espada de Acero Valyrio"));
        Thread baltimorebrothers= new Thread(new Herreria("Frostmourne"));
        manatarms.start();
        baltimorebrothers.start();
       */
      
      //Baraja baraja=new Baraja();
      ArrayList<String> a=new ArrayList();
      a.add("As");
      a.add("9");
      a.add("King");
      a.add("9");
      a.add("As");
      
      Collections.sort(a);
      System.out.println(a);
    }
    
}
