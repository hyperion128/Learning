/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges.easy;
import java.util.*; 
import java.io.*;

class CheckNums {  
  public static String CheckNums(int num1, int num2) { 
       if (num1<num2) return "true";
       else if(num1==num2) return "-1";
       else return "false";
    } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(CheckNums(Integer.valueOf(s.nextLine()))); 
    TestChallenge.testMyClass(CheckNums(3,6), "true");
    TestChallenge.testMyClass(CheckNums(67,67), "-1");
  }   
  
}