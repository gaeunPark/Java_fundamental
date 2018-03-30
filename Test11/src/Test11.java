import java.util.Scanner;

public class Test11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("월을 입력하세요: ");
		int month=sc.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println(month+ "월은 봄입니다.");
		} else if (month>=6 && month<=8) {
			System.out.println(month+ "월은 여름입니다.");
		} else if (month>=9 && month<=11) {
			System.out.println(month+ "월은 가을입니다.");
		} else {
			System.out.println(month+ "월은 겨울입니다.");
		}
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month+ "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month+ "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month+ "월은 가을입니다.");
			break;
		default:
			System.out.println(month+ "월은 겨울입니다.");
			break;
			
		}
		
		
		sc.close();
		
	}

}
