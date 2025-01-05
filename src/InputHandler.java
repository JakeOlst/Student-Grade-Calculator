import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private Scanner userInput;

    public InputHandler() {
        this.userInput = new Scanner(System.in);
    }

    /* Getters and Setters */

    public Scanner getUserInput() {
        return this.userInput;
    }

    public void setUserInput(Scanner userInput) {
        this.userInput = userInput;
    }

    /* Course Handling */

    public String getCourseName() {
        System.out.print("Please provide the name of your course: ");
        String courseName = this.userInput.nextLine();
        return courseName;
    }

    /* Module Handling */

    public String getModuleName(int moduleNumber) {
        System.out.print("Please enter the name of Module " + moduleNumber + ": ");
        String moduleName = this.userInput.nextLine();
        return moduleName;
    }

    public int getModuleCount() {
        String prompt = "Please provide the number of modules: ";
        return getValidatedInput(prompt, 1, 20);
    }

    /* Assignment Handling */

    public String getAssignmentName(int assignmentNumber, int moduleNumber) {
        System.out.print("Please enter the name of Assignment " + assignmentNumber + " of Module " + moduleNumber + ": ");
        return userInput.nextLine();
    }

    public int getAssignmentWeight(String assignmentName) {
        String prompt = "Please enter the Weight of Assignment " + assignmentName + ": ";
        return getValidatedInput(prompt, 1, 100);
    }

    public int getAssignmentMark(String assignmentName) {
        String prompt = "Please enter the Mark of Assignment " + assignmentName + ": ";
        return getValidatedInput(prompt, 1, 100);
    }

    public int getAssignmentCount(String moduleName) {
        String prompt = "Please enter the number of Assignments in Module " + moduleName + ": ";
        return getValidatedInput(prompt, 1, 20);
    }

    /* Helper Functions */

    public int getValidatedInput(String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            try {
                input = userInput.nextInt();
                userInput.nextLine();
                if (input >= min && input <= max) {
                    return input; 
                } else {
                    System.out.println("Invalid Input - Please enter a number between " + min + " and " + max + ". You entered: " + input);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input - Please enter a valid integer.");
                userInput.nextLine();
            }
        }
    }

    public void close() {
        if (this.userInput != null) {
            this.userInput.close();
        }
    }
}
