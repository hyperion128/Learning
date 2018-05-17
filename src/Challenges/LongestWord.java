/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.*; 
import java.io.*;

class LongestWord {  
  public static String LongestWord(String sen) { 
  
      // code goes here
      /* Note: In Java the return type of a function and the
      parameter types being passed are defined, so this return
      call must match the return type of the function.
      You are free to modify the return type. */
    sen = sen.replaceAll("\\W", " ");
    String [] words = sen.split(" ") ;
    sen="";
    evalloop:for (String word:words) {
        if (word.length()>sen.length()) sen=word;
    }
    return sen;
  } 
  public static void TestLonguestWord(){
      String test1="fun&!! time";
      String test2="I love dogs";
      if (LongestWord(test1).equals("time"))   System.out.println("Test1 Passed");
        else System.out.println("Test1 Failed");
      if (LongestWord(test2).equals("love"))   System.out.println("Test1 Passed");
        else System.out.println("Test2 Failed");
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    //    TestLonguestWord();
    
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
    
  }   
  
}








  