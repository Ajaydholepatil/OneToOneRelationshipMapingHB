package com.example.OneToOneRelationshipMapingHB.model;


import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "passport")

public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PassportId;
    @OneToOne(mappedBy = "passport")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Person person;
    private String PassportLine2;
    private String city;
    private String state;
    private String country;
    private int pinCode;

    public int getPassportId(int i) {
        return PassportId;
    }

    public void setPassportId(int passportId) {
        PassportId = passportId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPassportLine2(String xyz) {
        return PassportLine2;
    }

    public void setPassportLine2(String passportLine2) {
        PassportLine2 = passportLine2;
    }

    public String getCity(String shirala) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState(String maharashtra) {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry(String india) {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode(int i) {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
