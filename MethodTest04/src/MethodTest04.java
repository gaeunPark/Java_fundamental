import java.util.*;

public class MethodTest04 {
	
	public static void drawnStar(int a) {
		//for��
//		for(int i=1; i<=a; i++) {
//			System.out.print("* ");
//		}
		
		//while��
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
		
		System.out.print("���� �Է�: ");
		int n=sc.nextInt();
		
//		//1�� �޼ҵ�� ������ �ʾ��� ��
//		for(int i=1; i<=n; i++ ) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//2�� �޼ҵ� ���
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
