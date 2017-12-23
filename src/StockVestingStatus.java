
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vc2000
 */
public class StockVestingStatus {
      public static void main (String[] args){
      // short cut - sout Tab
      System.out.println("To determine how vested you are in the stock option plan.");
      System.out.println("Enter the number of years you have completed with the company");
      Scanner keyboard = new Scanner (System.in);
      int yearsCompleted = keyboard.nextInt();
      
      System.out.println("Enter the number of stock options you have: ");
      double options = keyboard.nextDouble();
      
      switch (yearsCompleted){
          case 0: case 1: case 2:
              System.out.println("None of your stock options have vested yet");
              options *= 0;
              break;
          case 3: case 4:
              System.out.println("50% of your stock options have vested yet");
              options *= 0.5;
              break;
              
          default:
              System.out.println("Your stock options are fully invested");
      }
      
      System.out.printf("which means you have %.0f options vested. ",options );
      
  }
}
