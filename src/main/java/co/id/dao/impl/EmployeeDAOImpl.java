package co.id.dao.impl;

import co.id.dao.EmployeeDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Employee;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeDAOImpl extends BasisDAO<Employee> implements EmployeeDAO{

    /*Pastikan data Employee mempunya id  = 1*/
    @Override
    public List<Employee> getAllEmployees() {
        //getSessionFactory().openSession();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //return (List<Employee>) getSession().createQuery("select emp.name from Employee emp where emp.id = 1");
        //return (List<Employee>) getSession().createCriteria(Employee.class).list();
        //return (List<Employee>) getSession().createCriteria(Employee.class).list();
        //return (List<Employee>) getSessionFactory().getCurrentSession().createCriteria(Employee.class).list();
        
        List list = getSession().createCriteria(Employee.class).list();
        return list;
    } 
}