import java.util.Scanner;

public class Loop03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n=sc.nextInt();
		
		//3��
	/*	for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		//3-2�� if��
/*		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(j<=i-1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}*/
		
		//4��
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//4-2��
		/*for(int i=1; i<=n; i++) {
			for(int j=n; j>=1+i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}*/
		
		//4-3�� if��
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(j+i>=n+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
