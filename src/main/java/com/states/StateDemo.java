package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate1.Person;
import com.hibernate1.Vehicle;

public class StateDemo {

	public static void main(String[] args) {

		System.out.println("Application Started...!");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Person p1 = new Person();
		p1.setpId(12);
		p1.setpName("Paras");
		p1.setAddress("Amritsar");
		p1.setVehicles(new Vehicle("Honda City", "BS5"));
		// Transient State

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p1);
		// persistent state
		p1.setpName("Vidit");

		tx.commit();
		session.close();
//
//		p1.setpName("Abhijeet");
//		System.out.println(p1);
		factory.close();
	}

}
