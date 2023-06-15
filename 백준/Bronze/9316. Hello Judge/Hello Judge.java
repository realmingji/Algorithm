import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < input; i++) {
            cnt++;
            System.out.println("Hello World, Judge " + cnt + "!");
        }
    }
}
