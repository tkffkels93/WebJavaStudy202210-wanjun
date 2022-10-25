package j05_Scanner;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {

        /*
         * 이름: 김완준                   name
         * 나이: 28                    age
         * 주소: 부산 북구 화명동         address
         * 연락처: 010 5179 5474        phone
         * 사용자의 이름은 김준일이고 나이는 29세입니다.
         * 주소는 부산 북구 화명동이며 연락처는 010 5179 5474입니다.
         * */

        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt();

        System.out.print("주소: ");
        scanner.nextLine();
        address = scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.print("사용자의 이름은 " + name + "이고 나이는 " + age + "세입니다.\n주소는 " + address + "이며 연락처는 " + phone + "입니다.");
    }
}
