import java.util.Scanner;

public class Test17 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n=sc.nextInt();
		
		//1��
//		for(int i=1; i<=n; i++) {
//			if (i%2==1) {
//				System.out.print("*");
//			} else if (i%2==0) {
//				System.out.print("+");
//			}
//		}
		
		//2��
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum +=i;
			System.out.print(i);
			if (i<n) {
				System.out.print("+");
			}						
		}System.out.print("="+sum);
		

		sc.close();
	}

}
