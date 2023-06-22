import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int min = 100;

        for (int i = 1; i < 8; i++) {  // i가 1부터 7까지
            int input = sc.nextInt();
            if (input % 2 == 1) {     // 입력 값이 홀수?
                sum = sum + input;      // 더해라
                min = Math.min(input, min); // 최소값도 구해라
            }
        }
        if (sum == 0) {             // 짝수면 sum을 안해도 되니깐
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
