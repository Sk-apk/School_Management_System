/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school_management_system;

import java.util.List;

/**
 * Keeps record of all the teacher
 * @author sktsh
 */
public class Teacher  {
    private int iD;
    private String name;
    private String surname;
    private int salary;
    private int salaryEarned;
    
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
        this.salaryEarned=0;
    }
    
    /**
     * 
     * @return the id of the teacher
     */
    public int getId () {
        
   return iD;
    }

    /**
     * sets the teachers ID
     * @param iD 
     */
    public void setiD(int iD) {
        this.iD = iD;
    }
    
    
    
    /**
     * 
     * @return name of the teacher
     */
    public String getName (){
    return name;
    }

    /**
     * sets the teachers name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    /**
     * 
     * @return the id of the teacher
     */
    public String getSurname () {
        
   return surname;
    }

    /**
     * sets the teachers surname
     * @param surname 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
    /**
     * Sets the teachers salary 
     * @param salary
     * 
     */
    public void setSalary(int salary) {
    this.salary=salary;
    }

    /**
     * 
     * @return the teachers salary
     */
    public int getSalary() {
        return salary;
    }
    
    

    /**
     * Adds the teachers salaryEarned  
     * Deducts from the money earned by the school
     * @param salary 
     */
    public void receiveSalary (int salary) {
    salaryEarned+=salary;
    School.updateTotalmoneyspSent(salary);
    }
   
}
