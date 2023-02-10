package com.danita.danitashopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
/**
 * @author daniel Taye
 *
 */

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class DanitaShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DanitaShoppingApplication.class, args);
    }

}
