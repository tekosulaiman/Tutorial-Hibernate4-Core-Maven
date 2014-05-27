package co.id.service.impl;

import co.id.dao.PersonDAO;
import co.id.dao.impl.PersonDAOImpl;
import co.id.model.Person;
import co.id.service.PersonService;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class PersonServiceImpl implements PersonService{

    private PersonDAO personDAO;

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public PersonServiceImpl() {
       personDAO = new PersonDAOImpl();
    }
    
    @Override
    public void save(Person person) {
        personDAO.save(person);
    }

    @Override
    public void saveOrUpdate(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> getAllPersons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}