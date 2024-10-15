package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlQueryApp {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		String query = "select * from student_table";

		NativeQuery nq = session.createNativeQuery(query);
		List<Object[]> student = nq.list();
		for (Object[] o : student) {
//			System.out.println(Arrays.toString(o));
			System.out.println(o[1] + " " + o[2]);
		}

		session.close();
	}

}
