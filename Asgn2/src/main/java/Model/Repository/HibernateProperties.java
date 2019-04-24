package Model.Repository;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateProperties {
	private static final SessionFactory ourSessionFactory;

	static {
		try {

			Configuration configuration = new Configuration();

			configuration.configure();

			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());

			ourSessionFactory = configuration.buildSessionFactory(builder.build());
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return ourSessionFactory;
	}

	public static Session getSession() throws HibernateException {
		return ourSessionFactory.openSession();
}
}
