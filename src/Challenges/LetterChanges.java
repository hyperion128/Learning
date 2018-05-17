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
public class LetterChanges {
      public static String LetterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String tmpstr="";
    String vowels="aeiou";
       for (int i=0; i<str.length();i++){
           char a=str.charAt(i);
           if ((int)a>=97 && (int)a<122) a=(char)(a+1);
           else if ((int)a=='z') a='A';
           if (vowels.contains(String.valueOf(a))) a=(char)(a-32);
           tmpstr+=a;
       }
       
    return tmpstr;
  } 
      public static void testLetterChanges(){
          String Result1=LetterChanges("hello*3");
          String Result2=LetterChanges("fun times!");
          System.out.println("Test1: Input \"hello*3\" returns: \""+Result1+"\"");
          if (Result1.equals("Ifmmp*3")) System.out.println(" Succes!!");
          else System.out.println(" Fail :(");
          System.out.println("Test2: Input \"fun times!\" returns: \""+Result2+"\"");
          if (Result2.equals("gvO Ujnft!")) System.out.println(" Succes!!");
          else System.out.println(" Fail :(");    
      }
      
  public static void main (String[] args) {  
    // keep this function call here     
    /* Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); */
    testLetterChanges();
  }  
}
