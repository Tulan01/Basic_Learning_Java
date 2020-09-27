
package Constructor;


public class Teacher {
     String name,gender;
    long phone;
    Teacher(String n,String g,long p){
        name=n;
        gender=g;
        phone=p;
    }
    void displayinfo(){
        System.out.println("Name "+name);
        System.out.println("Gender "+gender);
        System.out.println("Phone "+phone);
    }
}
