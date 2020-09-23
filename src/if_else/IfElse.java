
package if_else;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number ");
        number = input.nextInt();
        
        if(number%2==0){
            System.out.println("The Number Is Even");
        } 
        else{
            System.out.println("The Number Is Odd");
        }
    }
}
