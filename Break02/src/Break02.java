import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	int n, sum=0;
	
	for(;;) {
		
		System.out.print("���� �Է�(0�� �Է��ϸ� ����): ");
		n=sc.nextInt();
		if (n==0) {
			break;
		}
		sum+=n;		
	}
	System.out.println("�Է��� ���� ��: "+sum);
	
	sc.close();
	}
	

}
