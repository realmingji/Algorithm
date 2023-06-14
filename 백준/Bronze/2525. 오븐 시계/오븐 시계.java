import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       // 14시              17시
        int b = sc.nextInt();       // 30분              40분         50
        int c = sc.nextInt();       // 20 필요한 시간     80           90

        a += (b + c) / 60;          // b와 c를 더한 후 60으로 나눈 몫을 a에 더해라 => '시'
        b = b + c % 60;             // 분

        // 시간
        if (a >= 24) {       // a가 24보다 크다?
            a = a - 24;     // a - 24 해주기
        }

        // 분
        if (b >= 60) {      // b(분)가 60보다 크거나 같으면
            b = b - 60;
        }
        System.out.println(a + " " + b);
    }
}
