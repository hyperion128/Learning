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

class CorrectPath {  
    private static boolean[][] table= new boolean [5][5];;
    private static int x=0,y=0;
    
  public static String CorrectPath(String str)  { 
       String path="";
       for (int c=0;c<str.length();c++){
               char t=str.charAt(c);
           switch (t){
               case 'd':
                   y++;
                   break;
               case 'u':
                   y--;
                   break;
               case 'l':
                   x--;
                   break;
               case 'r':
                   x++;
                   break;
               case '?':
                   for (char blah:new char[]{'u','d','l','r'}){
                       String dummy=path+blah+str.substring(c);
                       if(!CorrectPath(dummy).equals("-1"))return dummy;
                   }
                break;
           }
           try {
               table[x][y]=true;
               path=path+t;
           }
           catch (Error e){
               return "-1";
           }
       }
       if (x==3&&y==3) return path;
       else return "-1";
  } 

  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(CorrectPath(s.nextLine())); 
    TestChallenge.testMyClass(CorrectPath("???rrurdr?"), "dddrrurdrd");
    TestChallenge.testMyClass(CorrectPath("drdr??rrddd?"), "drdruurrdddd");
    TestChallenge.testMyClass(CorrectPath("r?d?drdd"), "rrdrdrdd");
  }   
  
}
