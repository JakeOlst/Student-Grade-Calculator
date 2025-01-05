import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    public Scanner userInput;

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
        System.out.print("Please provide the number of modules: ");
        int numberOfModules = userInput.nextInt();
        userInput.nextLine();
        return numberOfModules;
    }

    /* Assignment Handling */

    public String getAssignmentName(int assignmentNumber, int moduleNumber) {
        System.out.print("Please enter the name of Assignment " + assignmentNumber + " of Module " + moduleNumber + ": ");
        return userInput.nextLine();
    }

    public int getAssignmentWeight(String assignmentName) {
        System.out.print("Please enter the Weight of Assignment " + assignmentName + ": ");
        return userInput.nextInt();
    }

    public int getAssignmentMark(String assignmentName) {
        System.out.print("Please enter the Mark of Assignment " + assignmentName + ": ");
        return userInput.nextInt();
    }

    public int getAssignmentCount(String moduleName) {
        System.out.print("Please enter the number of Assignments in Module " + moduleName + ": ");
        return userInput.nextInt();
    }

    /* Helper Functions */

    public void close() {
        if (this.userInput != null) {
            this.userInput.close();
        }
    }
}
