package com.go.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
	private SessionFactory sessionFactory;
	protected void setUp() {
		final StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}catch(Exception ex) {
			ex.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
//	protected void update() {
//		Book book = new Book();
//		book.setId(1);
//		book.setAuthor("i don know");
//		book.setPrice(5f);
//		book.setTitle("I don know");
//		
//		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.saveOrUpdate(book);
//		session.getTransaction().commit();
//		session.close();
//		session.clear();
//	}
	protected void create() {
		Book book = new Book();
		book.setId(1);
		book.setTitle("Effective java BULENG");
		book.setAuthor("Joshua Bloch");
		book.setPrice(24);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(book);
		session.getTransaction().commit();
		session.close();
	}
	protected void exit() {
		sessionFactory.close();
	}
	public static void main(String[] args) {

		BookManager manager = new BookManager();
		manager.setUp();
		manager.create();
//		manager.update();
		manager.exit();
	}

}
