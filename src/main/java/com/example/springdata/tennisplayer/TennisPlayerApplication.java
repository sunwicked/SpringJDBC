package com.example.springdata.tennisplayer;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));

		logger.info("\n\n>> Player with id 2: {}\n", repo.getPlayerById(2));
		logger.info("All Players Data: {}", repo.getAllPlayers());
	}

}
