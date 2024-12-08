/*
Utils.java
@author Aaron Tracey
16/11/2024
*/

import java.util.ArrayList;

public class RecipeStorageA {
   private ArrayList<Recipe> recipes;  // ArrayList to store the recipes

   public RecipeStorageA(ArrayList<Recipe> recipes){
       this.recipes = recipes;
   }

   public RecipeStorageA(){
       this.recipes = new ArrayList<Recipe>();
       recipes.add(new Recipe(
           "recipe 1 - Big Onion",
           "add a lot of onions to the pot and boil it.",
           10,
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 2 - Onion Carrots",
           "add onions and carrots to the pot and boil it.",
           5,
           5,
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 3 - Big Carrot",
           "add carrots to the oven and roast it.",
           0,
           10,
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 4 - Carrots and Tomatoes",
           "add carrots and tomatoes to the pot and boil it.",
           0,
           5,
           5,
           0,
           0,
           0,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 5 - POH-TAY-TOES",
           "Boil 'em, Mash 'em, Stick 'em in a schtew.",
           1,
           0,
           0,
           10,
           0,
           0,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 6 - Potato and Beef",
           "Roast the potatoes with the beef in the oven.",
           0,
           0,
           0,
           10,
           2,
           0,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 7 - Chief Beef",
           "Fry the beef with oil, butter, and some salt and pepper!",
           0,
           0,
           0,
           0,
           5,
           0,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 8 - Beef or chicken? Beef or chicken?",
           "Roast the beef with oil with the chicken in the oven.",
           0,
           0,
           0,
           0,
           10,
           10,
           0,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 9 - Chicken and fish!",
           "Boil the chicken until it breaks down and becomes soup. boil the fish in the soup.",
           2,
           1,
           0,
           3,
           0,
           8,
           2,
           1,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 10 - Tuna sandwich",
           "Take the bread and put the fish between it!",
           0,
           0,
           0,
           0,
           0,
           0,
           1,
           2,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 11 - Bread",
           "It's just bread. Eat it. Not my fault you spent all your money on Guinness.",
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           1,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 12 - Salmon and Rice",
           "Fry the salmon on both sides and boil the rice. Serve salmon on top of rice with vegetables, optional slice of lemon.",
           2,
           2,
           0,
           0,
           0,
           0,
           2,
           0,
           5,
           2
       ));

       recipes.add(new Recipe(
           "recipe 13 - Rice ball",
           "Put some rice to boil with some salt and when it's done, squish it into a ball and eat it. Trust me.",
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           15,
           0
       ));

       recipes.add( new Recipe(
           "recipe 14 - Salmon Onigiri",
           "Fry a salmon fillet, shred it up, and wrap some of it up in boiled rice. add salt and mayo if you can.",
           0,
           0,
           0,
           0,
           0,
           0,
           2,
           0,
           10,
           0
       ));

       recipes.add(new Recipe(
           "recipe 15 - Beef Onigiri",
           "Fry up a slice of steak, chop it up, and wrap some of it up in boiled rice. add salt, pepper and siracha if you can.",
           0,
           0,
           0,
           0,
           5,
           0,
           0,
           0,
           10,
           0
       ));

       recipes.add( new Recipe(
           "recipe 16 - Congee (rice porridge)",
           "Boil some rice and milk together 40 minutes.",
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           0,
           10,
           5
       ));

       recipes.add(new Recipe(
           "recipe 17 - Mashed Potatoes",
           "Boil some potatoes, drain the water, then add salt, pepper, milk, and butter.",
           0,
           0,
           0,
           10,
           0,
           0,
           0,
           0,
           0,
           5
       ));

       recipes.add(new Recipe(
           "Recipe 18 - Surf N' Turf",
           "Fry some steak until at desired doneness. Fry some fish until desired doneness. Serve with roasted potatoes and gravy.",
           1,
           0,
           0,
           5,
           5,
           0,
           4,
           0,
           0,
           0
       ));

       recipes.add(new Recipe(
           "recipe 19 - Steak Frites",
           "Fry some steak and fry some chips, make a pepper sauce with pepper and milk, and serve.",
           2,
           0,
           0,
           10,
           5,
           0,
           0,
           0,
           0,
           3
       ));

       recipes.add(new Recipe(
           "recipe 20 - Paella",
           "Throw everything in the pot and boil it.",
           3,
           2,
           6,
           4,
           5,
           3,
           7,
           2,
           9,
           5
       ));
   }

    public Recipe getRecipe(int index) {
        return recipes.get(index);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public int getRecipeCount() {
        return recipes.size();
    }

    public ArrayList<Recipe> filterRecipes(IngredientsA ingredients) {  // Get only recipes we can cook
       ArrayList<Recipe> returnList = new ArrayList<>();
        for (Recipe currentRecipe : recipes) {
            if (currentRecipe.checkIngredients(ingredients)) {
                returnList.add(currentRecipe);
            }
        }
       return returnList;
    }

   public void addRecipe(Recipe recipe) {
       recipes.add(recipe);
   }

   public void removeByIndex(int index) {
       recipes.remove(index);
   }

   public void remove(Recipe recipe) {
       recipes.remove(recipe);
   }

}
