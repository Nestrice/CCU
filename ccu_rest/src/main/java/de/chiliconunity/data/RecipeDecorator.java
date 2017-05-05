package de.chiliconunity.data;

public class RecipeDecorator extends Recipe{
	
	public RecipeDecorator(Recipe rezept){
		this.rezept = rezept;
		this.personsOver12 = -1;
		this.personsUnder12 = -1;
		
	}
	Recipe rezept;
	int personsOver12;
	int personsUnder12;
	
}
