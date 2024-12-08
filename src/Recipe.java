/*
*Recipe.java
@author Aaron Tracey
*16/11/2024
*/

public class Recipe {
    private String name;
    private IngredientsA ingredients;

    private String directions;

    public Recipe(String name, String directions, int onions, int carrots, int tomatoes, int potatoes, int beef, int chicken, int fish, int bread, int rice, int milk) {
        this.name = name;
        this.directions = directions;
        ingredients = new IngredientsA(onions, carrots, tomatoes, potatoes, beef, chicken, fish, bread, rice, milk);
    }

    public Recipe(String name, String directions, IngredientsA ingredients){
        this.name = name;
        this.directions = directions;
        this.ingredients = ingredients;
    }

    public Recipe(){
        name = "";
        ingredients = new IngredientsA();
        directions = "";
    }



    public boolean checkIngredients(IngredientsA otherIngredients) {  // Check if we can cook the recipe using ingredients
        return otherIngredients.greaterThanOrEqualTo(this.ingredients);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(IngredientsA ingredients){
        this.ingredients = ingredients;
    }

    public IngredientsA getIngredients() {
        return ingredients;
    }


    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
}