  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school_management_system;

/**
 *
 * @author sktsh
 * A class for keeping record of the students information 
 * 
 */
public class Student {
    
    private int iD;
    private String name;
    private String surname;
    private String course;
    private int feesPaid;
    private int feesTotal;
    
    /**
     * This constructor is for initializing the fields
     * @param iD is the  unique identifier 
     * @param name is for the name of the student
     * @param surname is name of the student
     * @param course is for the qualification 
     * feesPaid is initially 0 for new students 
     * feesTotal is R20 000 for every student 
     */
    public Student (int iD, String name, String surname, String course){
    
       
        this.iD=iD;
        this.name=name;
        this.surname=surname;
        this.course=course;
         feesPaid = 0;
        feesTotal = 20000; 
        
    }
    
    /**
     * 
     * @return student id
     */
    public int getId () {
    return iD;
    }
    
    /**
     * 
     * @return student name
     */
    public String getName () {
    return name;
    
    }
    
    /**
     * 
     * @return student surname
     */
    public String getSurname() {
    return surname;
    }
    
    /**
     * 
     * @return students course
     */
    public String getCourse() {
    return course;
    }
    

    /**
     * 
     * @return fees paid by student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    
    /**
     * 
     * @return total fees of every student 
     */
    public int getFeesTotal() {
        return feesTotal;
    }
    
    
    
    /**
     * This constructor is for adding fees to feesPaid field whenever they pay school fees
     * @param fees 
     */
    public void updateFess(int fees) {
    
        feesPaid+=fees;
        School.updateTotalmoneYearned(feesPaid);
    }
    
    
    /**
     * 
     * @return the students remaining fees
     */
    public  int getremainingFees() {
    return feesTotal-feesPaid;
            
    }
}
