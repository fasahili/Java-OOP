import java.util.ArrayList;
import java.util.List;

public class University {
    public University() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    private final List<Course> courses;
    private final List<Student> students;


    public void addStudent(int id,String name,String email){
        Student student = new Student(id,name,email);
        students.add(student);
    }
    public void addCourse(int code,String title,String instructor,int maxCapacity){
        Course course = new Course(code,title,instructor,maxCapacity);
        courses.add(course);
    }

    public void enrollStuInCourse(int id,int code)
    {
        Student student = getStudentById(id);
        Course  course  = getCourseByCode(code);
        if(validateStu(id, code) ){
            if(checkCapacityCourse(id, code)) {
                student.enrolledAtCourse(course);
            }
        }
    }

    private boolean checkCapacityCourse(int id,int code) {
        Student student = getStudentById(id);
        Course  course  = getCourseByCode(code);

       return(course.getEnrolledStudents().size() < course.getMaxCapacity()) ;

    }

    private boolean validateStu(int id,int code) {
        Student student = getStudentById(id);
        Course course = getCourseByCode(code);

        return student != null && course != null;
    }

    public void  dropStuFromCourse(int id,int code){
        Student student = getStudentById(id);
        Course course = getCourseByCode(code);

        if ( validateStu(id,code) ){
            student.dropCourse(course);
        }

    }
    public void  generateReports(){

    }

    public Student getStudentById(int studentId){
        for (Student student:students){
            if(student.getId()==studentId){
                return student;
            }
        }
        return null;
    }

    public Course getCourseByCode(int courseCode){
        for (Course course:courses){
            if (course.getCode()==courseCode){
                return course;
            }
        }
        return null;
    }


}

