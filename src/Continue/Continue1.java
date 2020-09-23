
package Continue;

import java.util.Scanner;


public class Continue1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int num;
         System.out.print("Please Enter a Number ");
         num = input.nextInt();
         int flag=0;
         for (int i = 2; i < num; i++) {
             if(i==4){
             System.out.println("Before continue "+flag);
              flag=num+1;     
              continue;
             }
           System.out.println("after continue "+flag);
        }
        
    }
 
}
