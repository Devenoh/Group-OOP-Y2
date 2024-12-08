/*
*IngredientsA.java
@author Aaron Tracey
*16/11/2024
*/

public class IngredientsA {
    private int onions;
    private int carrots;
    private int tomatoes;
    private int potatoes;
    private int beef;
    private int chicken;
    private int fish;
    private int bread;
    private int rice;
    private int milk;

    public IngredientsA(int onions, int carrots, int tomatoes, int potatoes, int beef, int chicken, int fish, int bread, int rice, int milk){
        this.onions = onions;
        this.carrots = carrots;
        this.tomatoes = tomatoes;
        this.potatoes = potatoes;
        this.beef = beef;
        this.chicken = chicken;
        this.fish = fish;
        this.bread = bread;
        this.rice = rice;
        this.milk = milk;
    }

    public IngredientsA(){
        onions = 0;
        carrots = 0;
        tomatoes = 0;
        potatoes = 0;
        beef = 0;
        chicken = 0;
        fish = 0;
        bread = 0;
        rice = 0;
        milk = 0;
    }

    public boolean greaterThanOrEqualTo(IngredientsA otherIngredients){  // Check if these ingredients are greater than or equal to the other ingredients
        return onions >= otherIngredients.onions &&
                carrots >= otherIngredients.carrots &&
                tomatoes >= otherIngredients.tomatoes &&
                potatoes >= otherIngredients.potatoes &&
                beef >= otherIngredients.beef &&
                chicken >= otherIngredients.chicken &&
                fish >= otherIngredients.fish &&
                bread >= otherIngredients.bread &&
                rice >= otherIngredients.rice &&
                milk >= otherIngredients.milk;
    }

    public IngredientsA subtract(IngredientsA otherIngredients) {  // Subtract other ingredients from these ingredients
        return new IngredientsA(
                onions - otherIngredients.onions,
                carrots - otherIngredients.carrots,
                tomatoes - otherIngredients.tomatoes,
                potatoes - otherIngredients.potatoes,
                beef - otherIngredients.beef,
                chicken - otherIngredients.chicken,
                fish - otherIngredients.fish,
                bread - otherIngredients.bread,
                rice - otherIngredients.rice,
                milk - otherIngredients.milk
        );
    }

    public String getSavingString() {
        return String.valueOf(onions)
                + "," + String.valueOf(carrots)
                + "," + String.valueOf(tomatoes)
                + "," + String.valueOf(potatoes)
                + "," + String.valueOf(beef)
                + "," + String.valueOf(chicken)
                + "," + String.valueOf(fish)
                + "," + String.valueOf(bread)
                + "," + String.valueOf(rice)
                + "," + String.valueOf(milk);
    }

    public void setOnions(int onions){
        this.onions = onions;
    }

    public int getOnions() {
        return onions;
    }

    public void setCarrots(int carrots){
        this.carrots = carrots;
    }

    public int getCarrots() {
        return carrots;
    }

    public void setTomatoes(int tomatoes){
        this.tomatoes = tomatoes;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public void setPotatoes(int potatoes){
        this.potatoes = potatoes;
    }

    public int getPotatoes(){
        return potatoes;
    }

    public void setBeef(int beef){
        this.beef = beef;
    }

    public int getBeef(){
        return beef;
    }
    public void setChicken(int chicken){
        this.chicken = chicken;
    }

    public int getChicken() {
        return chicken;
    }

    public void setFish(int fish){
        this.fish = fish;
    }

    public int getFish() {
        return fish;
    }

    public void setBread(int bread){
        this.bread = bread;
    }

    public int getBread() {
        return bread;
    }

    public void setRice(int rice){
        this.rice = rice;
    }

    public int getRice() {
        return rice;
    }

    public void setMilk(int milk){
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }
}
