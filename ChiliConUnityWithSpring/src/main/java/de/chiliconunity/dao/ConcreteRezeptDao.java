package de.chiliconunity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import de.chiliconunity.model.Rezept;

public class ConcreteRezeptDao implements RezeptDao {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	
	@Override
	public void save(Rezept toSave) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(toSave);
		tx.commit();
		session.close();

	}

}
