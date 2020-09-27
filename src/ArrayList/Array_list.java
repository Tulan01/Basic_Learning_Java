
package ArrayList;

import java.util.ArrayList;


public class Array_list {
     public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("size "+num.size());
        num.add(10);   //[add value to list]
        num.add(1,6);   //[ add value specifying the index]     
        num.add(7);
        
        System.out.println("Arraylist "+num+" ");
        System.out.println("size "+num.size()); //[ it return the size of the ArrayList ]
         num.remove(1);                //[it removes the value of specified index]
       System.out.println("Arraylist "+num+" ");
       System.out.println("size "+num.size());
       
        
        
        boolean b = num.isEmpty();   //[it checks the arraylist is empty or not]
        System.out.println("Arraylist "+b+" ");
        
        boolean contain = num.contains(10);  //[it checks the specified value is in the list or not ]
        System.out.println("Arraylist "+contain+" ");
        
        int index = num.indexOf(10);  // [ it find out the the index of speific value]
        System.out.println("Arraylist "+index+" ");
         
        num.set(1, 6);   //[it set the value 6 on the specific index]
        System.out.println("Arraylist "+num+" ");    
        
        int get = num.get(1); //[ it return the value of specific index ]
        System.out.println("Arraylist "+get+" ");  
    }
 
}
