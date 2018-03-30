import java.util.*;

public class Test1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Test1");
		System.out.print("Input the 1st numeber: ");
		int n1=sc.nextInt();
		System.out.print("Input the 2st numeber: ");
		int n2=sc.nextInt();
		System.out.print("Input the 3st numeber: ");
		int n3=sc.nextInt();

		int max=n1;
		if(max<n2){
			max=n2;
		}
		if(max<n3){
			max=n3;
		}
		System.out.println("The greatest: " + max);

		System.out.println("Test2");
		System.out.println("1-7까지 숫자를 입력하세요");
		System.out.print("Input number: ");
		int day=sc.nextInt();
		
		switch(day){
			case 1: System.out.println("Monday");
			case 2: System.out.println("Tuesday");
			case 3: System.out.println("Wendsday");
			case 4: System.out.println("Thursday");
			case 5: System.out.println("Friday");
			case 6: System.out.println("Saturday");						
			case 7: System.out.println("Sunday");
		}

		System.out.println("Test3");
		int n=0;
		int sum=0;
		double average=0.0;

		for(int i=0; i<5; i++){
			System.out.print("정수입력: ");
			n=sc.nextInt();
			sum+=n;
		}
		average=sum/5.0;
		System.out.println("The sum of 5 no is : " + sum);
		System.out.println("The Average is : " + average);

		sc.close();
}
}
