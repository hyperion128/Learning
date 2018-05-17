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

class ChessboardTraveling {  
  public static int ChessboardTraveling(String str) { 
       int ax,ay,bx,by,cx,cy;
       ax=Integer.valueOf(String.valueOf(str.charAt(1)));
       ay=Integer.valueOf(String.valueOf(str.charAt(3)));
       bx=Integer.valueOf(String.valueOf(str.charAt(6)));
       by=Integer.valueOf(String.valueOf(str.charAt(8)));
       cx=bx-ax;cy=by-ay;
       int [][] tablero= new int [8][8];
       for (int y=0;y<8;y++){
           for(int x=0;x<8;x++){
               if(x==0||y==0)tablero[x][y]=1;
               else tablero[x][y]=(tablero[x-1][y]+tablero[x][y-1]);
           }
       }
    return tablero[cx][cy];
   } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(ChessboardTraveling(s.nextLine())); 
    TestChallenge.testMyClass(ChessboardTraveling("(1 1)(3 3)"), 6);
    TestChallenge.testMyClass(ChessboardTraveling("(2 2)(4 3)"), 3);
  }   
  
}
