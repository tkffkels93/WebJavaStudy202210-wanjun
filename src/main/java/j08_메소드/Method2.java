package j08_메소드;

import java.util.Scanner;

public class Method2 {
    /*
        별찍기
    */
//    public static String getStar(int  x, int y){
//        String result = "";
//
//        switch (y) {
//            case 1:
//                for (int i = 0; i < x; i++) {
//
//                    for (int j = 0; j < i + 1; j++) {
//                        result += "*";
//                    }
//                    result += "\n";
//                }
//                break;
//            case 2:
//                for (int i = 0; i < x; i++) {
//
//                    for (int j = 0; j < x - i; j++) {
//                        result += "*";
//                    }
//                    result += "\n";
//                }
//                break;
//            case 3:
//                for (int i = 0; i < x; i++) {
//
//                    for (int j = 0; j < x - i - 1; j++) {
//                        System.out.print(" ");
//                    }
//                    for (int j = 0; j < i + 1; j++) {
//                        result += "*";
//                    }
//                    result += "\n";
//                }
//                break;
//            case 4:
//                for (int i = 0; i < 10; i++) {
//
//                    for (int j = 0; j < i; j++) {
//                        result += "\n";
//                    }
//
//                    for (int j = 0; j < 10 - i; j++) {
//                        result += "*";
//                    }
//                    result += "\n";
//                }
//                break;
//            default:
//                System.out.println("해당 번호는 선택할 수 없습니다.");
//        }
//
//        return result;
//
//    }

    public static String getStar(int  select, int n){
        String result = "";

        if (select == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <i+1; j++){
                    result += "*";
                }
                result += "\n";
            }

        } else if (select == 2) {
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n - i - 1; j++) {
                    result += " ";
                }
                for (int j = 0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 3) {
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 4) {
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < i; j++) {
                    result += " ";
                }
                for (int j = 0; j < n - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else {
            System.out.println("입력 오류!!!");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력
        int n= 0;
        int select = 0;

        System.out.print("별의 개수입력: ");
        n = scanner.nextInt();

        System.out.println("1. 왼쪽에 치우친 증가하는 별");
        System.out.println("2. 오른쪽에 치우친 증가하는 별");
        System.out.println("3. 왼쪽에 치우친 감소하는 별");
        System.out.println("4. 오른쪽에 치우친 감소하는 별");

        System.out.print("메뉴 선택: ");
        select = scanner.nextInt();

        String star = getStar(select,n);
        System.out.println("[ 결과 ]");
        System.out.println(star);
    }
}
