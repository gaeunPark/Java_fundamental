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
		
		//�̵�ﰢ��
		System.out.print("�غ�(Ȧ��)�� �Է��ϼ���: ");
		int n=sc.nextInt();
		
		while(n%2==0) {
			System.out.print("�ٽ� �غ�(Ȧ��)�� �Է��ϼ���: ");
			n=sc.nextInt();
		}
		
		iso_triangle(n);

		sc.close();
	}
}
