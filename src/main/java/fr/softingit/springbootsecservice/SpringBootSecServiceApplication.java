package fr.softingit.springbootsecservice;

import fr.softingit.springbootsecservice.sec.entities.AppRole;
import fr.softingit.springbootsecservice.sec.entities.AppUser;
import fr.softingit.springbootsecservice.sec.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringBootSecServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecServiceApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner start(AccountService accountService){

        return args -> {
            accountService.addNewRole(new AppRole(null, "USER"));
            accountService.addNewRole(new AppRole(null, "ADMIN"));
            accountService.addNewRole(new AppRole(null, "CUSTOMER_MANAGER"));
            accountService.addNewRole(new AppRole(null, "PRODUCT_MANAGER"));
            accountService.addNewRole(new AppRole(null, "BILLS_MANAGER"));

            accountService.addNewUser(new AppUser(null, "brahim", "brahim", new ArrayList<>()));
            accountService.addNewUser(new AppUser(null, "yacine", "yacine", new ArrayList<>()));
            accountService.addNewUser(new AppUser(null, "admin", "admin", new ArrayList<>()));

            accountService.addRoleToUser("brahim","USER");
            accountService.addRoleToUser("brahim","CUSTOMER_MANAGER");

            accountService.addRoleToUser("yacine","USER");
            accountService.addRoleToUser("yacine","PRODUCT_MANAGER");
            accountService.addRoleToUser("yacine","BILLS_MANAGER");

            accountService.addRoleToUser("admin","ADMIN");

        };
    }

}
