package com.lr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
	
	public static Session getConnection() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
}
