import java.util.*;

public class LottoTest01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int[] lotto=new int[6];		
		
		//���� ���� ���ֱ�
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for (int j=0; j<i; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		
		System.out.print("���� �Է�(1~45):");
		int num=sc.nextInt();
		int result=0;
		for(int i=0; i<lotto.length; i++) {
			if(num==lotto[i]) {
				result=1;
			}  				
		}
		
		if(result==1) {
			System.out.println("���� ����� ����Դϴ�.");
		} else {
			System.out.println("�ٽ� ������ ������");
		}
		
		//��������
//		for(int i=0; i<lotto.length-1; i++) {
//			for(int j=i+1; j<lotto.length; j++) {
//				if(lotto[i]>lotto[j]) {
//					int t=lotto[i];
//					lotto[i]=lotto[j];
//					lotto[j]=t;
//				}
//			}
//		}
		
		//��������
		for(int i=0; i<lotto.length-1; i++) {
			boolean checked=false;
			for(int j=0; j<lotto.length-1-i; j++) {
				if (lotto[j]>lotto[j+1]) {
					int t=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=t;
					checked=true;
				}			
			}
			if(!checked) {
					break;
			}
		}
		
		System.out.print("Lotto ��ȣ�� ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.print("�Դϴ�");
		
		sc.close();	
	}

}
