package com.danianepg.demoliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLiquibaseApplication {

	/**
	 * When running with maven plugin
	 *
	 * mvn liquibase:generateChangeLog // Takes a snapshot from the database current state 
	 * mvn liquibase:changelogSync 
	 * mvn liquibase:updateSQL 
	 * mvn liquibase:update
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(DemoLiquibaseApplication.class, args);
	}

}
