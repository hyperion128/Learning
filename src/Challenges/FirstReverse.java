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
import java.util.*; 
import java.io.*;

class FirstReverse {  
  public static String FirstReverse(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    String newstr="";
    for (int i=str.length()-1; i>=0; i--) newstr=newstr+str.charAt(i);
    return newstr;
    
  } 
  public static void testFirsReverse(){
      System.out.println(FirstReverse("coderbyte"));
      System.out.println(FirstReverse("I Love Code"));
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(FirstReverse(s.nextLine())); 
    testFirsReverse();
  }   
  
}
