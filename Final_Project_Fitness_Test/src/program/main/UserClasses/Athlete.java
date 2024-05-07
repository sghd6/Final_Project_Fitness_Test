package program.main.UserClasses;

public class Athlete extends AbstractUser{

	int jumpingjackGoal;
	int lungeGoal;
	int pullupGoal;
	int burpiesGoals;
	
	public Athlete() 
	{
		super();
	}
	

	public Athlete(String name, int age, double height, double weight) {
		super(name, age, height, weight);
		
		// TODO Auto-generated constructor stub
	}


	public Athlete(String name, int age, double height, double weight, int pushupGoal, int situpGoal, int squatGoal,
			double runGoal) {
		super(name, age, height, weight, pushupGoal, situpGoal, squatGoal, runGoal);
		// TODO Auto-generated constructor stub
	}


	
	
	

}
