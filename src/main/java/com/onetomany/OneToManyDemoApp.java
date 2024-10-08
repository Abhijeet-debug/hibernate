package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDemoApp {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionid(121);
		q1.setQuestion("What is java ?");

		Answer a1 = new Answer(312, "Java is a programming language", q1);
		Answer a2 = new Answer(313, "Java Supports OOPS", q1);
		Answer a3 = new Answer(314, "Java has Special features", q1);

		List<Answer> answers = new ArrayList<Answer>();
		answers.add(a1);
		answers.add(a2);
		answers.add(a3);
		q1.setAnswers(answers);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);

		Question question1 = (Question) session.get(Question.class, 121);
		System.out.println(question1.getQuestion());
		for (Answer a : question1.getAnswers()) {
			System.out.println(a.getAnswer());
		}

		tx.commit();
		session.close();
		factory.close();

	}

}
