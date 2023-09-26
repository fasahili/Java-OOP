public class Main {
    public static void main(String[] args) {

     University university = new University();


     university.addStudent(121100,"Faris","s121100@stu.najah.edu");
     university.addStudent(121111,"Sara","s121111@stu.najah.edu");
     university.addStudent(121122,"Mustafa","s121122@stu.najah.edu");
     university.addStudent(121133,"Dana","s121133@stu.najah.edu");
     university.addStudent(121144,"Ali","s121144@stu.najah.edu");
     university.addStudent(121155,"Zina","s121155@stu.najah.edu");
     university.addStudent(121166,"Saad","s121166@stu.najah.edu");
     university.addStudent(121177,"Yara","s121177@stu.najah.edu");


     university.addCourse(1212323,"Advanced programing","Mustafa Ali",2);
     university.addCourse(1212144,"Software Engineering","Zina foad",3);
     university.addCourse(1212165,"Quality Assurance","Abdallah ahmad",3);
     university.addCourse(1212157,"Cloud Compiting","Khalil bashar",2);
     university.addCourse(1212432,"Data Structure","Hussam mohammad",2);
     university.addCourse(1215473,"C1","Yara Taser",3);
     university.addCourse(1232433,"Data base","Faris Sahili",3);
     university.addCourse(1215737,"Mobile development","Elon mask",2);


     university.enrollStuInCourse(121166,1212144);
     university.enrollStuInCourse(121166,1212157);
     university.enrollStuInCourse(121166,1215737);
     university.enrollStuInCourse(121166,1232433);


     university.printCourses(121166);
     university.printCourses(121111);


    }
}