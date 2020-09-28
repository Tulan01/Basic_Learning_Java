
package SetterGetterMethod;


public class Person {
  private String name;
  private int age;
   //though this name and age variable age private only the method under this class can be accessed to this
  // we made two public setter and getter function to accesed to it 
   public void setName(String n){
       name=n;
   }
     public void setAge(int a){
       age=a;
   }
   public String getName(){
       return name;      
   }
    public int getAge(){
       return age;      
   }
}
