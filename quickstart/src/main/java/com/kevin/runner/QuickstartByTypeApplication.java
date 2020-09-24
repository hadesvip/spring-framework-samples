package com.kevin.runner;

import com.kevin.quick.start.domain.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * quickstartByTypeApplication
 *
 * @author wangyong
 */
public class QuickstartByTypeApplication {

  public static void main(String[] args) throws Exception {

    BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
    Person person = factory.getBean(Person.class);
    System.out.println(person);
  }
}
