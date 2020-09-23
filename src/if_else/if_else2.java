
package if_else;

import java.util.Scanner;


public class if_else2 {
    public static void main(String[] args) {
         int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number ");
        number = input.nextInt();
        
        if(number>0&&number<5){
            System.out.println("The Number Is Under 5");
        } 
        else if(number>=5&&number<10){
            System.out.println("The Number Is Under 10");
        }
        else if(number>=10&&number<20){
            System.out.println("The Number Is Under 20");
        }
        else{
            System.out.println("The Number Is over 20");
        }
        
    }
}
