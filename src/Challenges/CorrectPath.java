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
    
  public static String CorrectPath(String str)  { 
       boolean[][] table= new boolean [5][5];
       int x=0,y=0;
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
           }
           
                switch (t){
                case '?':
                   for (char blah:new char[]{'d','r','l','u'}){
                       String dummy=path+blah+str.substring(c+1);
                       dummy=CorrectPath(dummy);
                       if(!dummy.equals("-1"))return dummy;
                   }
                break;
                default:
                    if(x<5&&y<5&&x>=0&&y>=0){
                        if (!table[x][y])table[x][y]=true;
                        else {
                            return "-1";
                        }
                    }
                    else return "-1";
                   path=path+t;
                   break;
                }
       }
       if (x==4&&y==4) return path;
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
