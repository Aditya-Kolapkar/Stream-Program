package org.example.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Employee")
@Access(value= AccessType.FIELD)
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Employee-id")
    private long id;

@Column(name="Employee-name")
    private String name;

@Column(name ="Employee-Salary")
    private double salary;

    public Employee() {
    }

    @OneToOne(mappedBy = "employee")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Address address;


    //Getter setter methods


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Employee(long id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Id= " + id + ", Name= " + name + ", Salary= " + salary
                + ", {Address= " + address + "}";
    }

}
