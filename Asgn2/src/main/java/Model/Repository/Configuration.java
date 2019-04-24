package Model.Repository;

public class Configuration {

	private static final SessionFactory ourSessionFactory;

	static {
		try {

			Configuration configuration = new Configuration();

			configuration.configure();

			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());

			ourSessionFactory = configuration.buildSessionFactory(builder.build());
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return ourSessionFactory;
	}

	public static Session getSession() throws HibernateException {
		return ourSessionFactory.openSession();
}
}
