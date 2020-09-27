
package Static_variable;


public class StudentMain {
    static int count;
    
    StudentMain(){
        count++;
    }

    
    
    void displayinfo(){
        System.out.println("Student Number "+count);
    }
}
