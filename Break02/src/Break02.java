import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	int n, sum=0;
	
	for(;;) {
		
		System.out.print("정수 입력(0을 입력하면 종료): ");
		n=sc.nextInt();
		if (n==0) {
			break;
		}
		sum+=n;		
	}
	System.out.println("입력한 값의 합: "+sum);
	
	sc.close();
	}
	

}
