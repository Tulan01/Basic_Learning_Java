
package Practice_programs;

import java.util.Scanner;


public class sum_of_digit {
    public static void main(String[] args) {
        int num,temp,result=0;
        // thi sprogram is to find out the sum of the digit of inputed number 
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number = ");
        num = input.nextInt();  // userinput 
           // split the number and find out the sum
        while(num!=0){
            temp=num%10;
            result= result + temp;
            num = num/10;
        }
        
        System.out.println("Result is = "+result); // print out the sum 
    }
 
}
