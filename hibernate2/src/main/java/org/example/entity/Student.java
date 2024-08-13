package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
@Id
   private int student_id;
     private String name;
   private String email;

   private Certificate certi;

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Student() {
    }

    public Student(int student_id, String name, String email, Certificate certi) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
        this.certi = certi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
