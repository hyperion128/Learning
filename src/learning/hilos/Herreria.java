/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.hilos;
import learning.passwd_generator.passwd;

/**
 *
 * @author gustavo.armando
 */
public class Herreria extends passwd implements Runnable {
   /* La clase herreria implmenta hilos por medio de la interfaz runnable, permitiendome aplicar herrencia (extends) de otra clase y llamar sus metodos directamente,
    para éste caso la clase "passwd" es un generador de contraseñas con un metodo estatico generatePasswd(int), sin embargo la llamada que hago desde aqui es por herrencia
    (como el metodo es estatico tmb lo podria haber llamado sin extender la clase y llamandolo directamente como passwd.generatePasswd(int))
    */ 
    String Pedido;
    public Herreria(String pedido){
        this.Pedido=pedido;
    }
    
    @Override
    public void run() {
       for(int i=1;i<10;i++){
           System.out.println("El herrero esta haciendo el/la "+i+"° "+Pedido+ " con número de serie "+generatePasswd(5));
       }
    }
    
    
    
}
