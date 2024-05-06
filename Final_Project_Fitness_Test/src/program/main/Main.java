package program.main;

import java.io.*;
import java.util.*;
import program.main.FitnessTracker.GoalType;
import program.main.FitnessTracker.FitnessTracker;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static FitnessTracker tracker = new FitnessTracker();

    public static void main(String[] args) {
        tracker.loadData(); // Load any previously saved user goals
        System.out.println("Hi! Welcome to the Fitness Test!");

        boolean runApplication = true;
        while (runApplication) {
            System.out.println("\nPlease choose one of the following options:");
            System.out.println("1. Login/Create User and Manage Goals");
            System.out.println("2. Exit");

            int mainOption = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (mainOption) {
                case 1:
                    manageUser();
                    break;
                case 2:
                    runApplication = false;
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1 or 2.");
            }
        }

        scanner.close();
    }

    private static void manageUser() {
        System.out.println("Enter your username:");
        String userName = scanner.nextLine();
        System.out.println("Does your user account exist? (yes/no)");
        String existingUser = scanner.nextLine().trim().toLowerCase();
        
        if (existingUser.equals("no")) {
            createUser(userName); // Create user and log in automatically
        }
        manageGoals(userName); // Proceed to manage goals whether new or existing user
    }

    private static void createUser(String userName) {
        System.out.println("New user created: " + userName);
    }

    private static void manageGoals(String userName) {
        while (true) {
            System.out.println("Welcome, " + userName + "! Select an option:");
            System.out.println("1. Create a new goal");
            System.out.println("2. View my goals");
            System.out.println("3. Update a goal");
            System.out.println("4. Return to main menu");

            int userChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (userChoice) {
                case 1:
                    createGoal(userName);
                    break;
                case 2:
                    viewGoals(userName);
                    break;
                case 3:
                    updateGoal(userName);
                    break;
                case 4:
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid option. Please select 1, 2, 3, or 4.");
            }
        }
    }

    private static void createGoal(String userName) {
        System.out.println("Enter the type of goal (PUSHUPS, PULLUPS, SQUATS, RUN):");
        String goalTypeInput = scanner.nextLine().toUpperCase();
        program.main.FitnessTracker.FitnessTracker.GoalType goalType = FitnessTracker.GoalType.valueOf(goalTypeInput.toUpperCase());

        System.out.println("Enter the target value (e.g., 50 pushups):");
        double targetValue = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the number of days until the deadline:");
        int daysUntilDeadline = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Date deadline = new Date(System.currentTimeMillis() + daysUntilDeadline * 86400000L);

        // Correct method call
        boolean result = tracker.setFitnessGoal(userName, goalType, targetValue, deadline);
        if (result) {
            System.out.println("Goal successfully created!");
        } else {
            System.out.println("Failed to create goal. Please check your inputs and try again.");
        }

        tracker.saveData();
    }

    private static void viewGoals(String userName) {
        System.out.println("Your goals:");
        int goalsCount = tracker.getUserGoalsSize(userName);
        if (goalsCount == 0) {
            System.out.println("No goals set. Use the option to create a goal.");
        } else {
            for (int i = 1; i <= goalsCount; i++) {
                String status = tracker.getGoalStatus(userName, i);
                System.out.println(status);
            }
        }
    }

    private static void updateGoal(String userName) {
        System.out.println("Select a goal to update. Here are your current goals:");
        viewGoals(userName);
        System.out.println("Enter the goal ID you want to update:");
        int goalId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the new current value for this goal:");
        double currentValue = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        boolean result = tracker.updateProgress(userName, goalId, currentValue);
        if (result) {
            System.out.println("Goal updated successfully!");
        } else {
            System.out.println("Failed to update goal. Please check the goal ID and try again.");
        }

        tracker.saveData();
    }
}
