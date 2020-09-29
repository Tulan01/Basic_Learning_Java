
package Abstract;


abstract public class Shape {
     double height,width;
     
     Shape(double height,double width){
         this.height=height;
         this.width=width;
     }
     
    abstract double area();
}
