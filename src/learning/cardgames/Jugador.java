/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.cardgames;

import java.util.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author gustavo.armando
 */
public class Jugador {
    private int apuesta, ganancias;
    private HashSet<Carta> mano= new HashSet();
    private Carta carta;
    private Iterator it;
    private boolean playerturn=false, standing=false;
    
    public Jugador(int DineroDeEntrada){
        setGanancias(DineroDeEntrada);
    }

    /**
     * @return the apuesta
     */
    public int getApuesta() {
        return apuesta;
    }

    /**
     * @param apuesta the apuesta to set
     */
    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    /**
     * @return the ganancias
     */
    public int getGanancias() {
        return ganancias;
    }

    /**
     * @param ganancias the ganancias to set
     */
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    /**
     * @return the mano
     */
    public HashSet<Carta> getMano() {
        return mano;
    }

    /**
     * @param mano the mano to set
     */
    public void setMano(Carta carta) {
        System.out.println("Sacaste un "+carta.getValor() +" de "+carta.getColor());
        this.mano.add(carta);
    }
    
    public void setMano(Carta carta,boolean verbose) {
        if (verbose)System.out.println("Sacaste un "+carta.getValor() +" de "+carta.getColor());
        this.mano.add(carta);
    }

    /**
     * @return the playerturn
     */
    public boolean isPlayerturn() {
        return playerturn;
    }

    /**
     * @param playerturn the playerturn to set
     */
    public void setPlayerturn(boolean playerturn) {
        this.playerturn = playerturn;
    }
    
        
    public boolean getStanding() {
        return standing;
    }

    /**
     * @param playerturn the playerturn to set
     */
    public void setStanding(boolean standing) {
        this.standing = standing;
    }

    public void verMano(){
        it = mano.iterator();
        while(it.hasNext()){
            carta=(Carta) it.next();
            System.out.print(carta.getValor()+" de "+carta.getColor()+" | ");
        }
        System.out.print(" Puntos: "+evaluaManoBJ());
    }
    

    public int evaluaManoBJ(){
        int puntos=0;
        String valor;
        LinkedList <String> valores = new LinkedList(mano);
        Collections.sort(valores);
        it = valores.iterator();
        while(it.hasNext()){
            carta=(Carta) it.next();
            valor=carta.getValor();
             if(valor.matches("Jack")||valor.matches("Queen")||valor.matches("King")) puntos+=10;
             else if (valor.matches("Âs") && (puntos+11)<21) puntos+=11;
             else if (valor.matches("Âs") && (puntos+11)>21) puntos+=1;
             else puntos+=Integer.valueOf(valor);
            //System.out.print(carta.getValor()+" de "+carta.getColor()+" | ");
        }
        return puntos;
    }
    
    public void clearMano(){
     this.mano = new HashSet();   
    }
}
