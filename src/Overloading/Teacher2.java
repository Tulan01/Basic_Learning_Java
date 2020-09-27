
package Overloading;


public class Teacher2 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("ANI","male",012345);
        teacher1.displayinfo();
        Teacher teacher2 = new Teacher();
        teacher2.displayinfo();
    }
}
