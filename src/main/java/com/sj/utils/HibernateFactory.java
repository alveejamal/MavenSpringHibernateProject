package com.sj.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {

	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		if (factory == null)
			factory = new Configuration().configure().buildSessionFactory();

		return factory;
	}

	public static void closeFactory() {
		factory.close();
	}

}
