public class Assignment {
    protected String assignmentName;
    protected int assignmentWeight;
    protected int assignmentMark;
    protected boolean isCompleted;

    Assignment(String assignmentName, int assignmentWeight, int assignmentMark) {
        this.assignmentName = assignmentName;
        this.assignmentWeight = assignmentWeight;
        this.assignmentMark = assignmentMark;
        this.isCompleted = true;
    }

    Assignment(String assignmentName, int assignmentWeight) {
        this.assignmentName = assignmentName;
        this.assignmentWeight = assignmentWeight;
        this.assignmentMark = 0;
        this.isCompleted = false;
    }

    // implemented toString function for testing and validation.
    @Override
    public String toString() {
        String outputString = ("Assignment '"+this.assignmentName+"' has the weight "+this.assignmentWeight+"%");
        if (this.isCompleted) {
            outputString += (" and received the mark "+this.assignmentMark);
        } else {
            outputString += (" and has not yet been marked.");
        }
        return outputString;
    }
}
