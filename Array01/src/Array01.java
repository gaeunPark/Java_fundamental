import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		System.out.print("1번 학생 점수: ");
		int s1=sc.nextInt();
		System.out.print("2번 학생 점수: ");
		int s2=sc.nextInt();
		System.out.print("3번 학생 점수: ");
		int s3=sc.nextInt();
		System.out.print("4번 학생 점수: ");
		int s4=sc.nextInt();
		System.out.print("5번 학생 점수: ");
		int s5=sc.nextInt();
		
		sum=s1+s2+s3+s4+s5;
		System.out.println("5명의 합계: "+ sum);
		System.out.println("5명의 평균: "+ ((double)sum/5));
		
		sc.close();
	}

}
