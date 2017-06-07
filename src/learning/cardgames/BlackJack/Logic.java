/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.cardgames.BlackJack;

import java.util.HashMap;
import java.util.HashSet;
import learning.cardgames.Jugador;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import learning.cardgames.Baraja;
/**
 *
 * @author gustavo.armando
 */
public class Logic {
    private static final Scanner reader = new Scanner(System.in);
    
    private static void Stand(){
        //Dejar de tomar cartas
    }
    private static void Hit(Jugador player,Baraja deck) throws Baraja.noMoreCardsException{
        //Tomar carta 
        player.setMano(deck.tomar_carta());
    }
    private static void DoubleDown(){
        //Doblar la apuesta > tomar 1 carta > dejar de tomar cartas
    }
    private void Split(){// no se implemantará
        //si la mano son 2 cartas del mismo valor se pueden separar en 2 manos independientes.
    }
    private static void Surrender(){
        //solo disponible en la 1ra mano, jugador pierde la mitad de la apuesta.
    }
    
    
    public static void Play() throws Baraja.noMoreCardsException{
        Baraja baraja=new Baraja();
        int ronda=1, apuesta=1;
        System.out.println("Ingresando Jugador, Ingrese su monto de entrada");
        Jugador user= new Jugador(reader.nextInt()), dealer = new Jugador(10000);
        System.out.println("\nVamos a jugar BlackJack !!");
        user.setPlayerturn(true);
        while (user.getGanancias()>0 && dealer.getGanancias()>0){
            System.out.println("\n Ingrese apuesta: ");
            apuesta=reader.nextInt();
            user.setApuesta(apuesta);
            user.setGanancias(user.getGanancias()-apuesta);
            System.out.println("\n  Ronda "+ronda+", ud apuesta "+user.getApuesta()+ " le queda "+user.getGanancias()+" en la bolsa \n");
            while (true){
                if (user.getMano().size()<2){
                        Hit(user,baraja);//user.setMano(baraja.tomar_carta());
                        Hit(dealer,baraja);//dealer.setMano(baraja.tomar_carta());
                }
                else if(user.isPlayerturn()){
                    System.out.println("Es tu turno!!");
                    user.verMano();
                    switch(menuAcciones()){
                        case 1:
                            Hit(user,baraja);
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    user.setPlayerturn(false);
                }
                else{
                    dealer.verMano();
                    
                    user.setPlayerturn(true);
                }
            }
            
        }
        
        
    }
    
    private static int menuAcciones(){
        System.out.println("\n Acciones disponibles, por favor elija un número: "
                + "\n 1 - Hit"
                + "\n 2 - DoubleDown"
                + "\n 3 - Surrender");
        return reader.nextInt();
    }
    
    
}
