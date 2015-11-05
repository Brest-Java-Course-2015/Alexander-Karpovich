package com.epam.brest.course2015.dto;

import com.epam.brest.course2015.domain.Dish;

import java.util.List;

/**
 * Created by ntrln on 04.11.15.
 */
public class DishDto {
	private List<Dish> dishes;
	private Integer total;

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
