public class Main {
    public static void main(String[] args) {
        InputHandler userInput = new InputHandler();
        String courseName = userInput.getCourseName();
        GradeCalculator gradeCalculator = new GradeCalculator(courseName);

        int numberOfModules = userInput.getModuleCount();
        while (numberOfModules < 1 || numberOfModules > 20) {
            System.out.println("Invalid Input - Number of Modules must be between 1 and 20. Your input: " + numberOfModules);
            numberOfModules = userInput.getModuleCount();
        }

        for (int i = 0; i < numberOfModules; i++) {
            String moduleName = userInput.getModuleName(i+1);
            Module module = new Module(moduleName);

            int numberOfAssignments = userInput.getAssignmentCount(moduleName);
            while (numberOfAssignments < 1 || numberOfAssignments > 20) {
                System.out.println("Invalid Input - Number of Assignments must be between 1 and 20. Your input: '" + numberOfAssignments + "' in Module '"+moduleName+"'.");
                numberOfAssignments = userInput.getAssignmentCount(moduleName);
            }

            for (int j = 0; j < numberOfAssignments; j++) {
                String assignmentName = userInput.getAssignmentName(j+1, i+1);
                
                int assignmentWeight = userInput.getAssignmentWeight(assignmentName);
                while (assignmentWeight < 1 || assignmentWeight > 100) {
                    System.out.println("Invalid Input - Assignment Weight Percentage must be between 1 and 100. Your input: '" + assignmentWeight + "%' for Assignment '"+assignmentName+"' in Module '"+moduleName+"'.");
                    assignmentWeight = userInput.getAssignmentWeight(assignmentName);
                }

                int assignmentMark = userInput.getAssignmentMark(assignmentName);
                while ((assignmentMark != -1) && (assignmentMark < 1 || assignmentMark > 100)) {
                    System.out.println("Invalid Input - Assignment Mark Percentage must be between 1 and 100. Your input: '" + assignmentMark + "%' for Assignment '"+assignmentName+"' in Module '"+moduleName+"'.");
                    assignmentMark = userInput.getAssignmentMark(assignmentName);
                }

                Assignment assignment = (assignmentMark == -1)
                    ? new Assignment(assignmentName, assignmentWeight)
                    : new Assignment(assignmentName, assignmentWeight, assignmentMark);

                module.addAssignment(assignment);
            }

            gradeCalculator.addModule(module);
        }

        userInput.close();
        System.out.println("Predicted Grade: " + gradeCalculator.calculateDegreeGrade());

    }
}