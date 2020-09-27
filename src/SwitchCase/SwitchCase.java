
package SwitchCase;

import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args) {
        // the program is about to find the inputted charater is vowel or consonent 
         char number; // take the  user input
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number ");
        number = input.next().charAt(0);// this charAt method is if user input word then it only take the first latter 
        
        switch(number){  //in switch we consider the conditon inputet latter 
            case 'a' :   // if the latter is a then it print vowel then break the switch condition case 
                System.out.println("Vowel");
                 break;
            case 'e' :
                System.out.println("Vowel");
                break;
            case 'i' :
                System.out.println("Vowel");
                break;
            case 'o' :
                System.out.println("Vowel");
                break;
            case 'u' :
                System.out.println("Vowel");
                break;
            case 'A' :
                System.out.println("Vowel");
                break;
            case 'E' :
                System.out.println("Vowel");
                break;
            case 'I' :
                System.out.println("Vowel");
                break;
            case 'O' :
                System.out.println("Vowel");
                break;
            case 'U' :
                System.out.println("Vowel");
                break;
            default :
                System.out.println("Consonent"); // if the latter is not matched with the condition applied before will print this section 
                break;
        }   
    }
}
