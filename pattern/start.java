package DSAP.pattern;

import java.util.Scanner;
class start {
 public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     for (int i = 0; i<=a ; i++){
         for(int j= 1; j<i; j++){
             System.out.print("*");
         }
         System.out.println(" ");
     }
     sc.close();
 }
}