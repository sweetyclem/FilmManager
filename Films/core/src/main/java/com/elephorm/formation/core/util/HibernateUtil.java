
package com.elephorm.formation.core.util;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.out.println("Initial SessionFactory creation failed" + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory geSessionFactory() {
        return SESSION_FACTORY;
    }
}
