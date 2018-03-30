import java.util.*;

public class MethodTest04 {
	
	public static void drawnStar(int a) {
		//for문
//		for(int i=1; i<=a; i++) {
//			System.out.print("* ");
//		}
		
		//while문
		int i=1;
		while(i<=a) {
			System.out.print("* ");
			i++;
		}
	}
	
	public static void drawnStar2(int n, int a) {
		for(int i=1; i<=a-1; i++) {
			System.out.print("  ");
		}
		for(int i=1; i<=n+1-a; i++) {
			System.out.print("* ");
		}
	
	}
	
	public static void drawnStar3(int n, int a) {
		for(int i=1; i<=n-a; i++) {
			System.out.print("  ");
		}
		for(int i=1; i<=a; i++) {
			System.out.print("* ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n=sc.nextInt();
		
//		//1번 메소드로 나누지 않았을 때
//		for(int i=1; i<=n; i++ ) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//2번 메소드 사용
	/*	for(int i=1; i<=n; i++) {
			drawnStar(i);
			System.out.println();
		}*/
		for(int i=1; i<=n; i++) {
			drawnStar(i);
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			drawnStar2(n,i);
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			drawnStar3(n,i);
			System.out.println();
		}
		
		sc.close();
	}

}
