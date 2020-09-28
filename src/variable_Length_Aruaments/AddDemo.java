/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable_Length_Aruaments;

/**
 *
 * @author Tulan
 */
public class AddDemo {
       int sum=0;
    void add(int ... num){   // here we store the passed arguaments in an array 
        for( int x : num){
          sum = sum + x;    // execute an array we sum the value 
        }
        System.out.println("Sum "+sum);
    }
}

