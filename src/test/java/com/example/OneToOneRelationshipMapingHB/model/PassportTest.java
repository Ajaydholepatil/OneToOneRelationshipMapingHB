package com.example.OneToOneRelationshipMapingHB.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class PassportTest {
    /**
     * Method under test: {@link Passport#getPassportId(int)}
     */
    @Test
    void testGetPassportId() {
        assertEquals(0, (new Passport()).getPassportId(1));
    }

    /**
     * Method under test: {@link Passport#getPinCode(int)}
     */
    @Test
    void testGetPinCode() {
        assertEquals(0, (new Passport()).getPinCode(1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Passport}
     *   <li>{@link Passport#setCity(String)}
     *   <li>{@link Passport#setCountry(String)}
     *   <li>{@link Passport#setPassportId(int)}
     *   <li>{@link Passport#setPassportLine2(String)}
     *   <li>{@link Passport#setPerson(Person)}
     *   <li>{@link Passport#setPinCode(int)}
     *   <li>{@link Passport#setState(String)}
     *   <li>{@link Passport#getCity()}
     *   <li>{@link Passport#getPerson()}
     *   <li>{@link Passport#getCountry()}
     *   <li>{@link Passport#getPassportLine2()}
     *   <li>{@link Passport#getState()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Passport actualPassport = new Passport();
        actualPassport.setCity("Oxford");
        actualPassport.setCountry("GB");
        actualPassport.setPassportId(1);
        actualPassport.setPassportLine2("Passport Line2");
        Passport passport = new Passport();
        passport.setCity("Oxford");
        passport.setCountry("GB");
        passport.setPassportId(1);
        passport.setPassportLine2("Passport Line2");
        Person person = new Person();
        passport.setPerson(person);
        passport.setPinCode(1);
        passport.setState("MD");
        Person person1 = new Person();
        person1.setEmail("jane.doe@example.org");
        person1.setLocation("Location");
        person1.setName("Name");
        person1.setPassport(passport);
        person1.setPassportId(1);
        person1.setPinCode(1);
        Passport passport1 = new Passport();
        passport1.setCity("Oxford");
        passport1.setCountry("GB");
        passport1.setPassportId(1);
        passport1.setPassportLine2("Passport Line2");
        passport1.setPerson(person1);
        passport1.setPinCode(1);
        passport1.setState("MD");
        Person person2 = new Person();
        person2.setEmail("jane.doe@example.org");
        person2.setLocation("Location");
        person2.setName("Name");
        person2.setPassport(passport1);
        person2.setPassportId(1);
        person2.setPinCode(1);
        actualPassport.setPerson(person2);
        actualPassport.setPinCode(1);
        actualPassport.setState("MD");
        assertEquals("Oxford", actualPassport.getCity());
        Person person3 = actualPassport.getPerson();
        Passport passport2 = person3.getPassport();
        assertEquals("Oxford", passport2.getCity());
        Person person4 = passport2.getPerson();
        Passport passport3 = person4.getPassport();
        assertEquals("Oxford", passport3.getCity());
        assertEquals("GB", actualPassport.getCountry());
        assertEquals("GB", passport2.getCountry());
        assertEquals("GB", passport3.getCountry());
        assertEquals("Passport Line2", actualPassport.getPassportLine2());
        assertEquals("Passport Line2", passport2.getPassportLine2());
        assertEquals("Passport Line2", passport3.getPassportLine2());
        assertSame(person2, person3);
        assertSame(person1, person4);
        assertSame(person, passport3.getPerson());
        assertEquals("MD", actualPassport.getState());
        assertEquals("MD", passport2.getState());
        assertEquals("MD", passport3.getState());
    }
}

