package de.chili;

import java.net.URL;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.BeforeClass;
import org.junit.Test;

import de.chiliconunity.model.User;

public class UserTest {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

	private static SessionFactory buildSessionFactory() {
		try {
			if (sessionFactory == null) {
				URL f = UserTest.class.getResource("hibernate_test.cfg.xml");
				Configuration configuration = new Configuration()
						.configure(f);
				StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
				serviceRegistryBuilder.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
			return sessionFactory;
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	@BeforeClass
	public static void setup(){
		buildSessionFactory();	
	}


	@Test
	public void test1() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		User user = User.createUser(new Date(), "Thiemo", "abc@ef.de", User.Geschlecht.maennlich);
		session.save(user);
		tr.commit();
		session.close();
	}

	@Test
	public void test2() {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(session.createQuery("from USR").list());
		tr.commit();
		session.close();
	}

}
