import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		if (n>0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		} else if (n<0) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		} else if (n==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
			}
		
		sc.close();
	}
	
}


