import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n=sc.nextInt();
		
		if (n%2!=1) {
			System.out.println(n+"��(��) ¦���Դϴ�.");
		} else if (n%2!=0) {
			System.out.println(n+" Ȧ���Դϴ�.");
		} else if (n==0) {
			System.out.println(n+ " 0�Դϴ�.");
		}
		sc.close();
		
		
	}
}
