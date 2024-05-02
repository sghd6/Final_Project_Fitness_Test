package program.main.UserClasses;

import java.text.DecimalFormat;

import program.main.WorkoutStrategies.IWorkoutStrategy;

public abstract class AbstractUser {
	protected String userName;
	protected int age;
	protected double weight;
	protected double height;
	protected int pushupGoal;
	protected int situpGoal;
	protected int squatGoal;
	protected double runGoal;
	protected IWorkoutStrategy workoutStrategy;
	
	private static final DecimalFormat df = new DecimalFormat("#.##");
	
	
	
	///Simple helper methods
	public AbstractUser() {
		
	}
	
	/////Baseline Instantiator
	public AbstractUser(String name, int age, double height, double weight)
	{
		this.userName = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	/////Complete Instantiator (Used for testing)
	
	public AbstractUser(String name, int age, double height, double weight, int pushupGoal, int situpGoal, int squatGoal, double runGoal)
	{
		this.userName = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.pushupGoal = pushupGoal;
		this.situpGoal = situpGoal;
		this.squatGoal = squatGoal;
		this.runGoal = runGoal;
		
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
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
	
	public IWorkoutStrategy getWorkoutStrategyy() {
		return workoutStrategy;
	}

	public void setWorkoutStrategy(IWorkoutStrategy workoutStrategy) {
		this.workoutStrategy = workoutStrategy;
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
	
	public String toString()
	{
		return "User [name= " + userName + ", age= "+ age + ",height= " + height + ",weight= " + weight +"]";
	}
	
	
	

}
