package co.id.service;

import co.id.model.Person;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public interface PersonService {
    public void save(Person person);
    public void saveOrUpdate(Person person);
    public void delete(Person person);
    public List<Person> getAllPersons();
}