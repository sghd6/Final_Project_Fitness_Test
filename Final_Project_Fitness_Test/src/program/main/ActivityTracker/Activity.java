package program.main.ActivityTracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	
	public String getFormattedDateTime() {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
	
	public String toString() {
        return "activityType='" + activityType + '\'' +
                ", duration=" + String.format("%.2f hours", duration) +
                ", intensity=" + intensity +
                ", dateTime=" + dateTime;
    }

	public void add(Activity activity) {
		// TODO Auto-generated method stub
		
	}
	
}
