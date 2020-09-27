
package Practice_programs;

import java.util.Scanner;

public class pallindrome {
     public static void main(String[] args) {
         // this program is to find out the input number s pallindrome or not 
        int num,temp,result=0,old;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number = ");
        num = input.nextInt();   // user input the number 
         old=num;                
             // now we have to find out the reverse number 
        while(num!=0){   
            temp=num%10;  
            result= result*10 + temp;  
            num = num/10;
        }
        if (old==result){      // here checks the reverse number is match with the input number 
        System.out.println("Result is pallindroem");   // if matches the number is pallindrome 
        }
        else{
        System.out.println("Result is not pallindrome"); //if not the number is not pallindrome 
        }
        
    }
}
