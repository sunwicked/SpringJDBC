package com.example.springdata.tennisplayer;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisPlayerSpringDataApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerSpringDataRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Inserting rows
		logger.info("Inserting Player: {}", repo.save(new Player("Djokovic", "Serbia", 
		                                                Date.valueOf("1987-05-22"), 81)));
		logger.info("Inserting Player: {}", repo.save(new Player("Monfils", "France", 
		                                                Date.valueOf("1986-09-01"), 10)));
		logger.info("Inserting Player: {}", repo.save(new Player("Thiem", "Austria", 
		                                                new Date(System.currentTimeMillis()), 17)));
	
		//Updating row
		logger.info("Updating Player with Id 3: {}", repo.save(new Player(3, "Thiem", "Austria", 
		                                                Date.valueOf("1993-09-03"), 17)));
	
		logger.info("Player with Id 2: {}", repo.findById(2));
		logger.info("Player with nationality France: {}", repo.findByNationality("France"));
		logger.info("All Players Data: {}", repo.findAll());
		repo.deleteById(2);
	}
	

}
