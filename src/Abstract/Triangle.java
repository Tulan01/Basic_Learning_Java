
package Abstract;

public class Triangle extends Shape {
     double height,width;
    
    Triangle(double height,double width){
        super(height,width);
    }
    
    @Override
    double area(){
        return .5*height*width;
    }
}
