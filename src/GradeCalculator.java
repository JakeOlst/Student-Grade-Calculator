import java.util.ArrayList;
import java.util.List;

class GradeCalculator {
    private String degreeName;
    private List<Module> modules;

    // constructors

    GradeCalculator(String degreeName) {
        this.degreeName = degreeName;
        this.modules = new ArrayList<>();
    }

    GradeCalculator(String degreeName, List<Module> modules) {
        this.degreeName = degreeName;
        this.modules = modules;
    }

    // getters and setters

    public String getDegreeName() {
        return this.degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public List<Module> getModules() {
        return this.modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    // functions

    public void addModule(Module module) {
        this.modules.add(module);
    }

    public double calculateDegreeGrade() {
        double totalWeightedScore = 0;
        int totalWeight = 0;
    
        for (Module module : this.modules) {
            double moduleGrade = module.calculateModuleGrade();
            if (moduleGrade == -1) {
                continue;
            }
            totalWeightedScore += moduleGrade * module.getTotalWeight();  // Correctly accumulate the weighted score
            totalWeight += module.getTotalWeight();  // Accumulate the total weight
        }
    
        if (totalWeight == 0) {
            return 0;  // Avoid division by zero in case of no modules or incomplete grades
        }
    
        return totalWeightedScore / totalWeight;
    }

}