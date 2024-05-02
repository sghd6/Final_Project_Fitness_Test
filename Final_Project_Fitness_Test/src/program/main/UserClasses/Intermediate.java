package program.main.UserClasses;

import static org.junit.jupiter.api.Assertions.*;

import program.main.WorkoutStrategies.IWorkoutStrategy;

public class Intermediate extends AbstractUser{
	
	public Intermediate() {
		super();
	}
	
	public Intermediate(String name, int age, double height, double weight) {
		super(name, age, height, weight);
		System.out.println("Account was created");
		// TODO Auto-generated constructor stub
	}

	public Intermediate(String name, int age, double height, double weight, int pushupGoal, int situpGoal,
			int squatGoal, double runGoal) {
		super(name, age, height, weight, pushupGoal, situpGoal, squatGoal, runGoal);
		// TODO Auto-generated constructor stub
	}
	
	


}
