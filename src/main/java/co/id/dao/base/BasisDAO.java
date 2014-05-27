package co.id.dao.base;

import co.id.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author tombisnis@yahoo.com
 */
public abstract class BasisDAO<T> {
    
    private Session session;
    private SessionFactory sessionFactory;

    protected BasisDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
        
        session = sessionFactory.openSession();
    }
    
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public void save(T entity){
        //session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.save(entity);
        session.getTransaction().commit();
    }

    public void saveOrUpdate(T entity){
        //session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.save(entity);
        session.getTransaction().commit();
    }

    public void delete(T entity){
        //session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.save(entity);
        session.getTransaction().commit();
    }
}