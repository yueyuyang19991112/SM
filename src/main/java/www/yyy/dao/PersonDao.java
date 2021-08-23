package www.yyy.dao;

import www.yyy.entity.Person;

import java.util.List;

public interface PersonDao {
   List<Person> queryall();

   Person queryById(String id);

   void insertperson(Person person);

   void updateperson(Person person);

   void deleteperson(String id);

}
