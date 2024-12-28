public class Assignment {
    protected String assignmentName;
    protected int assignmentWeight;
    protected int assignmentMark;
    protected boolean isCompleted;

    // constructors for marked and unmarked assignments

    Assignment(String assignmentName, int assignmentWeight, int assignmentMark) {
        this.assignmentName = assignmentName;
        this.assignmentWeight = assignmentWeight;
        this.assignmentMark = assignmentMark;
        this.isCompleted = true;
    }

    Assignment(String assignmentName, int assignmentWeight) {
        this.assignmentName = assignmentName;
        this.assignmentWeight = assignmentWeight;
        this.assignmentMark = -1;
        this.isCompleted = false;
    }

    // getters and setters

    public String getAssignmentName() {
        return this.assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getAssignmentMark() {
        return this.assignmentMark;
    }

    public void setAssignmentMark(int assignmentMark) {
        this.assignmentMark = assignmentMark;
        if (assignmentMark != -1) {
            isCompleted = true;
        } else {
            isCompleted = false;
        }
    }

    public int getAssignmentWeight() {
        return this.assignmentWeight;
    }

    public void setAssignmentWeight(int assignmentWeight) {
        this.assignmentWeight = assignmentWeight;
    }

    // functions

    public double calculateAssignmentScore() {
        if (this.assignmentMark == -1) {
            return -1; 
        } else {
            return ((double) assignmentMark / 100 * assignmentWeight);
        } 
    }

    // implemented toString function for testing and validation.
    @Override
    public String toString() {
        String outputString = ("Assignment '" + this.assignmentName + "' has the weight " + this.assignmentWeight
                + "%");
        if (this.isCompleted) {
            outputString += (" and received the mark " + this.assignmentMark);
        } else {
            outputString += (" and has not yet been marked.");
        }
        return outputString;
    }
}
