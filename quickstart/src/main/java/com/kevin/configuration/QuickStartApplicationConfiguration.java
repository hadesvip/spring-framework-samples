package com.kevin.configuration;

import com.kevin.quick.start.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickStartApplicationConfiguration {


  @Bean
  public Person person() {
    return new Person();
  }


}
