/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.*; 
import java.io.*;

class SimpleAdding {  
  public static int SimpleAdding(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    int tmpnum=0;
       for (int a=1; a<=num;a++) tmpnum+=a;
    return tmpnum;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(SimpleAdding(s.nextLine())); 
    //TestChallenge tester = new TestChallenge();
    TestChallenge.testMyClass(SimpleAdding(12), 78);
    TestChallenge.testMyClass(SimpleAdding(140), 9870);
  }   
  
}
