package j07_반복;

public class loop5 {
    public static void main(String[] args) {

//        for (int i = 1; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                int x = i + 1;
//                int y = j + 1;
//                System.out.println(x + " X " + y + " = " + (x * y));
//            }
//        }

        for (int i = 0; i < 8; i++) {
            int dan = i + 2;
            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " X " + num + " = " + (dan * num));
            }
        }
    }
}