package com.sj.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sj.entity.*;
import com.sj.ifaces.DAO;
import com.sj.utils.HibernateFactory;

public class CarDao implements DAO<Car>{

	private SessionFactory factory;
	public CarDao(){
		factory = HibernateFactory.getSessionFactory();
	}
	@Override
	public Object add(Car object) {
		
		Session session = factory.openSession();
		Transaction trs = session.beginTransaction();
		
		String key = (String) session.save(object);
		trs.commit();
		
		return key;
		
	}

	@Override
	public Car find(Object key) {
		Session session = factory.openSession();
		
		Car foundCar = new Car();
		try
		{
			foundCar = session.find(Car.class, key);
			return foundCar;
		}
		
		catch(Exception e){
			return null;
		}
		
		
	}
	
	
	public void delete(Object key){
		
		Session session  =  factory.openSession();
		Transaction trs = session.beginTransaction();
		session.delete(key);
		trs.commit();
				
	}

}
