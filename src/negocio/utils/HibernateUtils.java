/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.utils;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author luis
 */
public class HibernateUtils {
   private static SessionFactory sessionFactory = null;
   private static Session session;
    
   public static void createSessionFactory(){
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure(new File("src/hibernate.cfg.xml")).buildSessionFactory();
            session = sessionFactory.openSession();
        } catch (Exception ex) {
            // Make sure you log the exception, as it might be swallowed
            //System.err.println("Initial SessionFactory creation failed." + ex);
            throw ex;
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
      
    public static Session getSession() { 
        try
        {
            if (session != null && session.isOpen()) {
                return session;
            } else {
                session = getSessionFactory().openSession();
                return session; 
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
