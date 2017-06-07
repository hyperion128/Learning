/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.cardgames;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author gustavo.armando
 */
public class Baraja {
    private final HashSet<Carta> deck; 
    private Iterator<Carta>it;
    
    public Baraja(){
        deck=new HashSet<>();
        crear_baraja(deck);
        //System.out.println(deck);
    }
    
    public Carta tomar_carta() throws noMoreCardsException{
        it=deck.iterator();
        return it.next();
    }
    
    public void barajear(HashSet<Carta> deck){
        deck.clear();
        crear_baraja(deck);
    }
    
    private void crear_baraja(HashSet<Carta> deck){
        it=deck.iterator();
        String[] colores= {"Diamantes","Corazones","Espadas","Trebol"};
        String[] numeros={"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","As"};
        for(String colortmp:colores){
            for(String numerostmp:numeros)deck.add(new Carta(colortmp,numerostmp));
        }
    }

    public static class noMoreCardsException extends Exception {
        public noMoreCardsException() {
            System.out.println("No hay más cartas, you lose...");
        }
    }
}
