import java.util.Scanner;

public class Dowhile03 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int month;
		String answer;
		
		do {
			do {
				System.out.print("������ ǥ���մϴ�. �� �Է�(1~12): ");
				month=sc.nextInt();
			} while(month<1 || month>12);
			
			if (month>=3 && month<=5) {
				System.out.println(month+"���� ���Դϴ�.");
			}else if(month>=6 && month<=8) {
				System.out.println(month+"���� �����Դϴ�.");
			}else if(month>=9 && month<=11) {
				System.out.println(month+"���� �����Դϴ�.");
			}else if(month==12 || month==1 || month==2){
				System.out.println(month+"���� �ܿ��Դϴ�.");
			}
			
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�? (Y/N): ");
			answer=sc.next();
			
		}while(answer.equalsIgnoreCase("Y"));
		
		System.out.println("�ý����� �����մϴ�.");
		
		
		sc.close();
		
	}

}
