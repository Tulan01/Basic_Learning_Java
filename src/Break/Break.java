
package Break;

import java.util.Scanner;


public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int num;
         System.out.print("Please Enter a Number ");
         num = input.nextInt();
         int flag=0;
         for (int i = 2; i < num; i++) {
             if(num%i==0){
                flag = 1;
                break;
             }
             else{
                flag=0;
             }
        }
         if(flag==1){
         System.out.println("The number is not Prime");
         }
         else{
             System.out.println("The number is Prime");
         }
    }
}
