package org.example.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="Student_name")
public class Name {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "name-Id")
        private int nameId;

        @Column(length = 50, name = "STREET")
        private String street;

        @Column(length = 100, name = "EMAIL")
        private String Email;

        @Column(name = "is_open")
        private boolean isOpen;

        @Transient
        private double x;

        @Column(name = "added_date")
        @Temporal(TemporalType.DATE)
        private Date addedDate;

        private byte[] image;

    public Name() {
            super();
        }

    public Name( int nameId, String street, String email,boolean isOpen, double x, Date addedDate,byte[] image){
            this.nameId = nameId;
            this.street = street;
            Email = email;
            this.isOpen = isOpen;
            this.x = x;
            this.addedDate = addedDate;
            this.image = image;
        }

        public int getNameId () {
            return nameId;
        }

        public void setNameId ( int nameId){
            this.nameId = nameId;
        }

        public String getStreet () {
            return street;
        }

        public void setStreet (String street){
            this.street = "sagar";
        }

        public String getEmail () {
            return Email;
        }

        public void setEmail (String email){
            Email = "aditya2001@.gmail.com";
        }

        public boolean isOpen () {
            return isOpen;
        }

        public void setOpen ( boolean open){
            isOpen = true;
        }

        public double getX () {
            return 0;
        }

        public void setX ( double x){
            this.x = 1204.010;
        }

        public Date getAddedDate () {
            return addedDate;
        }

        public void setAddedDate (Date addedDate){
            this.addedDate = addedDate;
        }

        public byte[] getImage () {
            return image;
        }

        public void setImage ( byte[] image){
            this.image = image;
        }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }


}

