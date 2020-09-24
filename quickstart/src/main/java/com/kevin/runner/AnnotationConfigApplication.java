package com.kevin.runner;

import com.kevin.configuration.QuickStartApplicationConfiguration;
import com.kevin.quick.start.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解配置
 *
 * @author wangyong
 */
public class AnnotationConfigApplication {

  public static void main(String[] args) {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(
        QuickStartApplicationConfiguration.class);
    Person person = ctx.getBean(Person.class);
    System.out.println(person);

  }

}
