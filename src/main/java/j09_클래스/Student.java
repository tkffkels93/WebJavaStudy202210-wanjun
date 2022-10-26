package j09_클래스;

public class Student {
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void showStudentInfo() {
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println();
    }

    void increaseStudentYear() {
        if (studentYear > 0 && studentYear < 5) {
            studentYear += 1;
            System.out.println("학년이 증가되었습니다.");
        } else {
            System.out.println("학년이 증가될 수 없습니다.");
        }
    }
}
