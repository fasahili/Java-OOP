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

     //This code to presentation features only and not practical ...

     System.out.println();

     university.enrollStuInCourse(121200,121300);
     university.enrollStuInCourse(121244,121300);
     System.out.println("---The user added another student in the course but the course is full, so this message below ↓ ");
     university.enrollStuInCourse(121266,121300);
     university.reportOfCourses(121300); System.out.println();System.out.println("------------");System.out.println();


     System.out.println("---And if the user have a invalid input, so this message below ↓ ");
     university.enrollStuInCourse(12126996,12130999);System.out.println(); System.out.println("------------");System.out.println();


     System.out.println();
     university.reportOfStudent(121200);
     System.out.println("---Alice Johnson added Courses (before ↑) , And (after ↓)");
     university.enrollStuInCourse(121200,121333);
     university.enrollStuInCourse(121200,121377);
     university.enrollStuInCourse(121200,121322);
     university.reportOfStudent(121200);
     System.out.println();System.out.println("------------");System.out.println();


     System.out.println("---Alice Johnson drop Courses (before ↑) , And (after ↓)");
     university.dropStuFromCourse(121200,121300);
     university.dropStuFromCourse(121200,121377);
     university.reportOfStudent(121200);
     System.out.println();System.out.println("------------");System.out.println();


     System.out.println("---If the user drops the course for the student and the student is not enrolled it, so this message below ↓ ");
     university.reportOfStudent(121200);
     university.dropStuFromCourse(121200,121344);System.out.println();


     System.out.println("---And if the user have a invalid input, so this message below ↓ ");
     university.enrollStuInCourse(121200,12130999);System.out.println();
     System.out.println();System.out.println("------------");System.out.println();



     university.reportOfCoursesAvailable();
     System.out.println();System.out.println("------------");System.out.println();

     university.generalReport(121200,121300);
     System.out.println();System.out.println("------------");System.out.println();
     System.out.println("---Will delete a (Introduction to Computer Science) course and (Alice Johnson) student from university");
     System.out.println();System.out.println("------------");System.out.println();
     System.out.println();
     university.removeStudent(121200);
     university.removeCourse(121366);
     university.generalReport(121200,121300);
     System.out.println();System.out.println("------------");System.out.println();



    }
}