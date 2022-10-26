package j09_클래스.Student풀이;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20141667;
        s1.studentYear = 1;
        s1.name = "김완준";

        s2.schoolName = "서울대학교";
        s2.studentCode = 20141999;
        s2.studentYear = 1;
        s2.name = "박종섭";

        s1.showStudentInfo();
        s2.showStudentInfo();

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);

        s1.showStudentInfo();
    }
}
