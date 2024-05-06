package program.main.WorkoutStrategies;

import program.main.UserClasses.AbstractUser;

public class IntenseStrategy implements IWorkoutStrategy{

	
	private final static int intenseMultiplier = 2;
	
	@Override
	public boolean choosePlan(AbstractUser user) {
		if (user != null)
		{
			user.setTestValue(intenseMultiplier);
			//user.setPushupGoal(user.getPushupGoal()*intenseMultiplier);
			return true;
		}
		return false;
		
	}

