package com.epam.brest.course2015.domain;

/**
 * Created by ntrln on 04.11.15.
 */
public class Dish {
	private Integer dishId;

	private String name;

	private Integer cost;

	public Dish(String name, Integer cost){
		this.name = name;
		this.cost = cost;
	}

	public Integer getDishId() {
		return dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}


}
