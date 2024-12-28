import java.util.ArrayList;
import java.util.List;

public class Module {
    protected String moduleName;
    protected List<Assignment> assignments;

    Module(String moduleName) {
        this.moduleName = moduleName;
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment assignment) {
        this.assignments.add(assignment);
    }

    public List<Assignment> getAssignments() {
        return this.assignments;
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
