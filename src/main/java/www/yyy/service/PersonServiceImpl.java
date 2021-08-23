package www.yyy.service;

import www.yyy.dao.PersonDao;
import www.yyy.entity.Person;

import java.util.List;
import java.util.UUID;

public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> queryall() {
        return personDao.queryall();
    }

    @Override
    public Person queryById(String id) {
        return personDao.queryById(id);
    }

    @Override
    public void insertperson(Person person) {
        person.setId(UUID.randomUUID().toString());
        personDao.insertperson(person);
    }

    @Override
    public void updateperson(Person person) {

        personDao.updateperson(person);
    }

    @Override
    public void deleteperson(String id) {
        personDao.deleteperson(id);
    }
}
