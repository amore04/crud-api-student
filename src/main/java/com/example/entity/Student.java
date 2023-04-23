

package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @au@thor aniket-pc
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="roll")
    private int roll_no;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "dob")
    private String dob;

    // Constructor
    public Student() {
    }

    public Student(int roll_no, String firstName, String lastName, String dob) {
        this.roll_no = roll_no;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    
    //  String
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ",roll_no=" + roll_no + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + '}';
    }
    
    // Define Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
}
