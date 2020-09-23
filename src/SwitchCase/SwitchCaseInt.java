
package SwitchCase;

import java.util.Scanner;


public class SwitchCaseInt {
    public static void main(String[] args) {
         // the program is about to find the inputted number is follow the condition or not 
         int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Character ");
        number = input.nextInt();
        
        switch(number) {  //in switch we consider the conditon inputet number
            case 20 :  // if the number is 20 then print this section 
                System.out.println("Beginer Lavel");
                 break;
            case 30 :
                System.out.println("Intermediate Lavel");
                 break;
            case 40 :
                System.out.println("Advanced Lavel");
                 break;
            default : // if the latter is not matched with the condition applied before will print this section 
                 System.out.println("Professional Label");
                 break;
        }
    }
}
