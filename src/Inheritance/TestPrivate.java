
package Inheritance;


public class TestPrivate {
    public static void main(String[] args) {
        TeacherPrivate t1 = new TeacherPrivate();
        
        t1.setName("pritam");
        t1.setAge(12);
        t1.setQualifications("Bsc");
        
        t1.display1();
        t1.display2();
    }
}
