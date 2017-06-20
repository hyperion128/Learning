/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.cardgames;

/**
 *
 * @author gustavo.armando
 */
final public class Carta implements Comparable<Carta> {
    private String color;
    private String valor;

    public Carta(String color, String valor){
        setColor(color);
        setValor(valor);
    }
    public Carta(){
    }
    /**
     * @return the color
     */
    protected String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    protected void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the valor
     */
    protected String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    protected void setValor(String valor) {
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Carta other){
        return String.CASE_INSENSITIVE_ORDER.compare(this.valor, other.valor);
    }
    
}
