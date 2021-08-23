package www.yyy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import www.yyy.entity.Person;
import www.yyy.service.PersonService;

import java.util.List;

public class test {

    @Test
    public  void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        PersonService personService = (PersonService) context.getBean("personService");

        List<Person> queryall = personService.queryall();

        for (Person person : queryall) {
            System.out.println(person);
        }
        /*User lll = userService.queryByName("yyy");
        System.out.println(lll);*/
    }
}
