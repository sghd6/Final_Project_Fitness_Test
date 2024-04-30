package program.main.UserClasses;

import java.text.DecimalFormat;

import program.main.WorkoutStrategies.IWorkoutStrategy;

public abstract class AbstractUser {
	protected String userName;
	protected double weight;
	protected double height;
	protected int age;
	protected int pushupGoal;
	protected int situpGoal;
	protected int squatGoal;
	protected double runGoal;
	protected IWorkoutStrategy workoutStrategy;
	
	private static final DecimalFormat df = new DecimalFormat("#.##");
	
	
	
	///Simple helper methods
	public AbstractUser() {
		
	}
	
	public AbstractUser(String name, int age)
	{
		name = this.userName;
		age = this.age;
	}
	
	
	public IWorkoutStrategy getWorkoutStrategyy() {
		return workoutStrategy;
	}

	public void setCookingStrategy(IWorkoutStrategy cookingStrategy) {
		this.workoutStrategy = cookingStrategy;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getPushupGoal() {
		return pushupGoal;
	}
	public void setPushupGoal(int pushupGoal) {
		this.pushupGoal = pushupGoal;
	}
	
	public int getSitupGoal() {
		return situpGoal;
	}
	
	public void setSitupGoal(int situpGoal) {
		this.situpGoal = situpGoal;
	}
	
	public int getSquatGoal() {
		return squatGoal;
	}
	
	public void setSquatGoal(int squatGoal) {
		this.squatGoal = squatGoal;
	}
	
	public double getRunGoal() {
		return runGoal;
	}
	
	public void setRunGoal(double runGoal) {
		this.runGoal = runGoal;
	}
	
	
	////Calculation/Conversion Methods
	

	
	public void setHeightInchToCentimeter(double inches)
	{
		double centimeter = inches * 2.54;
		this.height = centimeter;
	}
	
	
	public void setHeightCentimeterToInch(double centimeter)
	{
		double inch = centimeter / 2.54;
		this.height = inch;
	}
	
	public void setWeightPoundtoKilogram(double pound)
	{
		double kilogram = pound / 2.2046226218;
		this.weight = kilogram;
	}
	
	public void setWeightKilogramtoPound(double kilogram)
	{
		double pound = kilogram / 0.45359237;
		this.weight = kilogram;
	}
	
	
	
	
	

}
