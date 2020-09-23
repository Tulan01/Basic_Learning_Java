
package StringMethod;

import java.util.Scanner;


public class StringMethod {
    public static void main(String[] args) {
        String name,con;
        int compare;
        String name1="aain";
        char n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Line = ");
        name = input.nextLine();
        n=name.charAt(0); //Returns the character at the specified index (position);
        compare=name.compareTo(name1);//compares to string
        con=name.concat(name1);//adds to strings
        boolean b = name.equals(name1);//checks whether strings equals with another and return true or false 
        boolean bb = name.isEmpty();//checks whether strings empty or not
        int length = name.length();//return the length of strings
        String upper= name.toUpperCase();//convert to upper case
        String lower= name.toLowerCase();//convert to lower case 
        
        System.out.println("The character ="+n);        
        System.out.println("Compare ="+compare);
        System.out.println("Concate ="+con);
        System.out.println("Equals or nor ="+b);
        System.out.println("Empty or nor ="+bb);
        System.out.println("Length ="+length);
        System.out.println("Upper Case ="+upper);
        System.out.println("Lower Case ="+lower);
    }
}
