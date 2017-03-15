package de.chiliconunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

@SpringBootApplication
public class ChiliConUnityWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChiliConUnityWithSpringApplication.class, args);
		
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory sessions = cfg.buildSessionFactory();
	        
	        
	}
	
	   @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurerAdapter() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**");
	            }
	        };
	    }
}
