
package Abstract;


public class Circle extends Shape {
      double radius;
    
    Circle(double radius){
        super(radius,radius);
        this.radius=radius;
    }
    
    @Override
    double area(){
        return 2*3.1416*radius;
    }
}
