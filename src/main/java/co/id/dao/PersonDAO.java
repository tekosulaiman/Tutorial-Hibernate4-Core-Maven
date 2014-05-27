package co.id.dao;

import co.id.model.Person;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public interface PersonDAO {
    public void save(Person person);
    public void saveOrUpdate(Person person);
    public void delete(Person person);
    public List<Person> getAllPersons();
}