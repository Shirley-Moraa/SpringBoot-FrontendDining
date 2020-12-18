package com.springboot.diningmanagementapp.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ManyToMany
	private List<String> ingredients;
	private int cost;
	private String title;
	private boolean containsGluten;
	private boolean containsPeanuts;

	public Recipes() {
		super();
	}
	
	public Recipes(List<String> ingredients, int cost, String title) {
		super();
		this.ingredients = ingredients;
		this.cost = cost;
		this.title = title;
	}

	public int findCost() {
		return cost;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public String getTitle() {
		return title;
	}

	public boolean hasNoPeanuts(List<String> ingredients) {
		// check if the ingredients has peanuts
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredients.get(i).equals("non-peanut")) {
				return true;
			}
		}
		return false;
	}

	public boolean hasNoGluten(List<String> ingredients) {
		// check if the ingredients has gluten
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredients.get(i).equals("non-gluten")) {
				return true;
			}
		}
		return false;
	}

	public String display() {
		return ingredients + " :" + cost;
	}
}
