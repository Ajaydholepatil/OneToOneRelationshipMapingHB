package com.example.OneToOneRelationshipMapingHB.test;

import com.example.OneToOneRelationshipMapingHB.model.Passport;
import com.example.OneToOneRelationshipMapingHB.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneRelationshipMappingHbApplication {

	public static void main(String[] args) {
		String resorceName;
		String s = "hibernate.cfg.xml";
		StandardServiceRegistry ssrrr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(ssrrr).getMetadataBuilder().build();

		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction txs = session.beginTransaction();

		Person person = new Person();
		person.setEmail("ajaydholepatol05@gmail.com");

		person.setLocation("Pune");
		person.setName("Ajay");
		person.setPinCode(415408);

		Passport passport = new Passport();
		passport.setCity("Shirala");
		passport.setPassportLine2("xyz");
		passport.setCountry("India");
		passport.setState("Maharashtra");
		passport.setPinCode(401540);

		person.setPassport(passport);
		passport.setPerson(person);

		session.persist(person);
		txs.commit();

		session.close();
		System.out.println("All ok!! Successfully done.");
		}
	}

