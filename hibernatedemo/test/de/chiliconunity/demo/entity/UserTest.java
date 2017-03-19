package de.chiliconunity.demo.entity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import org.hibernate.Session;
import org.junit.Test;

import de.chiliconunity.demo.entity.User;
import de.chiliconunity.demo.util.HibernateUtil;

public class UserTest {
	
	@Test
	public void saveAndRetrieve()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
      
		User user = new User();
	
		user.setEmail("max@chiliconunity.de");
		user.setFirstName("max");
		user.setLastName("bäcker");
      
		session.save(user);
		
		User user2 = new User();
		
		user2.setEmail("moni@chiliconunity.de");
		user2.setFirstName("moni");
		user2.setLastName("koch");
      
		session.save(user2);
		
		session.getTransaction().commit();
      
		@SuppressWarnings(value = {"unchecked"})
		List<User> users = (List<User>) session.createQuery("from User").list();
		
		assertThat(users.size(), equalTo(2));
		assertThat(users.get(0).getEmail(), equalTo("max@chiliconunity.de"));
		assertThat(users.get(0).getLastName(), equalTo("bäcker"));
      
      HibernateUtil.shutdown();
   }
}