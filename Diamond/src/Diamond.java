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
		
		//������
		System.out.print("������ ũ��(Ȧ��)�� �Է��ϼ���: ");
		int n=sc.nextInt();
		
		while(n%2==0) {
			System.out.print("�ٽ� ũ��(Ȧ��)�� �Է��ϼ���: ");
			n=sc.nextInt();
		}		
		//���
		diamond(n);
		
		sc.close();
	}
}
