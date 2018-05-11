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

class LetterCapitalize {  
  public static String LetterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String [] tmpstr=str.split(" ");
    str="";
    for(String a:tmpstr) str+=a.replaceFirst("[a-z]", String.valueOf((char)(a.charAt(0)-32)))+" ";
    str=str.substring(0, str.length()-1);
    return str;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(LetterCapitalize(s.nextLine())); 
    TestChallenge.testMyClass(LetterCapitalize("hello world"),"Hello World");
    TestChallenge.testMyClass(LetterCapitalize("i ran there"),"I Ran There");
    
  }   
  
}
