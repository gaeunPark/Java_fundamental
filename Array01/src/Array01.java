import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		System.out.print("1�� �л� ����: ");
		int s1=sc.nextInt();
		System.out.print("2�� �л� ����: ");
		int s2=sc.nextInt();
		System.out.print("3�� �л� ����: ");
		int s3=sc.nextInt();
		System.out.print("4�� �л� ����: ");
		int s4=sc.nextInt();
		System.out.print("5�� �л� ����: ");
		int s5=sc.nextInt();
		
		sum=s1+s2+s3+s4+s5;
		System.out.println("5���� �հ�: "+ sum);
		System.out.println("5���� ���: "+ ((double)sum/5));
		
		sc.close();
	}

}
