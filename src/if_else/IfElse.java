
package if_else;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int number;
        //this program is to print whether value is odd or even 
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number ");
        number = input.nextInt();
        
        if(number%2==0){  // it apply the conditon for even . ig the inputted number fullfill this condition then is a even number 
            System.out.println("The Number Is Even"); // if the modulas of the number is 0 then we know the number is even so thisis the condition 
        } 
        else{ // if not then is a odd number 
            System.out.println("The Number Is Odd");
        }
    }
}
