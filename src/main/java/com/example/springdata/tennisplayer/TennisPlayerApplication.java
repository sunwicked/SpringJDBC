package com.example.springdata.tennisplayer;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisPlayerApplication {

	 private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

}
