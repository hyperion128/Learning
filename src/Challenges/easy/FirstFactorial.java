/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges.easy;

/**
 *
 * @author gustavo.armando
 */
import java.util.*; 
import java.io.*;

class FirstFactorial {  
  public static int FirstFactorial(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       for (int i=num-1;i>1;i--)num=num*i;
    return num;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(Integer.valueOf(s.nextLine()))); 
  }   
  
}
