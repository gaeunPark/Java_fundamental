import java.util.Scanner;

public class Test11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���: ");
		int month=sc.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println(month+ "���� ���Դϴ�.");
		} else if (month>=6 && month<=8) {
			System.out.println(month+ "���� �����Դϴ�.");
		} else if (month>=9 && month<=11) {
			System.out.println(month+ "���� �����Դϴ�.");
		} else {
			System.out.println(month+ "���� �ܿ��Դϴ�.");
		}
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month+ "���� ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println(month+ "���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(month+ "���� �����Դϴ�.");
			break;
		default:
			System.out.println(month+ "���� �ܿ��Դϴ�.");
			break;
			
		}
		
		
		sc.close();
		
	}

}
