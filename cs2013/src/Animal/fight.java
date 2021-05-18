package Animal;
import java.util.Random;
public class fight {
	public static void main(String[] args) {
		Random random = new Random();
		
		DuckSizedHorse daffy = new DuckSizedHorse(1.0, 0.1, 1.0, "daffy");
		HorseSizedDuck horsy = new HorseSizedDuck(1.0, 1.0, 0.1, "horsy");
		
		System.out.println(horsy.toString());
		System.out.println(daffy.toString());
		
		System.out.println("Fight begins with wind level " + horsy.getAccuracy()
							+ " and rain level " + daffy.getPower());
		
		while(daffy.isAlive() && horsy.isAlive()) {
			daffy.receiveInjury(horsy.getPower());
			daffy.attack(horsy);
			
			horsy.receiveInjury(daffy.getPower());
			horsy.attack(daffy);
		}
		if(horsy.isAlive()) {
			System.out.println("Horsy wins! \nDaffy dies!");
		}
		else
			System.out.println("Daffy wins! \nHorsy dies!");
		
	}
}
