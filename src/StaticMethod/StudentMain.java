
package StaticMethod;


public class StudentMain {
    void display (){
        System.out.println("Not a static method");
    }
    static void display2(){
        System.out.println("Static Method");
    }
    //important fact a non static variable or method cant be call by a static method 
    
    //use of static block 
    static int a,b;
    static String c;
    static {
         a = 12;
         b = 13;
         c = "Pritam";
    }
    
    static void display3(){
        System.out.println("Valu of a "+a);
        System.out.println("Valu of a "+b);
        System.out.println("Valu of a "+c);
    }
}
