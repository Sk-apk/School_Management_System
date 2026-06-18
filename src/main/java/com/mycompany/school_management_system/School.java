/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school_management_system;

import java.util.List;

/**
 * keeps all the schools information,from teacher payments to student fees payments  
 * @author sktsh
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyearned;
    private static int totalMoneyspent;

    
    /**
     * new school constructor is created for initializing 
     * @param teachers List of teachers in the school 
     * @param students List of students in the school 
     * @param totalMoneyearned from the school 
     * @param totalMoneyspent by the school 
     */
    public School(List<Teacher> teachers, List<Student> students, int totalMoneyearned, int totalMoneyspent) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyearned = 0;
        this.totalMoneyspent = 0;
    }

    /**
     * 
     * @return a list of teachers at the school 
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * 
     * @return a list of students at the school 
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * 
     * @return the total money earned by the school 
     */
    public int getTotalMoneyearned() {
        return totalMoneyearned;
    }

    /**
     * 
     * @return the total money spent at the school 
     */
    public int getTotalMoneyspent() {
        return totalMoneyspent;
    }

    /**
     * adds a new teacher 
     * @param teacher list of teachers at the school 
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * adds a new student 
     * @param student list of students of the school 
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * adds the money earned by the school
     * @param moneyEarned total money earned by the school 
     */
    public static void updateTotalmoneYearned(int moneyEarned) {
        totalMoneyearned += moneyEarned;
    }

    /**
     * update money spent by the school 
     * @param moneySpent total money spent by the school 
     */
    public static void updateTotalmoneyspSent(int moneySpent) {
          totalMoneyearned -= moneySpent;
    }

    
    

}

