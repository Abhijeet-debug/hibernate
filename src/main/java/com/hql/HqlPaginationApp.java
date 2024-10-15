package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate1.Student;

public class HqlPaginationApp {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		String query = "From Student";
		Query q = session.createQuery(query);
		q.setFirstResult(2);
		q.setMaxResults(3);

		List<Student> list = q.list();
		for (Student student : list) {
			System.out.println(student.getName() + " " + student.getCity());
		}

		session.close();
	}

}
