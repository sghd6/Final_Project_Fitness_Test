package program.main.DailyTips;

public class DailyTips {
	
    public void displayDailyTip() {
    	
    	//Create an array to store tips in
        String[] tips = {"Make sure to drink at least 8 glassses of water a day!", "Protect you skin by applying sunscreen, even on couldy days!",
        				 "Schedule regular checkups wtih you healthcare provider to monitor your health and prevent illnesses!",
        				 "Getting 7-9 hours of sleep every night helps your body recover!", "Just a few minutes of meditation and deep breathing can help reduce stress and imrove mental clarity!",
        				 "Make sure to frequently stand up and stretch when sitting for long periods of time. Doing so helps avoid strain and promotes blood circulation",
        				 "Limiting time spent on electronic devices before bed can help improve the quality of your sleep!", "A nutrious breakfast can jumpstart your metabolism and provides your body with the energy needed throughout the day."};
        
        //Calculate a random index to select from the tips
        int index = (int) (Math.random() * tips.length);
        
        //Display the selected daily tip
        System.out.println("Daily Tip: " + tips[index]);
    }
    
}

