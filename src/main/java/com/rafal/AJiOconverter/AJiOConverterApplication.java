package com.rafal.AJiOconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.jmx.support.RegistrationPolicy;

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

}
