package j09_클래스;

public class ClassA {
    int num;
    String name;
    double score;

     /*
     생성자
     1. 주소값이 항상 반환이 된다.

     */
    ClassA(){}

    ClassA(int a) {
        System.out.println("a: " + a);
        System.out.println("ClassA를 생성합니다.");
    }

    void callName(){
        System.out.println(name + "을(를) 부릅니다.");
    }
}
