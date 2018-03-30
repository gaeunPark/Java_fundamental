import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("학생 수 입력: ");
		int n=sc.nextInt();
		
		int[] st=new int[n];
		int sum=0;
		
		for(int i=0; i<st.length; i++) {
			System.out.print((i+1)+"번째 학생 점수: ");
			st[i]=sc.nextInt();
			sum+=st[i];
		}
		
		System.out.println();
		System.out.println("5명 학생의 점수의 합은: "+sum);
		System.out.println("5명 학생의 점수의 평균은: "+((double)sum)/st.length);
		
		
		sc.close();
	}

}
