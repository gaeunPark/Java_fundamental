import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n=sc.nextInt();
		
		if (n%2!=1) {
			System.out.println(n+"은(는) 짝수입니다.");
		} else if (n%2!=0) {
			System.out.println(n+" 홀수입니다.");
		} else if (n==0) {
			System.out.println(n+ " 0입니다.");
		}
		sc.close();
		
		
	}
}
