package be.intecbrussel.banking_app_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BankingAppSpringApplication {

    public static void main(String[] args) {

//        BigDecimal bigDecimal = new BigDecimal("1.1");
//        bigDecimal = bigDecimal.add(new BigDecimal("1"));
//        System.out.println(bigDecimal);

//        String s = "Hello World";
//        s = s.toUpperCase();
//        System.out.println(s);


           SpringApplication.run(BankingAppSpringApplication.class, args);
    }

}
