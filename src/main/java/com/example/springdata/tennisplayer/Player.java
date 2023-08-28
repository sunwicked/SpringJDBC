package com.example.springdata.tennisplayer;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity
@Table(name="Player") // for matching  entity and table  we can remove annotation
@NamedQuery(name="get_all_players", query="select p from Player p")
public class Player {

	@Id
    @GeneratedValue
	private int id;
    private String name;
    
    @Column(name="nationality") //  the column mapping annotation is not needed since the column names
    private String nationality;
    private Date birthDate;
    private int titles;
	
    //The no-arg constructor is a requirement of the BeanPropertyRowMapper.
    public Player( ) {
    
    }
    
    public Player( String name, String nationality, Date birthDate, int titles) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.titles = titles;
	}
    
    public Player(int id, String name, String nationality, Date birthDate, int titles) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.titles = titles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getTitles() {
		return titles;
	}

	public void setTitles(int titles) {
		this.titles = titles;
	}

	@Override
	public String toString() {
		return "\nPlayer [id= " + id + ", name= " + name + ", nationality= " + nationality + ", birthDate= " + birthDate
				+ ", titles= " + titles + "]";
	}
}
