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
}
