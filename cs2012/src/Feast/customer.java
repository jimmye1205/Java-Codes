package Feast;

public class customer {
    private double totalCalories;
    private int pancakeCounter;
    private int cupcakeCounter;
    
    public customer(){
        totalCalories = 0;
        pancakeCounter = 0;
        cupcakeCounter = 0;
    }
    
    public void eat(portion food){
        totalCalories += food.getCalories();
        if (food instanceof pancake) {
            pancakeCounter++;
            System.out.println("Customer eats a " + ((pancake)food).toString());
        }
        else if (food instanceof cupcake){
            cupcakeCounter++;
            System.out.println("Customer eats a " + ((cupcake)food).toString());
        }
    }
    
    public double getTotalCalories(){
        return totalCalories;
    }
    
    public int getPancakes(){
        return pancakeCounter;
    }
    
    public int getCupcakes(){
        return cupcakeCounter;
    }
    
}