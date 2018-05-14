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

class KaprekarsConstant {  
  public static int KaprekarsConstant(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    String numstr=String.valueOf(num);
    char [] numchars;
    int num1,num2,result=0,round=0;
    while(result!=6174){
        fourDigitsLoop:while (numstr.length()<4)numstr="0"+numstr;
        numchars=numstr.toCharArray();
        String reversed="",ordered="";
        Arrays.sort(numchars);
        ordered=String.valueOf(numchars);
        reveseLoop:for (char ch:numchars) reversed=ch+reversed;
        num1=Integer.valueOf(ordered);
        num2=Integer.valueOf(reversed);
        result=num2-num1;
        numstr=String.valueOf(result);
        round++;
    }
    return round;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(KaprekarsConstant(s.nextLine())); 
    TestChallenge.testMyClass(KaprekarsConstant(2111), 5);
    TestChallenge.testMyClass(KaprekarsConstant(9831), 7);
  }   
  
}
