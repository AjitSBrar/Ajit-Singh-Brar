/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  May 22 2019
  Tata ByeBye
  Wednesday
 */
package student;

/**
 *
 * @author Ajits
 */
public class StudentTester {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s1 = new Student();
        s1.setName("Tajinder");
        s1.setId(123);
        
        Student s2 = new Student("Arprit",234);
        Student s3 = new Student("Ajit",345);
        s1.setName("Tajinder");
        System.out.println(s1.getName());
        /*Student obj = new Student("Hello");//object created
        Student obj3 = new Student("Bye");//object created*/
       /* obj.setName("sheridan");
        System.out.println(obj.getName());
        
         Student obj1 = new Student();//object created
          obj1.setName("she");
        System.out.println(obj1.getName());
        
        Student obj2[] = new Student[2];
         
        obj2[0]=obj;
        obj2[1]=obj1;
        **/
       /* for(int i=0; i < obj2.length; i++)
        {
            System.out.println(obj2[i].getName());
        }**/
 
         Student[] list = new Student[3];
         list[0]=s1;
         list[1]=s2;
         list[2]=s3;
        
        for(int i=0;i < list.length; i++)
        {
            System.out.println(list[i].getName() + list[i].getId());
            
        }
      System.out.println("Remote repositry");
      //welcome
        
    }
}
