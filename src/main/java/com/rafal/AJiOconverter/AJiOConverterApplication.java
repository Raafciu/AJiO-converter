package com.rafal.AJiOconverter;

import com.rafal.AJiOconverter.model.User;
import com.rafal.AJiOconverter.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.jmx.support.RegistrationPolicy;

import java.util.stream.Stream;

@SpringBootApplication
@PropertySources({
        @PropertySource(AJiOConverterApplication.APPLICATION_YML),
        @PropertySource(AJiOConverterApplication.DB_PROPERTIES)
})
@ComponentScan(AJiOConverterApplication.DEFAULT_PACKAGE)
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class AJiOConverterApplication {

    static final String APPLICATION_YML = "classpath:application.yml";
    static final String DB_PROPERTIES = "classpath:db.properties";
    static final String DEFAULT_PACKAGE = "com.rafal.AJiOconverter";

    public static void main(String[] args) {
        SpringApplication.run(AJiOConverterApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("Kowalski", "Nowak", "Małysz", "Lukmajster", "Dąbrowski").forEach(name -> {
                User user = new User();
                user.setImie("Adam");
                user.setNazwisko(name);
                user.setWiek(30);
                user.setEmail(name + "@gmail.com");
                userRepository.save(user);
            });
        };
    }
}
