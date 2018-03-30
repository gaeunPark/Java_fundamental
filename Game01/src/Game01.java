import java.util.*;

public class Game01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int com=(int)(Math.random()*3);
		int[] score=new int[3];
		String retry;
		
		do {
			String[] s= {"가위", "바위", "보"};
			System.out.print("사용자 입력 (0-가위/1-바위/2-보): ");
			int user=sc.nextInt();
			
			System.out.println("유저는 "+s[user]+"이고, 컴퓨터는 "+s[com]+"입니다");
			int result=(user-com+3)%3;
			
			switch(result) {
			case 1:
				System.out.println("user가 이겼습니다");
				++score[0];
				break;
			case 2:
				System.out.println("user가 패배하였습니다");
				++score[1];
				break;
			case 0:
				System.out.println("비겼습니다");
				++score[2];
				break;
			}
			System.out.print("한번 더 하시겠습니까? (y/n): ");
			retry=sc.next();
		} while(retry.equalsIgnoreCase("y"));
		
		System.out.println("당신의 승률은 "+score[0]+"승 "+score[1]+"패 "+score[2]+"무");
		
		sc.close();
	}

}
