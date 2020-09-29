
package Abstract;


public class Rectangle extends Shape {
  
    
    Rectangle(double height,double width){
       super(height,width);
    }

    
    @Override
    double area(){
        return height*width;
    }
}
