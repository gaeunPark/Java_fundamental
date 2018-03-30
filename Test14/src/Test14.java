import java.util.Scanner;

public class Test14 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력1: ");
		int a=sc.nextInt();
		System.out.print("정수 입력2: ");
		int b=sc.nextInt();
						
		if (a>b) {
			int temp=a;
			a=b;
			b=temp;
		} 
		System.out.print("작은 수a: "+a+" 큰 수b: "+ b);
		sc.close();	
		
	}

}
