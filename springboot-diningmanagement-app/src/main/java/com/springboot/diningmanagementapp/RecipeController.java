package com.springboot.diningmanagementapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backtracking.DiningManagement;
import com.backtracking.Recipes;


@RestController
public class RecipeController {
	
	@GetMapping("/getRecipes")
     public List<List<String>> getRecipes(){
		
		ArrayList<Integer> Budget = new ArrayList<>();
		ArrayList<String> Nutrition = new ArrayList<>();
	    List<Recipes> recipeList = new ArrayList<Recipes>();
	    
	    List<String> ingredientsRec1 = new ArrayList<>();
	    ingredientsRec1.add("Onions");
	    ingredientsRec1.add("Tomatoes");
	    ingredientsRec1.add("beans");
	    ingredientsRec1.add("non-gluten");
	    Recipes newRec = new Recipes(ingredientsRec1, 25, "Recipe One");
	    recipeList.add(newRec);
	 
	    List<String> ingredientsRec2 = new ArrayList<>();
	    ingredientsRec2.add("Watermelon"); 
	    ingredientsRec2.add("Corn"); 
	    ingredientsRec2.add("chickpeas"); 
	    ingredientsRec2.add("non-peanut");
	    Recipes newingredientsRec2 = new Recipes(ingredientsRec2, 35, "Recipe Two");
	    recipeList.add(newingredientsRec2);
	       
	    List<String> ingredientsRec3 = new ArrayList<>();
	    ingredientsRec3.add("meat");
	    ingredientsRec3.add("rice");
	    ingredientsRec3.add("veggies");
	    Recipes newRec3 = new Recipes(ingredientsRec3, 41, "Recipe Three");
	    recipeList.add(newRec3);
	     
	    List<String> ingredientsRec4 = new ArrayList<>();
	    ingredientsRec4.add("Pears");
	    ingredientsRec4.add("Turkey");
	    ingredientsRec4.add("maize");
	    Recipes newRec4 = new Recipes(ingredientsRec4, 9, "Recipe Four");
	    recipeList.add(newRec4);
	    
	    List<String> Rec5 = new ArrayList<>();
	    Rec5.add("Milk");
	    Rec5.add("Potatoes");
	    Rec5.add("peas");
	    Recipes newRec5 = new Recipes(Rec5, 10, "Recipe five");
	    recipeList.add(newRec5);

	 
		// values for budget
		Budget.add(100);
		
		//values for nutrition
		Nutrition.add("non-gluten");
		Nutrition.add("non-peanut");
		
		List<List<String>> newList = DiningManagement.keyComponents(Budget, Nutrition, recipeList);
		System.out.println("****************************************************************");
        System.out.println("Recipes to be considered with our budget: " + newList);
        System.out.println("****************************************************************");
		return newList;
		
    	/*List<List<String>> result = new ArrayList<>();
    	result = DiningManagement.showFinalRecipes(result);
    	result = DiningManagement.keyComponents(Budget, Nutrition, recipeList);
		return result;
		*/ 
     }
}
