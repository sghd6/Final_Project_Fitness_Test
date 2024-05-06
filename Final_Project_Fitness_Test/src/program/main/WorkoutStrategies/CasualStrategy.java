package program.main.WorkoutStrategies;

import program.main.UserClasses.AbstractUser;

public class CasualStrategy implements IWorkoutStrategy{

	
	private final static double casualMultiplier = 0.5;
	
	
	@Override
	public boolean choosePlan(AbstractUser user) {
		if (user != null)
		{
			user.setTestValue(casualMultiplier);
			return true;
		}
		return false;
		
	}

}
