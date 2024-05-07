package program.main.ActivityTracker;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

import program.main.UserClasses.AbstractUser;

public class ActivityManager {
    static List<Activity> activities;

    public ActivityManager() {
        ActivityManager.activities = new ArrayList<>(); // Ensure this is not omitted or overwritten elsewhere
    }

    public void trackActivity(String activityType, double duration, double intensity) {
        Activity activity = new Activity(activityType, duration, intensity, LocalDateTime.now());
        activities.add(activity); // This should no longer cause a NullPointerException
    }
	
    public String generateSummary(LocalDate startDate) {
        LocalDate endDate = startDate.plusDays(7);
        List<Activity> filteredActivities = activities.stream().filter(activity -> !activity.dateTime().toLocalDate().isBefore(startDate) && activity.dateTime().toLocalDate().isBefore(endDate)).collect(Collectors.toList());

        StringBuilder summary = new StringBuilder();
        for (Activity activity : filteredActivities) {
            summary.append(activity.toString()).append("\n");  // Now uses formatted date
        }
        return summary.toString();
    }
    
     

    
}

