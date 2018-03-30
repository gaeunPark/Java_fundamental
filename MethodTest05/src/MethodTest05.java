import java.util.*;

public class MethodTest05 {
	
	public static void count(int n) {
		for(int i=n; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n=sc.nextInt();
		
		count(n);
		System.out.println("카운트가 종료되었습니다.");
		
		sc.close();
	}

}
