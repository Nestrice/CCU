package de.chiliconunity.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"de.chiliconunity.app","de.chiliconunity.controllers", "de.chiliconunity.data", "de.chiliconunity.repositories"})
@EntityScan("de.chiliconunity.data")
@EnableJpaRepositories("de.chiliconunity.repositories")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
