package program.main;

//Imports
import program.main.DailyTips.DailyTips;
import program.main.UserClasses.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! Welcome to Fitness Test!");
        //Call for and display one of the daily tips
        DailyTips dailyTips = new DailyTips();
        dailyTips.displayDailyTip();

        System.out.println("Total Water Intake: " + Beginner.getWaterIntake());
        System.out.println("Total Water Intake: " + Athlete.getWaterIntake());
        System.out.println("Total Water Intake: " + Intermediate.getWaterIntake());


        System.out.println("Please choose one of the following options:");

        System.out.println("1. Create a new user");
        System.out.println("2. Read existing user");
        try {
            int option = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        if (option == 1) {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            System.out.println("Please enter your age:");
            int age = scanner.nextInt();
            System.out.println("Please enter your height in inches:");
            double height = scanner.nextDouble();
            System.out.println("Please enter your weight in pounds:");
            double weight = scanner.nextDouble();
            system.out.println("Please enter your level of experience:");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Athlete");
            try {
                int experience = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
            if (experience == 1) {
                Beginner user = new Beginner(name, age, height, weight);
            } else if (experience == 2) {
                Intermediate user = new Intermediate(name, age, height, weight);
            } else if (experience == 3) {
                Athlete user = new Athlete(name, age, height, weight);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
            }
            else if (option == 2) {
                system.out.println("Please enter the file");
                try {
                    system.out.println("Please enter the file path:");
                    String filePath = scanner.nextLine();
                    Scanner fileIn = new Scanner(new FileInputStream(filePath));
                    String name = fileIn.nextLine();
                    int age = fileIn.nextInt();
                    double height = fileIn.nextDouble();
                    double weight = fileIn.nextDouble();

                } catch (FileNotFoundException e) {
                    System.out.println("File not found. Please enter a valid file path.");
                }
            }
            else {
                System.out.println("Invalid input. Please enter a number between 1 and 2.");
            }
        }
    }

}
