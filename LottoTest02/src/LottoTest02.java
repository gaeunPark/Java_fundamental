import java.util.*;

public class LottoTest02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int [] lotto=new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if (lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.print("정수 입력(1~45): ");
		int num=sc.nextInt();
		
		
		
		
		
		
		
		
		sc.close();
	}

}
