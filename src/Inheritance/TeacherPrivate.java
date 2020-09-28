
package Inheritance;


public class TeacherPrivate extends PersonPrivate {
    
    private String qualifications;

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    
    
    void display2(){
        System.out.println("qualification"+qualifications);
    }
    
}
