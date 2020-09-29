
package Pollymorpishm;


public class Rectangle extends Shape {
     double height,width;
     double area;
     
      Rectangle(double height,double width){
         this.height=height;
         this.width=width;
     }
      
     @Override
     double area(){
        return area=height*width;
     }
}
