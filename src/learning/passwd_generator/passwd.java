/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.passwd_generator;

import java.util.Random;

/**
 *
 * @author gustavo.armando
 */
public class passwd {
    /*
    clase passwd con todas sus variables definidas como:
      > constantes por medio de 'final'
      > protegidas por medio de control de acceso 'private'
      > bajo consumo de recursos por medio de 'static' ya que unicmante alojaran memoria 1 vez aunque se creen n objetos.
    */
    
    private static final String MAYUS="QWERTYUIOPASDFGHJKLÑZXCVBNM",
            MINUS="qwertyuiopasdfghjklñzxcvbnm",
            NUMBERS="1234567890",
            SYMBOLS="<>,.-_{[}]+*~|!#$%&/()=?¿¡",
            AVAILABLECHARS=MAYUS+MINUS+NUMBERS+SYMBOLS;
    private static final Random RND=new Random();
    
    public static String generatePasswd(int size){
        String passwd="";
        for(int c=0;c<size;c++) passwd+=AVAILABLECHARS.charAt(RND.nextInt(AVAILABLECHARS.length()));
        return passwd;
    }
}
