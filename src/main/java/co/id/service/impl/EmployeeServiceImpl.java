package co.id.service.impl;

import co.id.dao.EmployeeDAO;
import co.id.dao.impl.EmployeeDAOImpl;
import co.id.model.Employee;
import co.id.service.EmployeeService;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    
    public EmployeeServiceImpl(){
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void save(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveOrUpdate(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getSelectClauseEmployees(){
        return employeeDAO.getSelectClauseEmployees();
    }

    @Override
    public List<Employee> getFromClauseEmployees(){
        return employeeDAO.getFromClauseEmployees();
    }

    @Override
    public List<Employee> getWhereClauseEmployees(){
        return employeeDAO.getWhereClauseEmployees();
    }

    @Override
    public List<Employee> getOrderByClauseEmployees(){
        return employeeDAO.getOrderByClauseEmployees();
    }
}