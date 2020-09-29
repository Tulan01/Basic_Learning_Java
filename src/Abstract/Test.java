
package Abstract;


public class Test {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle(10,20);
        double area = s.area();
        System.out.println("Rectangular Area "+area);
        
        s = new Triangle(10,20);
        area = s.area();
        System.out.println("Triangle Area "+area);
        
        s = new Circle(10);
        area = s.area();
        System.out.println("Circle Area "+area);
    }
    
    
}
