
package ForLoop;

import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {
        int number,sum=0; // declare variable for take use input and store summation
      Scanner input = new Scanner(System.in);
      
        System.out.print("Input The Number ");
        number = input.nextInt(); //take user iput
        
        for (int i = 1; i <= number; i++) {  //declare a for loop 1 to inputed number by the user to get summation 
            sum = sum+i; //store the summation for every term exe. 0=1=1;,1+2=3; ... we get the total sum tiil inputed number 
                                                                   
        }
        
        System.out.println("The sum is = "+sum); // printing the summation 
    } 
}
