import java.util.*;

public class MethodTest03 {
	
	public static double power(double a, int b) {
		double result=1;
		
		//for문
//		for(int i=0; i<b; i++) {
//			result *= a;			
//		}
		
		//while문
		int i=0;
		while(i<b) {
			result *= a;
			i++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 입력: ");
		double a = sc.nextDouble();
		System.out.print("정수 입력: ");
		int b=sc.nextInt();
		
		//1번 메소드 사용하지 않았을 떄
//		double result=1;
//		for(int i=0; i<b; i++) {
//			result *= a;
//		}
		
		//2번 메소드를 사용했을 때
		double result = power(a,b);
		
		System.out.println(a + "의 " + b + "승은 " + result);
		
		sc.close();
	}

}
