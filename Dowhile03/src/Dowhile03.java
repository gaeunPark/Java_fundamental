import java.util.Scanner;

public class Dowhile03 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int month;
		String answer;
		
		do {
			do {
				System.out.print("계절을 표시합니다. 월 입력(1~12): ");
				month=sc.nextInt();
			} while(month<1 || month>12);
			
			if (month>=3 && month<=5) {
				System.out.println(month+"월은 봄입니다.");
			}else if(month>=6 && month<=8) {
				System.out.println(month+"월은 여름입니다.");
			}else if(month>=9 && month<=11) {
				System.out.println(month+"월은 가을입니다.");
			}else if(month==12 || month==1 || month==2){
				System.out.println(month+"월은 겨울입니다.");
			}
			
			System.out.print("한번 더 하시겠습니까? (Y/N): ");
			answer=sc.next();
			
		}while(answer.equalsIgnoreCase("Y"));
		
		System.out.println("시스템을 종료합니다.");
		
		
		sc.close();
		
	}

}
