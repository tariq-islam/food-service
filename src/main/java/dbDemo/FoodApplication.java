/**
@author Raymond Vargas
@version 1.0

The Food application class implements the Food Spring Boot service, an example application
for use with the Common Components Marketplace. This is a RESTful service that 
allows a user to create and delete food items in a relational database. The user will never
interact with this service directly. Instead, this service will be connected to a seperate UI
service, also deployed as a Spring Boot Application.
**/
package dbDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class FoodApplication extends SpringBootServletInitializer {

	@Autowired
    FoodRepository repository;
	
	 public static void main(String[] args) {
	        SpringApplication.run(FoodApplication.class);
	    }
}
