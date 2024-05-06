package program.main.Calculator;

import java.text.DecimalFormat;

import program.main.UserClasses.AbstractUser;

public class Calculator {
///The Calculator class performs optional calculations on classes, using a Single Responsibility approach to more advanced class-based calculations.
	
	
//Default Constructor
	public Calculator() 
	{
	}
//BMI Display for User
	public String bmiRanking(AbstractUser user)
	{
		double bmi = showBMI(user);
		
		if(bmi <= 18)
		{
			return "Your bmi is within in the underweight range";
		}
		else if(bmi >= 19 && bmi <= 24)
		{
			return "Your bmi is within the healthy/normal range";
		}
		else if(bmi >= 25 && bmi <=29)
		{
			return "Your bmi is within the overweight range";
		}
		else if(bmi >= 30 && bmi <= 39)
		{
			return "Your bmi is within the obese range";
		}
		else if(bmi >= 40 && bmi <= 56)
		{
			return "Your bmi is within the extremely obese range";
		}
		else
			return "An invalid bmi has been entered. Please try again.";
	}
	
//BMI Calculation for User
	public int showBMI(AbstractUser user)
	{
		double bmi = user.getWeight()/(user.getHeight()*user.getHeight());

		int val = (int)Math.floor(bmi*10000);
		return val;
	
	}
	
	
	///This converts Imperial units into Metric Units for input and calculations
			public void MetricImperialHeightConverter(AbstractUser user, int heightValue, int weightValue) 
			{
				
					double centimeter = heightValue * 2.54;
					user.setHeight(centimeter);
					
					double kilogram = heightValue / 2.2046226218;
					user.setWeight(kilogram);
				
			}
	

}
