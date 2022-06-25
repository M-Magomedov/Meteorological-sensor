package ru.magomedov.environmentalSensors;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication (exclude = SqlInitializationAutoConfiguration.class)
public class EnvironmentaLSensorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvironmentaLSensorsApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
