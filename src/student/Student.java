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

    private String name; private int id; private int maxcourse;

    /**
     * @return the name
     */
    public Student()
    {
        this.name=null;
        this.id = 0;
    }
    public Student(String st,int s)
    {
        this.name=st;
        this.id = s;
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
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
            this.id = i;    
            }

    /**
     * @return the maxcourse
     */
    public int getMaxcourse() {
        return maxcourse;
    }

    /**
     * @param maxcourse the maxcourse to set
     */
    public void setMaxcourse(int maxcourse) {
        this.maxcourse = maxcourse;
    }
    /**
     * @param args the command line arguments
     */
    
    
}

