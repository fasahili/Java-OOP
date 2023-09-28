import java.util.ArrayList;
import java.util.List;

public class Report {
    protected List<Course> courses ;
    protected List<Student> students ;

    public Report() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public void  reportOfCoursesAvailable(){
        System.out.println("All available courses in the university :-");
        for (Course course :courses) {
            System.out.println("- "+course.getTitle());
        }
    }
    private void printCoursesFromStudent(int id){
        Student student = getStudentById(id);
        List<Course> listOfCourse = student.getEnrolledCourses();
        System.out.print("Courses Enrolled by (" + student.getName()+") : ");
        for (Course course : listOfCourse) {
            System.out.print(" - " + course.getTitle());
        }System.out.println(" -");
    }
    private void printCoursesFromStudentWithValidate(int id) {
        Student student = getStudentById(id);
        List<Course> listOfCourse = student.getEnrolledCourses();
        if(!listOfCourse.isEmpty()){
            printCoursesFromStudent(id);
        } else{
            System.out.println("No courses added for (" + student.getName()+")") ;
        }

    }
    public void  reportOfStudent(int id){
        Student student = getStudentById(id);
        if (!(student == null)) {
            printCoursesFromStudentWithValidate(id);
        }else{
            System.out.println("Student not found");
        }
    }
    private void printStudentOfCourse(int code){
    Course course = getCourseByCode(code);
    List<Student> studentList = course.getEnrolledStudents();
    System.out.print("Student Enrolled by (" + course.getTitle()+") : ");
    for (Student student : studentList) {
        System.out.print(" - " + student.getName());
    }System.out.println(" -");
}
    private void printStudentFromCoursesWithValidate(int code) {
        Course course = getCourseByCode(code);
        List<Student> studentList = course.getEnrolledStudents();
        if(!studentList.isEmpty()){
            printStudentOfCourse(code);
        } else{
            System.out.println("No Student in this Course (" + course.getTitle()+")") ;
        }
    }
    public void reportOfCourses(int code){
        Course course = getCourseByCode(code);
        if (!(course == null)) {
          printStudentFromCoursesWithValidate(code);
        }else{
            System.out.println("Course not found");
        }
    }
    public void generalReport(int id,int code){
        System.out.println("General Report .....");
        System.out.println();
        reportOfCoursesAvailable();
        reportOfStudent(id);
        reportOfCourses(code);
    }
    protected Student getStudentById(int studentId){
        for (Student student:students){
            if(student.getId()==studentId){
                return student;
            }
        }
        return null;
    }
    protected Course getCourseByCode(int courseCode){
        for (Course course:courses){
            if (course.getCode()==courseCode){
                return course;
            }
        }
        return null;
    }
}

