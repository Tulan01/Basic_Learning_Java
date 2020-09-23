
package ForLoop;

import java.util.Scanner;


public class ForLoop2 {
     public static void main(String[] args) {
      
        //program is about to print * in a paatern from 5 in first row then 4 in second row then so on
        for (int i = 5; i>0; i--) {  // declare a loop as row for handle row wise value 
            for (int j = 0; j < i; j++) { // declare a loop as column handle column wise value
                System.out.print("*");   //printing the star 
            }
            System.out.println();// this is for create a new line after every column 
        }
        
       
    } 
}
