
package Pollymorpishm;


public class Triangle extends Shape {
     double height,width;
     double area;
     
      Triangle(double height,double width){
         this.height=height;
         this.width=width;
     }
      
     @Override
     double area(){
        return area=.5*height*width;
     }
}
