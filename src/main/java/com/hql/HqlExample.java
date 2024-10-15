package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate1.Student;

public class HqlExample {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

//		String query = "From Student";
//		Query q = session.createQuery(query);
//
//		List<Student> list = q.list();
//		for (Student student : list) {
//			System.out.println(student.getName() + " : " + student.getCity());
//		}

//		String query = "from Student where city = 'Pune'";
//		Query q = session.createQuery(query);
//
//		List<Student> list = q.list();
//		for (Student student : list) {
//			System.out.println(student.getName() + " : " + student.getCity());
//		}

//		String query = "from Student where city =:x";
//		Query q = session.createQuery(query);
//		q.setParameter("x", "Delhi");
//
//		List<Student> list = q.list();
//		for (Student student : list) {
//			System.out.println(student.getName() + " : " + student.getCity());
//		}

		String query = "from Student as s where s.city =:x and s.name=:n";
		Query q = session.createQuery(query);
		q.setParameter("x", "Delhi");
		q.setParameter("n", "Abhijeet");

		List<Student> list = q.list();
		for (Student student : list) {
			System.out.println(student.getName() + " : " + student.getCity());
		}
		System.out.println("-----------------------------------------------------------------------");

		Transaction tx = session.beginTransaction();
//		String query1 = "DELETE From Student s where s.city=:c";
//		Query q1 = session.createQuery(query1);
//		q1.setParameter("c", "Pune");
//
//		int rowsAffected = q1.executeUpdate();
//		System.out.println("Updated " + rowsAffected + " rows affected");

//		String query1 = "Update Student s set s.name =:n where s.city=:c";
//		Query q1 = session.createQuery(query1);
//		q1.setParameter("n", "Diksha");
//		q1.setParameter("c", "Mumbai");
//
//		int rowsAffected = q1.executeUpdate();
//		System.out.println("Updated " + rowsAffected + " rows affected");
		tx.commit();
		session.close();
	}

}
