package com.example.springdata.tennisplayer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerSpringDataRepository  extends JpaRepository<Player, Integer>{

    //no implementation required!
	public List<Player> findByNationality(String nationality);
}