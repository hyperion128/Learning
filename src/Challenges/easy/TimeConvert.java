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

class TimeConvert {  
  public static String TimeConvert(int num) { 
    return (num/60)+":"+(num%60);
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(TimeConvert(s.nextLine())); 
    TestChallenge.testMyClass(TimeConvert(126), "2:6");
    TestChallenge.testMyClass(TimeConvert(45), "0:45");
  }   
  
}