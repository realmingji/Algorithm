import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];    //31개 정수값 저장

        // 특별과제를 28명 제출했다.
        for (int i = 1; i < 29; i++) {
            int input = sc.nextInt();
            student[input] = 1; // 배열에 담기
        }
        for (int i = 1; i < student.length; i++) {  // 배열 길이만큼
            if (student[i] == 0) {  // 1은 제출O, 0은 제출X
                System.out.println(i);
            }
        }
    }
}
