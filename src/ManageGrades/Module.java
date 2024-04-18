package ManageGrades;

public class Module {
    private String moduleName;
    private String lecturer;
    private float grade;
public int numbers;
    public float getGrade() {
        return grade;
    }

    public Module(String moduleName, String lecturer, float grade) {
        this.moduleName = moduleName;
        this.lecturer = lecturer;
        this.grade = grade;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
