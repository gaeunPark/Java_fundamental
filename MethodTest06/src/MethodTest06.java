import java.util.*;

public class MethodTest06 {
	
	public static void drawChars(int n, char c, int a) {
		for(int i=1; i<=a-1; i++) {
			System.out.print(" ");
		}
		for(int i=1; i<=n-a+1; i++) {
			System.out.print(c);
		}
	}
	
	//2��
/*	public static void drawChars2( char c, int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(c);
		}
	}*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		char c=sc.next().charAt(0);
		System.out.print("���� �Է�: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			drawChars(n,c,i);
			System.out.println();
		}
		
		//2��
/*		for(int i=1; i<=5; i++) {
			drawChars2(' ', i-1);
			drawChars2(c, n-i+1);
			System.out.println();
		}*/
		sc.close();
	}

}
