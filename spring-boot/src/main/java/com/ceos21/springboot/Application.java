package com.ceos21.springboot;

import org.springframework.boot.CommandLineRunner; //특정 코드를 실행하는 인터페이스
import org.springframework.boot.SpringApplication; // Spring Boot 애플리케이션을 실행하는 클래스
import org.springframework.boot.autoconfigure.SpringBootApplication;//Spring Boot 애플리케이션을 자동 설정하는 어노테이션
import org.springframework.context.ApplicationContext;//Spring 컨테이너에서 빈(Bean)들을 관리하는 객체
import org.springframework.context.annotation.Bean;//특정 객체를 Spring 빈으로 등록하는 어노테이션

import java.util.Arrays;



@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect the beans provides by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
