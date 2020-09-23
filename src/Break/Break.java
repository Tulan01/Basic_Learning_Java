
package Break;

import java.util.Scanner;


public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// create an object for user input
         int num; // create a variable for store user input value
         System.out.print("Please Enter a Number ");
         num = input.nextInt();  // taking user input
         int flag=0; // declare a variable for flag
         for (int i = 2; i < num; i++) { /*though we are finding the number is prime or not
                                            we have to devide the number from 2 to the number befor that so declare a loop 
                                            from 2 to before input number and increment by 1*/
             if(num%i==0 ){ // by if condition checks mod value 0 if the input number divided by from 2 to previouse number of the input or not 
                flag = 1;  // create flag value 1 otherwise it will be 0 
                break; //though if the number was devided by any number under 2 to its previouse number is not prime. 
                       //so if find mode value 0 then no need to go further so break. it ends the loop and goes to next statement 
             }
             else{
                flag=0;   //else condition keep the mod value 0
             }
        }
         if(flag==1){   //thogh in loop if we found other devidor then we make flag value 1 . 
         System.out.println("The number is not Prime"); // if find flag value 1 is not a prime
         }
         else{
             System.out.println("The number is Prime"); // if flag is not 1 then of course it is a prime number 
         }
    }
}
