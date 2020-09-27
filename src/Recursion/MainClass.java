
package Recursion;


public class MainClass {
    int n;
    
    int recurse (int n){
        if(n!=0){
           return n = n + recurse(n-1);
        }
        return 0;
    }
}
