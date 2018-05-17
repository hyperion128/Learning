/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

/**
 *
 * @author gustavo.armando
 */
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.*; 
import java.io.*;

class AlphabetSoup {  
  public static String AlphabetSoup(String str) { 
  
    // code goes here   
    /* Using the Java language, have the function AlphabetSoup(str)
    take the str string parameter being passed and return the string
    with the letters in alphabetical order (ie. hello becomes ehllo).
    Assume numbers and punctuation symbols will not be included in the string.   */
    char [] sorted=str.toCharArray();
    Arrays.sort(sorted);
    return String.valueOf(sorted);
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(AlphabetSoup(s.nextLine())); 
    TestChallenge.testMyClass(AlphabetSoup("coderbyte"), "bcdeeorty");
    TestChallenge.testMyClass(AlphabetSoup("hooplah"), "ahhloop");
  }   
  
}
