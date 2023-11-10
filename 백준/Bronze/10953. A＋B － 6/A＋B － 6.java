import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i = 0; i < n; i++) {
      String a = sc.next();
      String[] num = a.split(",");

      int n1 = Integer.parseInt(num[0]);
      int n2 = Integer.parseInt(num[1]);

      System.out.println(n1+n2);
    }
  }
}