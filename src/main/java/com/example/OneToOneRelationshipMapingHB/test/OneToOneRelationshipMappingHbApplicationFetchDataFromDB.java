package com.example.OneToOneRelationshipMapingHB.test;

import com.example.OneToOneRelationshipMapingHB.model.Passport;
import com.example.OneToOneRelationshipMapingHB.model.Person;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;

public class OneToOneRelationshipMappingHbApplicationFetchDataFromDB {
    public static void main(String[] args) {

        StandardServiceRegistry ssrrr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssrrr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction txs = session.beginTransaction();

        TypedQuery query = session.createQuery("from Passport passport");
        List<Passport> list = query.getResultList();
        Iterator<Passport> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Passport passport = iterator.next();
            System.out.println(passport.getCity() + "" + passport.getCountry() + "" + passport.getPinCode(444) + "" +
                    passport.getState() + "" + passport.getPassportLine2());
            Person person = passport.getPerson();


            System.out.println(person.getEmail()+ "" +person.getName()+ "" +person.getLocation());
        }
        session.close();
        System.out.println("Successfully Done");
    }
}
