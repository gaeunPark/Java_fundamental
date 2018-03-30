import java.util.Scanner;

public class Test13 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력1: ");
		int a=sc.nextInt();
		System.out.print("정수 입력2: ");
		int b=sc.nextInt();
		System.out.print("정수 입력3: ");
		int c=sc.nextInt();
		int max=a, min=a;
		
		if (b>max) {
			max=b;
		}
		if (c>max ) {
			max=c; 
		}
		
		if (b<min) {
			min=b;
		} 
		if (c<min) {
			min=c;
		}
		
		System.out.println("최댓값: "+max +" 최솟값: "+ min);
		sc.close();
		
	}

}
