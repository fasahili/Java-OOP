import java.util.List;

public class University extends Report {
    public void addStudent(int id,String name,String email){
        Student student = new Student(id,name,email);
        students.add(student);
    }
    public void addCourse(int code,String title,String instructor,int maxCapacity){
        Course course = new Course(code,title,instructor,maxCapacity);
        courses.add(course);
    }
    public void enrollStuInCourse(int id,int code) {
        if(validateStu(id, code) ){
            validateCheckCapacityCourse(id, code);
        }else{
            System.out.println("Invalid input");
        }
    }
    private void validateCheckCapacityCourse(int id,int code) {
        Student student = getStudentById(id);
        Course  course  = getCourseByCode(code);
        if(checkCapacityCourse(id, code)) {
            student.enrolledAtCourse(course);
        }else{
            System.out.println("Sorry can't enrolled ("+student.getName()+") Because the Course is Full ...");
        }
    }
    private boolean checkCapacityCourse(int id,int code) {
        Student student = getStudentById(id);
        Course  course  = getCourseByCode(code);
        List<Student> listTemp = course.getEnrolledStudents();
        return course.getMaxCapacity() > listTemp.size();
    }
    public void  dropStuFromCourse(int id,int code){
        Student student = getStudentById(id);
        Course course = getCourseByCode(code);

        if ( validateStu(id,code) ){
            student.dropCourse(course);
        }else {
            System.out.println("Invalid input");
        }

    }
    private boolean validateStu(int id,int code) {
        Student student = getStudentById(id);
        Course course = getCourseByCode(code);
        return student != null && course != null;
    }




}

