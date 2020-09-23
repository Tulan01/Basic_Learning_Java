
package ForLoop;

import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {
        int number,sum=0;
      Scanner input = new Scanner(System.in);
      
        System.out.print("Input The Number ");
        number = input.nextInt();
        
        for (int i = 1; i <= number; i++) {
            sum = sum+i;
        }
        
        System.out.println("The sum is = "+sum);
    } 
}
