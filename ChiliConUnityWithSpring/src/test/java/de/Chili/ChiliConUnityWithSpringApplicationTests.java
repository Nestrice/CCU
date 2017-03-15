package de.Chili;

//import static org.assertj.core.api.Assertions.useRepresentation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

//import de.chiliconunity.model.Mann;
import de.chiliconunity.model.User;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ChiliConUnityWithSpringApplicationTests {
	SessionFactory sessionFactory;

	public void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}

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
