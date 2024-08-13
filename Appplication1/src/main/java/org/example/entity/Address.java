package org.example.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employeeAddress")
@Access(value = AccessType.FIELD)
public class Address {

    @Id
    @Column(name = "Employee_id")
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name="gen",strategy = "foreign", parameters = { @org.hibernate.annotations.Parameter(name="property",value="employee")})
    private long id;
    @Column(name = "adi120")
    private String addressLine1;
    @Column(name = "ZipCode")
    private String zipcode;
    @Column(name = "AhilyaNAgar")
    private String city;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Employee employee;

    //Getter setter methods

    @Override
    public String toString() {
        return "AddressLine1= " + addressLine1 + ", City=" + city
                + ", Zipcode=" + zipcode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
