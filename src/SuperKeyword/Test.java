
package SuperKeyword;


public class Test {
    public static void main(String[] args) {
        B value = new B(10,20,30);
        
        value.display(); // this prints x=5 because the x value in B class again declare 5 
                   // id we want to see the super class define value then we have to use Super Keyword
        value.display2(); // now we are have the super class value 
        
        value.show();
    }
}
