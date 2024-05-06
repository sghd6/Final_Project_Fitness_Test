package program.main.UserClasses;

public class Intermediate extends AbstractUser{


	int jumpingjackGoal;
	int lungeGoal;

	
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

	@Override
	public void displayProfileInfo() {
		// TODO Auto-generated method stub
		
	}
	
	


}
