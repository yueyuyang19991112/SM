package www.yyy.action;

import www.yyy.entity.Person;
import www.yyy.service.PersonService;

import java.util.List;

public class PersonAction {
    private PersonService personService;
    private Person person;
    List<Person> queryall;

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public String queryall(){
        try {
           queryall = personService.queryall();
           return  "queryall";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public String insert(){

        try {
            personService.insertperson(person);
            return "insert";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public String delete(){
        try {
            personService.deleteperson(person.getId());
            return "delete";
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }
    public String queryone(){
        try {
            person = personService.queryById(this.person.getId());
            return "queryone";
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }

    public String update(){
        try {
           personService.updateperson(person);
            System.out.println(person);
           return  "update";
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }

    public List<Person> getQueryall() {
        return queryall;
    }

    public void setQueryall(List<Person> queryall) {
        this.queryall = queryall;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
