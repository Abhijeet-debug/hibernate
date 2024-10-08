package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemoApp {
	public static void main(String[] args) {

		// session factory
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();
//
//		// creating question
//		Question q1 = new Question();
//		q1.setQuestionId(123);
//		q1.setQuestion("What is java ?");
//
//		// creating Answer
//		Answer a1 = new Answer();
//		a1.setAnswerId(324);
//		a1.setAnswer("Java is a programming lamguague..");
//		a1.setQuestion(q1);
//		q1.setAnswer(a1);
//
//		// creating question
//		Question q2 = new Question();
//		q2.setQuestionId(124);
//		q2.setQuestion("What is Collection ?");
//
//		// creating Answer
//		Answer a2 = new Answer();
//		a2.setAnswerId(325);
//		a2.setAnswer("Collection is an API..");
//		a2.setQuestion(q2);
//		q2.setAnswer(a2);
//
//		// creating session
//		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
//
//		// save
//		session.save(q1);
//		session.save(q2);
//		session.save(a1);
//		session.save(a2);
//
//		tx.commit();
//
//		// fetch
//		Question question1 = (Question) session.get(Question.class, 123);
//		System.out.println(question1.getQuestion());
//		System.out.println(question1.getAnswer());
//		System.out.println(question1.getAnswer().getAnswer());
//
//		session.close();
//		factory.close();

	}

}
