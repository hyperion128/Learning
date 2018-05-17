/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;
import java.util.*; 
import java.io.*;
/**
 *
 * @author gustavo.armando
 */
public class SimpleSymbols {
     public static String SimpleSymbols(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       if (str.matches("([^\\p{Alpha}]*((\\+\\p{Alpha}\\+)(\\p{Alpha}\\+)*)+[^\\p{Alpha}]*)+") )return "true";
       else return "false";    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(SimpleSymbols(s.nextLine())); 
    TestChallenge.testMyClass(SimpleSymbols("=+a+b+"), "true");
    TestChallenge.testMyClass(SimpleSymbols("+d+=3=+s+"), "true");
    TestChallenge.testMyClass(SimpleSymbols("f++d+"), "false");
  }   
}
