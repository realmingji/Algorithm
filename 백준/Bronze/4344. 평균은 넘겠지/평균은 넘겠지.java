import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        double avg;
        int num, n, m;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt(); // 숫자 5개 입력
        
        for(int i = 0; i < num; i++) {
            n = sc.nextInt();  // 5 7 3 3 9
            double sum = 0;
            int cnt = 0;

            int arr[] = new int[n];
            // n이 5
            for(int j = 0; j < n; j++) { 
                m = sc.nextInt(); // 50 60 70 80 100
                arr[j] = m;
                sum = sum + m;
            }
            avg = sum / n;    // 평균

            for(int k = 0; k < n; k++){
                if(avg < arr[k]) {
                    cnt++;
                }
            }
            double ratio = (double) cnt / n * 100;
            System.out.printf("%.3f%%\n", ratio);

        }
    }
}