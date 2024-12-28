import java.util.ArrayList;
import java.util.List;

class GradeCalculator {
    protected String degreeName;
    protected List<Module> modules;

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

    public void setAssignments(List<Module> modules) {
        this.modules = modules;
    }

    // functions

}