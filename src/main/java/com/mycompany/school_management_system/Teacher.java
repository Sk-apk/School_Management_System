/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school_management_system;

/**
 * Keeps record of all the teacher
 * @author sktsh
 */
public class Teacher {
    private int iD;
    private String name;
    private String surname;
    private int salary;
    
    /**
     * This constructor is for initializing  the fields
     * @param iD is the unique identifier for the teacher
     * @param name is for the name of the teacher 
     * @param surname is for the name of the teacher
     * @param salary is amount the teacher earns 
     */
    public Teacher (int iD, String name, String surname, int salary){
    
        this.iD=iD;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }
    
    /**
     * 
     * @return the id of the teacher
     */
    public int getId () {
        
   return iD;
    }
    
    
    
    /**
     * 
     * @return name of the teacher
     */
    public String getName (){
    return name;
    }
    
    
    /**
     * 
     * @return the id of the teacher
     */
    public String getSurname () {
        
   return surname;
    }
    
    /**
     * Sets the teachers salary 
     * @param salary
     * 
     */
    public void setSalary(int salary) {
    this.salary=salary;
    }
}
