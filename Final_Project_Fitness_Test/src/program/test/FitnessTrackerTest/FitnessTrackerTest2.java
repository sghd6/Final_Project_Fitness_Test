package program.test.FitnessTrackerTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import program.main.FitnessTracker.FitnessTracker;
import program.main.FitnessTracker.GoalType;

class FitnessTrackerTest2 {

	 private FitnessTracker tracker;

	    @Before
	    public void setUp() {
	        tracker = new FitnessTracker();
	        tracker.loadData(); // Load previous data, if any
	    }

	    @After
	    public void tearDown() {
	        tracker.saveData(); // Save data after tests
	    }

	    @Test
	    public void testSetAndGetGoal() {
	        // Test setting a new goal
	        Date deadline = new Date(System.currentTimeMillis() + 86400000); // Deadline one day from now
	        assertTrue("Goal should be set successfully", tracker.setFitnessGoal("Alice", FitnessTracker.GoalType.PUSHUPS, 100, deadline));

	        // Test retrieving goal status
	        String status = tracker.getGoalStatus("Alice", 1);
	        assertNotNull("Goal status should not be null", status);
	        assertTrue("Status should contain initial progress", status.contains("0.00%"));
	    }

	    @Test
	    public void testUpdateProgress() {
	        // Assuming the goal ID is 1 and it's already set for "Alice"
	        assertTrue("Progress should be updated successfully", tracker.updateProgress("Alice", 1, 50));

	        // Check updated status
	        String status = tracker.getGoalStatus("Alice", 1);
	        assertTrue("Status should reflect updated progress", status.contains("50.00%"));
	    }
//
	    @Test
	    public void testSaveAndLoad() {
	        tracker.loadData();  // Make sure this starts with a known clean state
	        int initialGoalsCount = tracker.getUserGoalsSize("Alice");
	        tracker.setFitnessGoal("Alice", GoalType.RUN, 10, new Date(System.currentTimeMillis() + 86400000));
	        tracker.setFitnessGoal("Alice", GoalType.PUSHUPS, 20, new Date(System.currentTimeMillis() + 86400000));
	        tracker.saveData();

	        // Reset or recreate tracker object to simulate a fresh load
	        tracker = new FitnessTracker();
	        tracker.loadData();
	        int postLoadGoalsCount = tracker.getUserGoalsSize("Alice");

	        assertEquals("Number of goals should increase by 2 after loading.", initialGoalsCount + 2, postLoadGoalsCount);
	    }


	    @Test
	    public void testSerializationIntegrity() {
	        String userName = "Bob";
	        int goalId = 1; // Assuming goal ID is 1 for simplicity
	        GoalType goalType = GoalType.PUSHUPS;
	        double initialProgress = 0;
	        double updatedProgress = 50; // Simulate updating the progress
	        Date deadline = new Date(System.currentTimeMillis() + 100000); // Set a future deadline

	        tracker.setFitnessGoal(userName, goalType, 100, deadline); // Target is 100 pushups
	        tracker.updateProgress(userName, goalId, updatedProgress);
	        tracker.saveData();

	        // Reload data to simulate application restart
	        tracker.loadData();
	        String status = tracker.getGoalStatus(userName, goalId);

	        assertTrue("Loaded goal status should contain expected progress", status.contains("50.00%"));
	    }

	}

