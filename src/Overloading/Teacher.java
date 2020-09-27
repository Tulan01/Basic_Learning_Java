
package Overloading;

public class Teacher {
    String name,gender;
    int phone;
    Teacher(){
        
    }
    
    Teacher(String n, String g, int p){
        name=n;
        gender=g;
        phone=p;
    }
    
    void displayinfo(){
        System.out.println("NAme "+name);
        System.out.println("Gender "+gender);
         System.out.println("Phone "+phone);
    }
}
