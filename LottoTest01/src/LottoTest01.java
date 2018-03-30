import java.util.*;

public class LottoTest01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int[] lotto=new int[6];		
		
		//같은 난수 없애기
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for (int j=0; j<i; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		
		System.out.print("정수 입력(1~45):");
		int num=sc.nextInt();
		int result=0;
		for(int i=0; i<lotto.length; i++) {
			if(num==lotto[i]) {
				result=1;
			}  				
		}
		
		if(result==1) {
			System.out.println("오늘 운수는 대박입니다.");
		} else {
			System.out.println("다시 도전해 보세요");
		}
		
		//선택정렬
//		for(int i=0; i<lotto.length-1; i++) {
//			for(int j=i+1; j<lotto.length; j++) {
//				if(lotto[i]>lotto[j]) {
//					int t=lotto[i];
//					lotto[i]=lotto[j];
//					lotto[j]=t;
//				}
//			}
//		}
		
		//버블정렬
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
		
		System.out.print("Lotto 번호는 ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.print("입니다");
		
		sc.close();	
	}

}
