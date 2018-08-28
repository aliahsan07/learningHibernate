package com.journaldev.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.service.ServiceRegistry;

public class HibernateAnnotationUtil {

	private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate-annotation.cfg.xml
//        	Configuration configuration = new Configuration();
//        	configuration.configure("hibernate-annotation.cfg.xml");
//        	System.out.println("Hibernate Annotation Configuration loaded");

            ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure().build();
            MetadataSources sources = new MetadataSources(standardRegistry);
            sources.addAnnotatedClassName("com.journaldev.hibernate.model.Cart1");
            sources.addAnnotatedClassName("com.journaldev.hibernate.model.Item1");
            Metadata metadata = sources.buildMetadata();
            SessionFactory sessionFactory = metadata.buildSessionFactory();
        	
//        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        	System.out.println("Hibernate Annotation serviceRegistry created");
        	
//        	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        	
            return sessionFactory;
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
}
