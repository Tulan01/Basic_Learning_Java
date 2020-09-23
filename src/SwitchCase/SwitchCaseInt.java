
package SwitchCase;

import java.util.Scanner;


public class SwitchCaseInt {
    public static void main(String[] args) {
         int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Character ");
        number = input.nextInt();
        
        switch(number){
            case 20 :
                System.out.println("Beginer Lavel");
                 break;
            case 30 :
                System.out.println("Intermediate Lavel");
                 break;
            case 40 :
                System.out.println("Advanced Lavel");
                 break;
            default :
                 System.out.println("Professional Label");
                 break;
        }
    }
}
