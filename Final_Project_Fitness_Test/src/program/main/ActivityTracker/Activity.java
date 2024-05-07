package program.main.ActivityTracker;

import java.time.LocalDateTime;

public class Activity {

	private String activityType;
	private double duration;
	private double intensity;
	private LocalDateTime dateTime;
	
	public Activity(String activityType, double duration, double intensity, LocalDateTime dateTime) {
		this.activityType = activityType;
		this.duration = duration;
		this.intensity = intensity;
		this.dateTime = dateTime;
	}
	
	public String getActivityType() {
		return activityType;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public double getIntensity() {
		return intensity;
	}
	
	public LocalDateTime dateTime() {
		return dateTime;
	}

	public void add(Activity activity) {
		// TODO Auto-generated method stub
		
	}
	
}
