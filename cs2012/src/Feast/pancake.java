package Feast;

public class pancake extends portion{
    private double radius;
    
    public pancake(){
        radius = 0;
    }
    
    public pancake(double rad){
        super(Math.PI * Math.pow(rad, 2) * 10);
        radius = rad;
    }
    
    public double getRadius(){
        return radius;
    }
    
    @Override
    public String toString(){
        return("pancake with radius " + radius + "cm and " + this.getCalories() 
                + " calories");
    }
    
}