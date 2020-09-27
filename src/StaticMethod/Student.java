
package StaticMethod;

public class Student {
    public static void main(String[] args) {
        StudentMain obj = new StudentMain();
        
        obj.display(); //[to call a method we have to declare objects]
        
        StudentMain.display2(); //[static method can be alled without making objects ]
        
        StudentMain.display3();
    }
}
