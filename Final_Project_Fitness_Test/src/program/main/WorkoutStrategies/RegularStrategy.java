package program.main.WorkoutStrategies;

import program.main.UserClasses.AbstractUser;

public class RegularStrategy implements IWorkoutStrategy{

	
	private final static double regularMultiplier = 1;
	
	@Override
	public boolean choosePlan(AbstractUser user) {
		if (user != null)
		{
			user.setTestValue(regularMultiplier);
			//user.setPushupGoal(user.getPushupGoal()*intenseMultiplier);
			return true;
		}
		return false;
		
	}
}
