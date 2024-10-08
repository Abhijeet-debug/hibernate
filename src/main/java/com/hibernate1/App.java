package com.hibernate1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("project Started..!");

		// We use sessionfactory to build a session for
		// database and hibernate
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//		System.out.println(factory);
//		System.out.println(factory.isClosed());

//		creating student object and setting values
		Student st = new Student();
		st.setId(2);
		st.setName("Vidit");
		st.setCity("Lucknow");
		System.out.println(st.toString());

		// creating address
		Address ad = new Address();
		ad.setStreet("Mehsi");
		ad.setCity("Motihari");
		ad.setOpen(true);
		ad.setX(22.467);
		ad.setAddedDate(new Date());

		// Reading file
		FileInputStream file = new FileInputStream("src/main/java/IMG_20240729_223245_656.jpg");
		byte[] imageData = new byte[file.available()];
		file.read(imageData);
		ad.setData(imageData);

		// opening a session
		Session session = factory.openSession();
		// Transaction is a java object used to give the
		// instructions to database
		Transaction tx = session.beginTransaction();
		// we use save to provide the object to push in
		// database table
		session.save(st);
		session.save(ad);
		// commit is a transaction function used to push
		// some changes to database with reference to hql
		// query
		tx.commit();
		session.close();
		System.out.println("Scuccesfull...!");

	}
}
