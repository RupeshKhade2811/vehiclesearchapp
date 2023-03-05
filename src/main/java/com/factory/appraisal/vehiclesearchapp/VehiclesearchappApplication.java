package com.factory.appraisal.vehiclesearchapp;
/**
 * This is the main class of project
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/*import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;*/

//@EnableElasticsearchRepositories(basePackages = "com.factory.appraisal.vehiclesearchapp.repository")
@ComponentScan(basePackages = { "com.factory.appraisal.vehiclesearchapp" })
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.factory.appraisal.vehiclesearchapp")
		public class VehiclesearchappApplication {


	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(VehiclesearchappApplication.class, args);


	}

}
