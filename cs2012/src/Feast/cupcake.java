package Feast;


public class cupcake extends portion{
    private double volume;
    
    public cupcake(){
        volume = 0;
    }
    
    public cupcake(double radius, double height){
        super(Math.PI * Math.pow(radius, 2) * height * 4);
        volume = Math.PI * Math.pow(radius, 2) * height;
        
    }
    
    public double getVolume(){
        return volume;
    }
    
    @Override
    public String toString(){
        return("cupcake with volume " + volume + " cm3 and " 
                + this.getCalories() + " calories" );
    }
}
