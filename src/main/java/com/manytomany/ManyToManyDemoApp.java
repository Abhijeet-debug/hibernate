package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemoApp {

	public static void main(String[] args) {

		System.out.println("Project Started..!");

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Employee e1 = new Employee();
		e1.setEmployeeId(121);
		e1.setEmployeeName("Abhijeet");

		Employee e2 = new Employee();
		e2.setEmployeeId(122);
		e2.setEmployeeName("Vidit");

		Project p1 = new Project();
		p1.setProjectId(212);
		p1.setProjectName("Androaid");

		Project p2 = new Project();
		p2.setProjectId(213);
		p2.setProjectName("java");

		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);

		List<Project> prjlist = new ArrayList<Project>();
		prjlist.add(p1);
		prjlist.add(p2);

		e1.setProjects(prjlist);
//		e2.setProjects(prjlist);

//		p1.setEmployess(emplist);
		p2.setEmployess(emplist);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);

		tx.commit();
		session.close();
		factory.close();
	}

}
