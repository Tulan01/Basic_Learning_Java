
package if_else;

import java.util.Scanner;


public class if_else2 {
    public static void main(String[] args) {
        // this program is to if the inputed number fullfill the condition then what it print
         int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number ");
        number = input.nextInt();// take the user input 
        
        if(number>0&&number<5){ //apllying a condition that if the number is betwwen 0 to 5 
            System.out.println("The Number Is Under 5");
        } 
        else if(number>=5&&number<10){ //apllying a condition that if the number is betwwen 5 to 10 
            System.out.println("The Number Is Under 10");
        }
        else if(number>=10&&number<20){ //apllying a condition that if the number is betwwen 10 to 20 
            System.out.println("The Number Is Under 20");
        }
        else{   //apllying a condition that if the number is upper than 20  
            System.out.println("The Number Is over 20");
        }
        
    }
}
