/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.school_management_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sktsh
 */
public class School_Management_System  {

    public static void main(String[] args) {
        
        List<Teacher> teacherList = new ArrayList<>();
        Teacher Palesa = new Teacher(1, "Palesa", "Selepe", 500);
        Teacher Lerato = new Teacher(2, "Lerato", "Moeng", 600);
        Teacher Mfundo = new Teacher(3, "Mfundo", "Vilakazi", 500);
        
        
        List<Student> studentList = new ArrayList<>();
        Student Tshepo = new Student(1, "Tshepo", "Motloung", "Software Development");
        Student Neo = new Student(2, "Neo", "Manana", "Quality Asurance");
        Student Tebogo = new Student(3, "Tebogo", "Ranaka", "Journalism");
        
        School DSS = new School(teacherList, studentList, 0, 0);
       
        
        Neo.updateFess(5000); 
        Tshepo.updateFess(5000);
        System.out.println("DSS has earned R"+ DSS.getTotalMoneyearned());
        
        System.out.println("******SCHOOL PAYMENTS**********");
        Palesa.receiveSalary(Palesa.getSalary());
        
    }
}
