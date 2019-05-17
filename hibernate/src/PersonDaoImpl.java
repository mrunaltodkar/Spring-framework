package com.capgemini.hibernate.dao;

import org.hibernate.*;
import com.capgemini.hibernate.util.*;
import com.capgemini.hibernate.person.*;


public class PersonDaoImpl implements PersonDao{
	public void addPerson(Person person){
		SessionFactory factory = HibernateUtil.getSessionFactory(); 
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
	
		HibernateUtil.closeSessionFactory();
	}	

}