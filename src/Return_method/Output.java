
package Return_method;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
       
       Return_value_method obj = new Return_value_method();
        int n;
       Scanner input = new Scanner(System.in);
        System.out.print("Input a Number = ");
        n = input.nextInt();
        int sum = obj.squire(n);
        int sum1 = obj.cube(n);
        System.out.println("Square "+sum);
        System.out.println("cube "+sum1);

    }
 
}
