import java.util.*;

public class MethodTest03 {
	
	public static double power(double a, int b) {
		double result=1;
		
		//for��
//		for(int i=0; i<b; i++) {
//			result *= a;			
//		}
		
		//while��
		int i=0;
		while(i<b) {
			result *= a;
			i++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� �Է�: ");
		double a = sc.nextDouble();
		System.out.print("���� �Է�: ");
		int b=sc.nextInt();
		
		//1�� �޼ҵ� ������� �ʾ��� ��
//		double result=1;
//		for(int i=0; i<b; i++) {
//			result *= a;
//		}
		
		//2�� �޼ҵ带 ������� ��
		double result = power(a,b);
		
		System.out.println(a + "�� " + b + "���� " + result);
		
		sc.close();
	}

}
