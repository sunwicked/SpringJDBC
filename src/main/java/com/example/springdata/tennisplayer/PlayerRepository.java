package com.example.springdata.tennisplayer;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PlayerRepository {
	  
	    @PersistenceContext
	    EntityManager entityManager;
	  
	    public Player insertPlayer(Player player){
			return entityManager.merge(player);
		}

		public Player updatePlayer(Player player){
			return entityManager.merge(player);
		}

		public Player getPlayerById(int id) {
		    return entityManager.find(Player.class, id);			    
		}
	    
		public void deleteById(int id){
		    Player player = entityManager.find(Player.class, id);
		    entityManager.remove(player);
		}
		
		public List<Player> getAllPlayers() {
		    TypedQuery<Player> getAll = entityManager.createNamedQuery(
		                                                        "get_all_players", Player.class);
		    return getAll.getResultList();
		}
	
}
