package com.example.OneToOneRelationshipMapingHB.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen" , strategy = "foreign" ,parameters = {@org.hibernate.annotations.Parameter(name = "property" , value = "passport")})

    private int PassportId;
    private String name;
    private String email;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Passport passport;
    private String location;
    private int pinCode;

    public int getPassportId() {
        return PassportId;
    }

    public void setPassportId(int passportId) {
        PassportId = passportId;
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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
