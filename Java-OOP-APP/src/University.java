import java.util.List;

public class University extends Report {
    public void addStudent(int id,String name,String email){
        Student student = new Student(id,name,email);
        students.add(student);
    }
    public void removeStudent(int id){
        Student student = getStudentById(id);
        students.remove(student);
    }
    public void addCourse(int code,String title,String instructor,int maxCapacity){
        Course course = new Course(code,title,instructor,maxCapacity);
        courses.add(course);
    }
    public void removeCourse(int code){
        Course course = getCourseByCode(code);
        courses.remove(course);
    }
    public void  dropStuFromCourse(int id,int code){
        Student student = getStudentById(id);
        Course course = getCourseByCode(code);

        if ( validateStu(id,code) ){
           if(validateIfStudentEnrolledCourse(id, code)){
                student.dropCourse(course);
           }else {
               System.out.println("The student ("+student.getName() + ") does not enrolled at this course (" +course.getTitle()+")");
           }
        }else {
            System.out.println("Invalid input, Please check your input and try again");
        }

    }
    private boolean validateIfStudentEnrolledCourse(int id,int code) {
        Student student = getStudentById(id);
        Course course = getCourseByCode(code);

        if (student != null && course != null) {
            return student.getEnrolledCourses().contains(course);
        }

        return false;
}

    public void enrollStuInCourse(int id,int code) {
        if(validateStu(id, code) ){
            validateCheckCapacityCourse(id, code);
        }else{
            System.out.println("Invalid input, Please check your input and try again");
        }
    }
    private void validateCheckCapacityCourse(int id,int code) {
        Student student = getStudentById(id);
        Course  course  = getCourseByCode(code);
        if(checkCapacityCourse(id, code)) {
            student.enrolledAtCourse(course);
        }else{
            System.out.println("Sorry can't enrolled ("+student.getName()+") Because the Course ("+course.getTitle() +") is Full,"+" And the maxCapacity of the course ("+course.getMaxCapacity()+")");
        }
    }
    private boolean checkCapacityCourse(int id,int code) {
        Student student = getStudentById(id);
        Course  course  = getCourseByCode(code);
        List<Student> listTemp = course.getEnrolledStudents();
        return course.getMaxCapacity() > listTemp.size();
    }
    private boolean validateStu(int id,int code) {
        Student student = getStudentById(id);
        Course course = getCourseByCode(code);
        return student != null && course != null;
    }




}

