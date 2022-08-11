package com.example.SpringbootDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	private int id;
	private int userId; 
	private String title;
	private String body;

}
