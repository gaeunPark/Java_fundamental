import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�л� �� �Է�: ");
		int n=sc.nextInt();
		
		int[] st=new int[n];
		int sum=0;
		
		for(int i=0; i<st.length; i++) {
			System.out.print((i+1)+"��° �л� ����: ");
			st[i]=sc.nextInt();
			sum+=st[i];
		}
		
		System.out.println();
		System.out.println("5�� �л��� ������ ����: "+sum);
		System.out.println("5�� �л��� ������ �����: "+((double)sum)/st.length);
		
		
		sc.close();
	}

}
