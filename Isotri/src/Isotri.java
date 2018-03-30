import java.util.*;

public class Isotri {
	public static void iso_triangle(int n){
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
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//이등변삼각형
		System.out.print("밑변(홀수)를 입력하세요: ");
		int n=sc.nextInt();
		
		while(n%2==0) {
			System.out.print("다시 밑변(홀수)를 입력하세요: ");
			n=sc.nextInt();
		}
		
		iso_triangle(n);

		sc.close();
	}
}
