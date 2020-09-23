
package Continue;

import java.util.Scanner;


public class Continue1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// create object for take user input
         int num; //declare a variable foor user input 
         System.out.print("Please Enter a Number ");
         num = input.nextInt(); // take user input
         int value=0; // for keeping change value 
         for (int i = 0; i < num; i++) {  // declare a loop to increment input one by one 
             if(i==2){  // set a condition for print desire value
             System.out.println("Before continue "+value); // print the value of the value variable 
              value=num+1;     // just changing the value of the value variable ;
              continue; // this continue statement make the loop ongoing without executing next statements  
             }
           System.out.println("after continue "+value); // if i is equal 0 then that term this statement is not execute 
        }
        
    }
 
}
