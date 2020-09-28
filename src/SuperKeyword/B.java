
package SuperKeyword;


public class B extends A {
    int z;
    
    @Override
    void display(){
        super.display(); // this is way to call supper class override method with super keyword
        System.out.println("Valus "+x);
    }
    void display2(){
        System.out.println("Value super class "+super.x);
    }
    
    B(int a,int b, int c){  //this is the way to call super class initialization 
        super(a,b);
        z=c;
    }
    
    void show(){
        super.show();
        System.out.println("z value "+z);
    }
    
}
