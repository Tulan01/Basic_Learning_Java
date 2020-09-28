
package BoxProblemSolve;


public class Box {
   double height,width,depth;
   
   Box(double h, double w,double d){
       height = h;
       width = w;
       depth = d;
   }

    
   
   void displayVol(){
       double volumn;
       volumn = height*width*depth;
       System.out.println("Volumn "+volumn);
   }
}
