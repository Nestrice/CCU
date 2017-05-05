package de.chiliconunity.data;

import java.time.LocalDate;

public class Meal {
	public enum MealType {
			breakfast, lunch, dinner, miscellaneous
	}
	
	LocalDate date;
	RecipeDecorator recipe;
	MealType type;
	
	

}
