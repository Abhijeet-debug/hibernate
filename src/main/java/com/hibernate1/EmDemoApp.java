package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemoApp {

	public static void main(String[] args) {

		System.out.println("Application Started...!");

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Person p1 = new Person();
		p1.setpId(1);
		p1.setpName("Abhijeet");
		p1.setAddress("Pune");

		Vehicle v1 = new Vehicle();
		v1.setBikemodel("Honda");
		v1.setCarName("honda_city");
		p1.setVehicles(v1);

		Person p2 = new Person();
		p2.setpId(2);
		p2.setpName("Vidit");
		p2.setAddress("Delhi");

		Vehicle v2 = new Vehicle();
		v2.setBikemodel("bajaj");
		v2.setCarName("Mercedes");
		p2.setVehicles(v2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p1);
		session.save(p2);

		tx.commit();
		session.close();
		factory.close();
	}

}
