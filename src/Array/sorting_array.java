
package Array;

import java.util.Arrays;
import java.util.Scanner;


public class sorting_array {
    public static void main(String[] args) {
        String[] names = new String[5]; //[ this is the way of declare array 
        
        Scanner input = new Scanner(System.in); 
        for (int i = 0; i < 5; i++) {     //[ there introcude a loop to take input of the value in the array
            names[i] = input.nextLine();
        }
       
        Arrays.sort(names);  // [ sorting the araay
        
        for(String x : names){    // print out the array 
            System.out.print("Assending"+x+" ");
        }
        
    }
}
