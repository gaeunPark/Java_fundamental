import java.util.*;

public class MethodTest05 {
	
	public static void count(int n) {
		for(int i=n; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int n=sc.nextInt();
		
		count(n);
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
		
		sc.close();
	}

}
