public class Main {
    public static void main(String[] args) {
        Module programmingModule = new Module("Programming");
        Assignment programmingAssignmentOne = new Assignment("Assignment One",25);
        Assignment programmingAssignmentTwo = new Assignment("Assignment Two",25);
        Assignment programmingAssignmentThree = new Assignment("Assignment Three",25);
        Assignment programmingAssignmentFour = new Assignment("Assignment Four",25);

        programmingModule.addAssignment(programmingAssignmentOne);
        programmingModule.addAssignment(programmingAssignmentTwo);
        programmingModule.addAssignment(programmingAssignmentThree);
        programmingModule.addAssignment(programmingAssignmentFour);

        Module algorithmsModule = new Module("Algorithms");
        Assignment algorithmsAssignmentOne = new Assignment("Assignment One",50);
        Assignment algorithmsAssignmentTwo = new Assignment("Assignment Two",50);

        algorithmsModule.addAssignment(algorithmsAssignmentOne);
        algorithmsModule.addAssignment(algorithmsAssignmentTwo);

        Module mathematicsModule = new Module ("Computing Mathematics");
        Assignment mathematicsAssignmentOne = new Assignment("Assignment One",25);
        Assignment mathematicsAssignmentTwo = new Assignment("Assignment Two",25);
        Assignment mathematicsAssignmentThree = new Assignment("Assignment Three",25);
        Assignment mathematicsAssignmentFour = new Assignment("Assignment Four",25);

        mathematicsModule.addAssignment(mathematicsAssignmentOne);
        mathematicsModule.addAssignment(mathematicsAssignmentTwo);
        mathematicsModule.addAssignment(mathematicsAssignmentThree);
        mathematicsModule.addAssignment(mathematicsAssignmentFour);

        Module humanComputerInteractionModule = new Module("Human Computer Interaction");
        Assignment humanComputerInteractionAssignmentOne = new Assignment("Assignment Four",10);
        Assignment humanComputerInteractionAssignmentTwo = new Assignment("Assignment Four",10);
        Assignment humanComputerInteractionAssignmentThree = new Assignment("Assignment Four",30);
        Assignment humanComputerInteractionAssignmentFour = new Assignment("Assignment Four",10);
        Assignment humanComputerInteractionAssignmentFive = new Assignment("Assignment Four",10);
        Assignment humanComputerInteractionAssignmentSix = new Assignment("Assignment Four",30);

        humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentOne);
        humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentTwo);
        humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentThree);
        humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentFour);
        humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentFive);
        humanComputerInteractionModule.addAssignment(humanComputerInteractionAssignmentSix);

        System.out.println(programmingModule);
        System.out.println(algorithmsModule);
        System.out.println(mathematicsModule);
        System.out.println(humanComputerInteractionModule);

    }
}