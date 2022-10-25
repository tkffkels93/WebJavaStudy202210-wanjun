package j02_변수상수;

public class Variable {
    public static void main(String[] args) {

        // 논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);

        checkFlag = true;
        System.out.println(checkFlag);

        //문자자료형 변수
        char name1 = '김';
        char name2 = '완';
        char name3 = '준';

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("" + name1 + name2 + name3);
        System.out.println('가' + 0);

        int a = '가' + 0;

        System.out.println(Integer.toHexString(a));

        //문자열자료형 변수
        String name = "김완준";
        String name4 = "박종섭";

        String name5 = name + name4;

        System.out.println(name5);

        //정수자료형 변수
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis();
        System.out.println(time);

        long time2 = 1666178908683L;
        System.out.println(time2);


        //실수자료형 변수
        double pi = 3000000.14159265359999999;
        System.out.println(pi);

        final String FILE_PATH = "C:/Users/junil";
//        FILE_PATH = "D:/Users/aaa";
        System.out.println(FILE_PATH);


    }
}
