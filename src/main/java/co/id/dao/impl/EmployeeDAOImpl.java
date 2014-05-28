package co.id.dao.impl;

import co.id.dao.EmployeeDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Employee;
import java.util.List;
import org.hibernate.Query;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeDAOImpl extends BasisDAO<Employee> implements EmployeeDAO{

    @Override
    public List<Employee> getSelectClauseEmployees() {
        
        /*Cara Pertama*/
        String hql = "SELECT E.id, E.name FROM Employee E";
        Query query = getSession().createQuery(hql);
        List list = query.list();
        
        /*Cara Kedua*/
        /*List list = getSession().createQuery("SELECT E.id, E.name FROM Employee E").list();*/
        
        return list;
    }

    @Override
    public List<Employee> getFromClauseEmployees() {
        
        /*Cara Pertama*/
        String hql = "FROM Employee";
        Query query = getSession().createQuery(hql);
        List list = query.list();
        
        /*Cara Kedua*/
        /*List list = getSession().createQuery("FROM Employee").list();*/
        
        return list;
    }

    @Override
    public List<Employee> getWhereClauseEmployees() {
         /*Cara Pertama*/
        String hql = "FROM Employee E WHERE E.id = 1";
        Query query = getSession().createQuery(hql);
        List list = query.list();
        
        /*Cara Kedua*/
        /*List list = getSession().createQuery("FROM Employee E WHERE E.id = 1").list();*/
        
        return list;
    }

    @Override
    public List<Employee> getOrderByClauseEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}