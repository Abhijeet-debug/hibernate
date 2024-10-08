package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchApp {

	public static void main(String[] args) {

		System.out.println("Application Started...!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

//		Student student = session.get(Student.class, 2);
//		Student student = session.load(Student.class, 2);
//		System.out.println(student);

		Address address = session.get(Address.class, 1);
		System.out.println(address.getCity());

		session.close();
		factory.close();

	}

}
