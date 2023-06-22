package com.example.OneToOneRelationshipMapingHB.model;

import org.junit.jupiter.api.Test;

class PersonTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#setEmail(String)}
     *   <li>{@link Person#setLocation(String)}
     *   <li>{@link Person#setName(String)}
     *   <li>{@link Person#setPassport(Passport)}
     *   <li>{@link Person#setPassportId(int)}
     *   <li>{@link Person#setPinCode(int)}
     *   <li>{@link Person#getEmail()}
     *   <li>{@link Person#getLocation()}
     *   <li>{@link Person#getName()}
     *   <li>{@link Person#getPassport()}
     *   <li>{@link Person#getPassportId()}
     *   <li>{@link Person#getPinCode()}
     * </ul>
     */
    @Test
    void testSetEmail() {
        // Arrange
        // TODO: Populate arranged inputs
        Person person = null;
        String email = "";

        // Act
        person.setEmail(email);
        String location = "";
        person.setLocation(location);
        String name = "";
        person.setName(name);
        Passport passport = null;
        person.setPassport(passport);
        int passportId = 0;
        person.setPassportId(passportId);
        int pinCode = 0;
        person.setPinCode(pinCode);
        String actualEmail = person.getEmail();
        String actualLocation = person.getLocation();
        String actualName = person.getName();
        Passport actualPassport = person.getPassport();
        int actualPassportId = person.getPassportId();
        int actualPinCode = person.getPinCode();

        // Assert
        // TODO: Add assertions on result
    }
}

