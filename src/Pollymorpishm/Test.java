
package Pollymorpishm;


public class Test {
    public static void main(String[] args) {
        // this the normal way .. 
       /* Shape s = new Shape();
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(30,40);
        
        System.out.println("Shape Area "+s.area());
        System.out.println("Rectangle Area "+r.area());
        System.out.println("Trangle Area "+t.area());*/
       //if we apply polimorphism then
       
       Shape s = new Shape();
       System.out.println("Shape Area "+s.area());
       s = new Rectangle(10,20);
       System.out.println("Rectangle Area "+s.area());
       s = new Triangle (20,30);
       System.out.println("Triangle Area "+s.area());
    }
}
