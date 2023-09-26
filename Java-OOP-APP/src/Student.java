import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private String email;
    private List<Course> enrolledCourses;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public void enrolledAtCourse(Course course){
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void dropCourse(Course course){
        enrolledCourses.remove(course);
        course.removeStudent(this);
    }

    public void printCourse(){
        for (Course enrolledCourse : enrolledCourses) {
            System.out.println(enrolledCourse.getTitle());
        }

    }
}
