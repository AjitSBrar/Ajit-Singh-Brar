/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Ajits
 */
public class Student {

    private String name;

    /**
     * @return the name
     */
    public Student()
    {
        this.name=null;
    }
    public Student(String st)
    {
        this.name=st;
    }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param args the command line arguments
     */
    
    
}

