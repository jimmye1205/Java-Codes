package Feast;

public abstract class portion {
    private double calories;
    
    protected portion(){
        calories = 0;
    }
    
    protected portion(double cal){
        calories = cal;
    }
    
    public double getCalories(){
        return calories;
    }
}
