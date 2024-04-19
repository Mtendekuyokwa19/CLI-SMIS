package ManageGrades;

public class Module {
    private String moduleName;
    private String lecturer;
    private float grade;
public int numbers;
    public float getGrade() {
        return grade;
    }

    public Module(String moduleName, String lecturer) {
        this.moduleName = moduleName;
        this.lecturer = lecturer;
        this.grade = 0;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
