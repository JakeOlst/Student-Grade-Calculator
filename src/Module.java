import java.util.ArrayList;
import java.util.List;

public class Module {
    protected String moduleName;
    protected List<Assignment> assignments;

    // constructors 

    Module(String moduleName) {
        this.moduleName = moduleName;
        this.assignments = new ArrayList<>();
    }

    Module(String moduleName, List<Assignment> assignments) {
        this.moduleName = moduleName;
        this.assignments = assignments;
    }

    // getters and setters

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<Assignment> getAssignments() {
        return this.assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    // functions

    public void addAssignment(Assignment assignment) {
        this.assignments.add(assignment);
    }

    public int getTotalWeight() { // get total weight (should be 100%)
        int totalWeight = 0;
        for (Assignment assignment : this.assignments) {
            totalWeight += assignment.getAssignmentWeight();
        }
        return totalWeight;
    }

    public double calculateModuleGrade() {
        if (this.getTotalWeight() != 100) {
            throw new IllegalStateException("Invalid total assignment weight. Total weight should add to 100%. Current total weight: " + this.getTotalWeight());
        } 
        double moduleScore = 0;
        for (Assignment assignment : this.assignments) {
            moduleScore += assignment.calculateAssignmentScore();
        }
        return moduleScore;
    }

    // implemented toString function for testing and validation.
    @Override
    public String toString() {
        String outputString = "Module '"+this.moduleName+"'";
        if (!this.assignments.isEmpty()) {
            outputString += (" has the following assignments:\n");
            for (Assignment assignment : this.assignments) {
                outputString += assignment.toString()+"\n";
            }
            return outputString;
        }
        else {
            return "No assignments logged for Module.";
        }
    }

}
