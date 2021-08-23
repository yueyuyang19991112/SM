package www.yyy.service;

import www.yyy.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> queryall();

    Person queryById(String id);

    void insertperson(Person person);

    void updateperson(Person person);

    void deleteperson(String id);
}
