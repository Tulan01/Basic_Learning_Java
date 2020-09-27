
package oop;


public class Teacher {
    String name,gender;
    long phone;
    void setinfo(String n,String g,long p){
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
