public class Main {
    public static void main(String[] args) {
        InputHandler userInput = new InputHandler();
        String courseName = userInput.getCourseName();
        GradeCalculator gradeCalculator = new GradeCalculator(courseName);

        int numberOfModules = userInput.getModuleCount();

        for (int i = 0; i < numberOfModules; i++) {
            String moduleName = userInput.getModuleName(i+1);
            Module module = new Module(moduleName);

            boolean validModuleWeight = false;
            while (!validModuleWeight) {
                int numberOfAssignments = userInput.getAssignmentCount(moduleName);
                module.getAssignments().clear();

                for (int j = 0; j < numberOfAssignments; j++) {
                    String assignmentName = userInput.getAssignmentName(j+1, i+1);
                    int assignmentWeight = userInput.getAssignmentWeight(assignmentName);
                    int assignmentMark = userInput.getAssignmentMark(assignmentName);
    
                    Assignment assignment = (assignmentMark == -1)
                        ? new Assignment(assignmentName, assignmentWeight)
                        : new Assignment(assignmentName, assignmentWeight, assignmentMark);
    
                    module.addAssignment(assignment);
                }

                try {
                    module.validateTotalWeight();
                    validModuleWeight = true;
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage()); 
                }
            }

            gradeCalculator.addModule(module);
        }

        userInput.close();
        System.out.println("Predicted Grade: " + gradeCalculator.calculateDegreeGrade());

    }
}