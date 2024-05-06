package program.main.Menu;

import program.main.Calculator.Calculator;
import program.main.UserClasses.Intermediate;
import program.main.WorkoutStrategies.CasualStrategy;
import program.main.UserClasses.AbstractUser;
import program.main.UserClasses.Athlete;
import program.main.UserClasses.Beginner;


public class Menu {
	
	public static void main(String[] args) {
	Intermediate Steve = new Intermediate("Steve",25,152.4,84.1);
	Beginner Dave = new Beginner("Dave",45,160,90);
	Athlete Tiger = new Athlete("Tiger",50,165,70);
	
	Tiger.setWorkoutStrategy(new CasualStrategy());
	
	Calculator c = new Calculator();
	
	System.out.println(Steve.getUserName());
	System.out.println(Steve.getAge());
	System.out.println(Steve.getWeight());
	System.out.println(Steve.getHeight());
	
	System.out.println(c.showBMI(Steve));
	
	System.out.println(Dave.getUserName());
	System.out.println(Dave.getAge());
	System.out.println(Dave.getWeight());
	System.out.println(Dave.getHeight());
	
	System.out.println(c.showBMI(Dave));
	
	
	System.out.println(Tiger.getUserName());
	System.out.println(Tiger.getAge());
	System.out.println(Tiger.getWeight());
	System.out.println(Tiger.getHeight());
	System.out.println(Tiger.toString());
	System.out.println(Tiger.getWorkoutStrategyy());
	
	System.out.println(c.showBMI(Tiger));
	System.out.println(Tiger.diplayUserProfileMetric());
	
	
	

}
}