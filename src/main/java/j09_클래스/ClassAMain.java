package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {
//        System.out.println(new ClassA());
//        System.out.println(new ClassA());
//        System.out.println(new ClassA());
//        System.out.println(new ClassA());
//
//        ClassA a1 = new ClassA();
//        ClassA a2 = new ClassA();
//
//        a1.name = "김완준";
//        System.out.println(a1.name);
//        a2.name = "박종섭";
//        System.out.println(a2.name);
//
//        a1.callName();
//        a2.callName();

        Student a1 = new Student();
        Student a2 = new Student();

        a1.schoolName = "부산대학교";
        a1.studentCode = 20141667;
        a1.studentYear = 3;
        a1.name = "김완준";

        a2.schoolName = "서울대학교";
        a2.studentCode = 20141999;
        a2.studentYear = 1;
        a2.name = "박종섭";

        a1.showStudentInfo();
        a2.showStudentInfo();

//        a1.increaseStudentYear();
//        a1.increaseStudentYear();
//        a1.increaseStudentYear();
//        a1.showStudentInfo();

    }
}
