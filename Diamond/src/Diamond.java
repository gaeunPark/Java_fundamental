import java.util.*;

public class Diamond {
	
	public static void diamond(int n) {
		n/=2;		
		
		for(int i=0; i<n+1; i++) {		
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*(n-i)-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//마름모
		System.out.print("마름모 크기(홀수)를 입력하세요: ");
		int n=sc.nextInt();
		
		while(n%2==0) {
			System.out.print("다시 크기(홀수)를 입력하세요: ");
			n=sc.nextInt();
		}		
		//출력
		diamond(n);
		
		sc.close();
	}
}
