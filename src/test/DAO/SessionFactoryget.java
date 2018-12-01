package test.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryget {

	public static SessionFactory sessionFactory;
	static {
		sessionFactory=new Configuration()//
				.configure()//
				.buildSessionFactory();
	}
}
