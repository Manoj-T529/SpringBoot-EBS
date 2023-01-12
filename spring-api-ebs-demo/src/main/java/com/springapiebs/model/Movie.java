package com.springapiebs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	
	private int id;
	private String actor;
	private String actress;
	private String name;

}
