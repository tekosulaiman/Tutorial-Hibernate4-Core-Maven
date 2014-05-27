package co.id.dao.impl;

import co.id.dao.PersonDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Person;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class PersonDAOImpl extends BasisDAO<Person> implements PersonDAO{

    @Override
    public List<Person> getAllPersons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}