import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
		    int a = sc.nextInt();
		    String s = sc.next();
		    
		    for(int j = 0; j<s.length(); j++){
		        for(int k = 0; k<a; k++){
		            System.out.print(s.charAt(j));
		        }
		    }
		    System.out.println();
		}
		
	}
}