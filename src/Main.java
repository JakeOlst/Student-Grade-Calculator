import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please provide the name of your course: ");
        String courseName = userInput.nextLine();
        GradeCalculator gradeCalculator = new GradeCalculator(courseName);

        System.out.print("\n"+"Please provide the number of modules: ");
        int numberOfModules = userInput.nextInt();

        for (int i = 0; i < numberOfModules; i++) {
            System.out.print("\nPlease enter the name of Module " + (i + 1) + ": ");
            userInput.nextLine(); // Consume leftover newline
            String moduleName = userInput.nextLine();
            Module module = new Module(moduleName);
        
            System.out.print("\nPlease enter the number of Assignments in Module " + moduleName + ": ");
            int numAssignments = userInput.nextInt();
            userInput.nextLine(); // Consume leftover newline
        
            for (int j = 0; j < numAssignments; j++) {
                System.out.print("\nPlease enter the name of Assignment " + (j + 1) + " of Module " + (i + 1) + ": ");
                String assignmentName = userInput.nextLine();
        
                System.out.print("\nPlease enter the Weight of Assignment " + assignmentName + ": ");
                int assignmentWeight = userInput.nextInt();
                userInput.nextLine(); // Consume leftover newline
        
                System.out.print("\nPlease enter your mark of Assignment " + assignmentName + " (-1 if not graded): ");
                int assignmentMark = userInput.nextInt();
                userInput.nextLine(); // Consume leftover newline
        
                Assignment assignment = (assignmentMark == -1)
                        ? new Assignment(assignmentName, assignmentWeight)
                        : new Assignment(assignmentName, assignmentWeight, assignmentMark);
        
                module.addAssignment(assignment);
            }
        
            gradeCalculator.addModule(module);
        }


        /* 
            Module programmingModule = new Module("Programming");
            Assignment programmingAssignmentOne = new Assignment("Assignment One",25,100);
            Assignment programmingAssignmentTwo = new Assignment("Assignment Two",25,55);
            Assignment programmingAssignmentThree = new Assignment("Assignment Three",25,21);
            Assignment programmingAssignmentFour = new Assignment("Assignment Four",25,88);

            programmingModule.addAssignment(programmingAssignmentOne);
            programmingModule.addAssignment(programmingAssignmentTwo);
            programmingModule.addAssignment(programmingAssignmentThree);
            programmingModule.addAssignment(programmingAssignmentFour);

            Module algorithmsModule = new Module("Algorithms");
            Assignment algorithmsAssignmentOne = new Assignment("Assignment One",50,89);
            Assignment algorithmsAssignmentTwo = new Assignment("Assignment Two",50,99);

            algorithmsModule.addAssignment(algorithmsAssignmentOne);
            algorithmsModule.addAssignment(algorithmsAssignmentTwo);

            Module mathematicsModule = new Module ("Computing Mathematics");
            Assignment mathematicsAssignmentOne = new Assignment("Assignment One",25,55);
            Assignment mathematicsAssignmentTwo = new Assignment("Assignment Two",25,43);
            Assignment mathematicsAssignmentThree = new Assignment("Assignment Three",25,88);
            Assignment mathematicsAssignmentFour = new Assignment("Assignment Four",25,12);

            mathematicsModule.addAssignment(mathematicsAssignmentOne);
            mathematicsModule.addAssignment(mathematicsAssignmentTwo);
            mathematicsModule.addAssignment(mathematicsAssignmentThree);
            mathematicsModule.addAssignment(mathematicsAssignmentFour);

            Module humanComputerInteractionModule = new Module("Human Computer Interaction");
            Assignment humanComputerInteractionAssignmentOne = new Assignment("Assignment Four",10,88);
            Assignment humanComputerInteractionAssignmentTwo = new Assignment("Assignment Four",10,77);
            Assignment humanComputerInteractionAssignmentThree = new Assignment("Assignment Four",30,66);
            Assignment humanComputerInteractionAssignmentFour = new Assignment("Assignment Four",10,98);
            Assignment humanComputerInteractionAssignmentFive = new Assignment("Assignment Four",10,34);
            Assignment humanComputerInteractionAssignmentSix = new Assignment("Assignment Four",30,100);

            humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentOne);
            humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentTwo);
            humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentThree);
            humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentFour);
            humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentFive);
            humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentSix);

            GradeCalculator gc = new GradeCalculator("Computer Science");
            gc.addModule(programmingModule);
            gc.addModule(algorithmsModule);
            gc.addModule(mathematicsModule);
            gc.addModule(humanComputerInteractionModule);
        */

        System.out.println("Predicted Grade: " + gradeCalculator.calculateDegreeGrade());

    }
}