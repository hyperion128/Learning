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

class MaximalSquare {  
  public static int MaximalSquare(String str) { 
    int maxpossible=str.length()-(str.replaceAll("1", "").length());
    if (maxpossible==0) return 0;
    maxpossible=(int)Math.sqrt(maxpossible);
    String [] strArr=str.replaceAll("(\"| )", "").split(",");
    int arrX=strArr[0].length(),
        arrY=strArr.length,
        limit=1;
    
    if (arrX<arrY)limit=arrX;
    else limit=arrY;
    if (maxpossible<limit)limit=maxpossible;
    
    boolean [][] canvas=new boolean [arrX][arrY];
    fillCanvasLoop:for(int y=0;y<arrY;y++){
        for(int x=0;x<arrX;x++){
            if(strArr[y].charAt(x)=='1') canvas [x][y]=true;
            else canvas [x][y]=false;
        }
    }
   while (limit>1){
    referenceLoop:for(int y=0; (y+limit)<=arrY; y++){
        for(int x=0;(x+limit)<=arrX; x++){
            int count=0;
            evalLoop: for(int b=0; b<limit ;b++){
                for(int a=0; a<limit; a++){
                    if (canvas[x+a][y+b]) count++;
                    else break evalLoop;
                }
            }
            if ((int)(Math.pow(limit,2))==count)return count;
        }
    }
    limit--;
   }
    return 1;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    //System.out.print(MaximalSquare(s.nextLine())); 
    TestChallenge.testMyClass(MaximalSquare("\"0111\", \"1111\", \"1111\", \"1111\""), 9);
    TestChallenge.testMyClass(MaximalSquare("\"10100\", \"10111\", \"11111\", \"10010\""), 4);
    TestChallenge.testMyClass(MaximalSquare("\"0111\", \"1101\", \"0111\""), 1);
  }   
  
}
