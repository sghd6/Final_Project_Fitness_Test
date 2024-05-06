package program.main.ActivityTracker;

import program.main.UserClasses.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActivityManager {
	
	private static List<Activity> activities;
	
	public ActivityManager() {
		ActivityManager.activities = new ArrayList<>();
	}
	
	public void trackActivity(String activityType, double duration, double intensity) {
		Activity activity = new Activity(activityType, duration, intensity, LocalDateTime.now());
		activity.add(activity);
	}
	
	// Calculate the number of calories burned
	public double calculateCaloriesBurned() {
		double totalCalories = 0;
		for (Activity activity : activities) {
			totalCalories += 8 * AbstractUser.getWeight() * activity.getDuration();
		}
		return totalCalories;
	}
	
	public static String weeklySummary(LocalDate startDate) {
        LocalDate endDate = startDate.plusDays(7);
        List<Activity> filteredActivities = activities.stream().filter(activity -> activity.dateTime().toLocalDate().compareTo(startDate) >= 0 && activity.dateTime().toLocalDate().compareTo(endDate) < 0).collect(Collectors.toList());

        StringBuilder summary = new StringBuilder();
        for (Activity activity : filteredActivities) {
            summary.append(activity.toString()).append("\n");
        }
        return summary.toString();
    
	
}
}
