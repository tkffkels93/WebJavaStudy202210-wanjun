package j07_반복;

public class loop6 {
    public static void main(String[] args) {
        int n = 5;

        // 일정한 규칙을 가지고 순차적으로 증가할 때
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }

        // 조건을 가지고 반복할 때
        int i = 0;
        while (i < n) {
            System.out.println(i + 1);
            i++;
        }
    }
}