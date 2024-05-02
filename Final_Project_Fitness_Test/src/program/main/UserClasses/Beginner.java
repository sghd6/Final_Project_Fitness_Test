package program.main.UserClasses;

import static org.junit.jupiter.api.Assertions.*;

import program.main.WorkoutStrategies.IWorkoutStrategy;


public class Beginner extends AbstractUser {
	
	public Beginner() {
		super();
	}

	

	public Beginner(String name, int age, double height, double weight) {
		super(name, age, height, weight);
		// TODO Auto-generated constructor stub
	}
	
	public Beginner(String name, int age, double height, double weight, int pushupGoal, int situpGoal, int squatGoal,
			double runGoal) {
		super(name, age, height, weight, pushupGoal, situpGoal, squatGoal, runGoal);
		// TODO Auto-generated constructor stub
	}

}
