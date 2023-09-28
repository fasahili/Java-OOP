public class Main {
 private static University getUniversity() {
  University university = new University();

  university.addStudent(121200, "Alice Johnson", "alice.johnson@example.com");
  university.addStudent(121211, "Bob Smith", "bob.smith@example.com");
  university.addStudent(121222, "Ella Williams", "ella.williams@example.com");
  university.addStudent(121233, "David Brown", "david.brown@example.com");
  university.addStudent(121244, "Grace Davis", "grace.davis@example.com");
  university.addStudent(121255, "Michael Lee", "michael.lee@example.com");
  university.addStudent(121266, "Sophia Thomas", "sophia.thomas@example.com");
  university.addStudent(121277, "Oliver Anderson", "oliver.anderson@example.com");


  university.addCourse(121300, "Introduction to Mathematics", "Professor Smith", 2);
  university.addCourse(121311, "Physics for Beginners", "Professor Johnson", 3);
  university.addCourse(121322, "Art History", "Professor Williams", 3);
  university.addCourse(121333, "Introduction to Chemistry", "Professor Davis", 2);
  university.addCourse(121344, "History of Literature", "Professor Brown", 2);
  university.addCourse(121355, "Introduction to Psychology", "Professor Lee", 3);
  university.addCourse(121366, "Introduction to Computer Science", "Professor Thomas", 3);
  university.addCourse(121377, "Political Science Fundamentals", "Professor Anderson", 2);

  return university;
 }
    public static void main(String[] args) {

     University university = getUniversity();

     System.out.println();

     university.enrollStuInCourse(121200,121300);
     university.enrollStuInCourse(121244,121300);
     //university.dropStuFromCourse(121244,121300);
     university.enrollStuInCourse(121266,121300);


     university.reportOfStudent(121200);
     university.reportOfStudent(121266);
     university.reportOfStudent(121244);
     university.reportOfCourses(121300);

     university.reportOfCoursesAvailable();




     //university.generalReport(121200,121333);



    }
}