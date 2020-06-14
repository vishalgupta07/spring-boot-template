package springboot.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Main function in spring-boot application that actually defines the entry point for the application
 * and abstracts the spring configuration for the developer
 * <p>
 * annotation - @SpringBootApplication actually abstracts the auto configuration enable for the application
 */
@EnableCaching
@SpringBootApplication
/*
@ImportResource(value = {"classpath:springboot/template/resource-context.xml"})

On importing this we can use the custom specified datasource-configuration/mybatis-configuration
 */
public class SpringConfig {

    /**
     * Main method called when [mvn spring-boot:run] is invoked in the terminal
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringConfig.class, args);
    }
}
