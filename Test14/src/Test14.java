import java.util.Scanner;

public class Test14 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�1: ");
		int a=sc.nextInt();
		System.out.print("���� �Է�2: ");
		int b=sc.nextInt();
						
		if (a>b) {
			int temp=a;
			a=b;
			b=temp;
		} 
		System.out.print("���� ��a: "+a+" ū ��b: "+ b);
		sc.close();	
		
	}

}
