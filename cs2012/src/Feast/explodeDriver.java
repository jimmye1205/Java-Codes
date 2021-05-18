package Feast;
import java.util.*;


public class explodeDriver{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        customer someone = new customer();
        Random random = new Random();
        do {
            boolean foodChoice = random.nextBoolean();
            if (foodChoice) {
                //pancake with radius between 3 and 15 cm
                double radius = (random.nextDouble()) + (random.nextInt(11) + 3);
                someone.eat(new pancake(radius));
            }
            else{
                //cupcake with radius between 4 and 5 and height between 3 and 7
                double radius = (random.nextDouble()) + 4;
                double height = (random.nextDouble()) + (random.nextInt(3) + 3);
                someone.eat(new cupcake(radius, height));
            }
        } while (someone.getTotalCalories() <= 10000);
        
        System.out.println("Customer ate " + someone.getPancakes() 
                + " pancake(s) and " + someone.getCupcakes() 
                + " cupcake(s) before exploding!");
    }
    
}
