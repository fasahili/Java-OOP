import java.util.ArrayList;
import java.util.List;

public class Course {

    private int code;
    private String title;
    private String instructor;
    private int maxCapacity;
    private List <Student> enrolledStudents;

    public Course(int code, String title, String instructor, int maxCapacity) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
    public void removeStudent(Student student){
        enrolledStudents.remove(student);
    }
}
