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
    private static void Stand(Jugador player){
        //Dejar de tomar cartas
        player.setStanding(true);
        System.out.println("\n Player now Standing...");
    }
    private static void Hit(Jugador player,Baraja deck) throws Baraja.noMoreCardsException{
        //Tomar carta 
        player.setMano(deck.tomar_carta());
    }
    private static void Hit(Jugador player,Baraja deck,boolean verbose) throws Baraja.noMoreCardsException{
        //Tomar carta 
        player.setMano(deck.tomar_carta(),verbose);
    }
    private static void DoubleDown(int bet, Jugador player, Baraja deck) throws Baraja.noMoreCardsException{
        //Doblar la apuesta > tomar 1 carta > dejar de tomar cartas
        System.out.println("\n Incrementando Apuesta...");
        player.setApuesta(bet*2);
        player.setGanancias(player.getGanancias()-bet);
        System.out.println("\n  Ud apuesta "+player.getApuesta()+ " le queda "+player.getGanancias()+" en la bolsa \n");
        Hit(player, deck);
        Stand(player);
    }
    private void Split(){// no se implemantará
        //si la mano son 2 cartas del mismo valor se pueden separar en 2 manos independientes.
    }
    private static void Surrender(){
        //solo disponible en la 1ra mano, jugador pierde la mitad de la apuesta.
    }
    
    
    public static void Play() throws Baraja.noMoreCardsException{
        Baraja baraja=new Baraja();
        int ronda=0, apuesta=1;
        System.out.println("Ingresando Jugador, Ingrese su monto de entrada");
        Jugador user= new Jugador(reader.nextInt()), dealer = new Jugador(10000);
        System.out.println("\nVamos a jugar BlackJack !!");
        playloop: while (user.getGanancias()>0 && dealer.getGanancias()>0){
            user.setPlayerturn(true);
            System.out.println("\n  ~~ Ronda "+(++ronda)+" ~~");
            System.out.println("\n Ingrese apuesta: ");
            apuesta=reader.nextInt();
            user.setApuesta(apuesta);
            user.setGanancias(user.getGanancias()-apuesta);
            System.out.println("\n  Ud apuesta "+user.getApuesta()+ " le queda "+user.getGanancias()+" en la bolsa \n");
            roundloop: while (true){
                if (user.getMano().size()<2){
                        Hit(user,baraja);//user.setMano(baraja.tomar_carta());
                        Hit(dealer,baraja,false);//dealer.setMano(baraja.tomar_carta());
                }
                else if(user.isPlayerturn() && !user.getStanding() ){
                    System.out.println("\n Es tu turno!!");
                    user.verMano();
                    if (user.evaluaManoBJ()==21 ){
                        System.out.println("\n BLACK JACK!!");
                        Stand(user);
                    }
                    if (!user.getStanding()){
                    switch(menuAcciones()){
                            case 1:
                                Hit(user,baraja);
                                if (user.evaluaManoBJ()>21){
                                    System.out.println(" - Te pasaste de puntos - ");
                                    Lose(user,dealer);
                                    break roundloop;
                                }
                                break;
                            case 2:
                                DoubleDown(apuesta, user, baraja);
                                if (user.evaluaManoBJ()>21){
                                    System.out.println(" - Te pasaste de puntos - ");
                                    Lose(user,dealer);
                                    break roundloop;
                                }
                                break;
                            case 3:
                                Stand(user);
                                break;
                            case 4:
                                Lose(user,dealer);
                                break roundloop;
                            case 5:
                                System.out.println("\n Ending Game ... ");
                                break playloop;
                        }
                    }
                    user.setPlayerturn(false);
                }
                else if (!dealer.getStanding()){
                    System.out.println("\n Dealer's Turn...");
                    //dealer.verMano();
                    if (dealer.evaluaManoBJ()==21 ){
                        dealer.verMano();
                        System.out.println("\n Dealer Tiene BLACK JACK!!");
                        Lose(user,dealer);
                        break roundloop;
                    }
                    else if (dealer.evaluaManoBJ()<18) Hit(dealer,baraja);
                    else if (dealer.evaluaManoBJ()>=18) Stand(dealer);
                    user.setPlayerturn(true);
                }
                else if (user.getStanding() && dealer.getStanding()){
                    Showdown(user,dealer);
                    break roundloop;
                }
            }
        }
    }
    
    private static int menuAcciones(){
        System.out.println("\n Acciones disponibles, por favor elija un número: "
                + "\n 1 - Hit"
                + "\n 2 - DoubleDown"
                + "\n 3 - Stand"
                + "\n 4 - Surrender"
                + "\n 5 - Quit");
        return reader.nextInt();
    }
    
    private static void Showdown(Jugador player, Jugador dealer){
        System.out.println("\n -- ShowDown -- \n Tu mano: ");
        player.verMano();
        System.out.println("\n La mano del Dealer: ");
        dealer.verMano();
        if (dealer.evaluaManoBJ()>21 || player.evaluaManoBJ()>dealer.evaluaManoBJ()) Win(player,dealer);
        else Lose(player,dealer);
    }
    
    private static void Lose(Jugador player, Jugador dealer){
        System.out.println("\n House Wins \n Siguiente Ronda ...");
        dealer.setGanancias(dealer.getGanancias()+player.getApuesta());
        player.clearMano();
        player.setStanding(false);
        dealer.clearMano();
        dealer.setStanding(false);
    }
    
    private static void Win(Jugador player, Jugador dealer){
        System.out.println("\n Player Wins \n Siguiente Ronda ...");
        player.setGanancias(player.getGanancias()+(player.getApuesta()*2));
        player.clearMano();
        player.setStanding(false);
        dealer.clearMano();
        dealer.setStanding(false);
    }
}