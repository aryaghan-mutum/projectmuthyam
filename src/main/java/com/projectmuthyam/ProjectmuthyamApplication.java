package com.projectmuthyam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@Configuration
//@PropertySources({
//        @PropertySource("classpath:database.properties"),
//        @PropertySource("classpath:email.properties"),
//})
public class ProjectmuthyamApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ProjectmuthyamApplication.class, args);
        DataBase db = ctx.getBean(DataBase.class);

        System.out.println("Name: " + db.getName());
        System.out.println("Password: " + db.getPassword());

        Contacts contacts = ctx.getBean(Contacts.class);
        System.out.println("Email: " + contacts.getEmail());
        System.out.println("Phone: " + contacts.getPhone());
    }

//    @Autowired
//    Environment env;
    // to get name and pass from env vars

    @Value("${contacts.name}")
    public String name;

    @Value("${contacts.password}")
    public String password;

    @Value("${contacts.emailId}")
    public String emailId;

    @Value("${contacts.phone}")
    public String phone;

    @Bean
    public DataBase getDetails() {
        DataBase db = new DataBase();
        db.setName(name);
        db.setPassword(password);
        return db;
    }

    @Bean
    public Contacts getContacts() {
        Contacts contacts = new Contacts();
        contacts.setEmail(emailId);
        contacts.setPhone(phone);
        return contacts;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer property() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
