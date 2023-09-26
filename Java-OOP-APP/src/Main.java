public class Main {
    public static void main(String[] args) {

     University u1 = new University();
     University u2 = new University();

    u1.addStudent(121100,"Faris","s121100@stu.najah.edu");
    u1.addStudent(121111,"Sara","s121111@stu.najah.edu");
    u1.addStudent(121122,"Mustafa","s121122@stu.najah.edu");
    u1.addStudent(121133,"Dana","s121133@stu.najah.edu");

    u1.addCourse(1212323,"Advanced programing","Mustafa Ali",2);
    u1.addCourse(1212144,"Software Engineering","Zina foad",3);
    u1.addCourse(1212165,"Quality Assurance","Abdallah ahmad",3);
    u1.addCourse(1212157,"Cloud Compiting","Khalil bashar",2);

//---------------------------------------------------------------------------------------

    u2.addStudent(121144,"Ali","s121144@stu.najah.edu");
    u2.addStudent(121155,"Zina","s121155@stu.najah.edu");
    u2.addStudent(121166,"Saad","s121166@stu.najah.edu");
    u2.addStudent(121177,"Yara","s121177@stu.najah.edu");

    u2.addCourse(1212432,"Data Structure","Hussam mohammad",2);
    u2.addCourse(1215473,"C1","Yara Taser",3);
    u2.addCourse(1232433,"Data base","Faris Sahili",3);
    u2.addCourse(1215737,"Mobile development","Elon mask",2);


    Course c1 = u1.getCourseByCode(1212323);
    Course c2 = u1.getCourseByCode(1212144);
    Course c3 = u1.getCourseByCode(1212165);
    Course c4 = u1.getCourseByCode(1212157);
    Course c5 = u1.getCourseByCode(1212432);
    Course c6 = u1.getCourseByCode(1215473);
    Course c7 = u1.getCourseByCode(1232433);
    Course c8 = u1.getCourseByCode(1215737);

    Student s1 = u1.getStudentById(121100);

    s1.enrolledAtCourse(c1);
    s1.enrolledAtCourse(c3);
    s1.enrolledAtCourse(c6);
    s1.enrolledAtCourse(c8);

    System.out.println(c1.getCode()+" "+c1.getTitle()+" "+c1.getInstructor()+" "+ c1.getMaxCapacity());
    System.out.println(s1.getName()+" "+s1.getId()+" "+s1.getEmail());

    System.out.println();
    s1.printCourse();
    s1.dropCourse(c6);
    s1.printCourse();
    }
}