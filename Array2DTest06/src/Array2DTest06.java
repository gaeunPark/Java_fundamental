import java.util.Scanner;

public class Array2DTest06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String retry;
				
		do {
			System.out.print("행운의 수(1~45): ");
			int num=sc.nextInt();
			int count = 0;
			
			//난수를 생성해서 대입
			int[][] a= new int[4][5];
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45) + 1;
				}
			}
			
			//이차열 배열 출력과 비교
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if (num == a[i][j]) {
						++count;
						System.err.printf(" *%2d", a[i][j]);
					} else {
					System.out.printf("%5d", a[i][j]);
					}
				
				}System.out.println();
			}
			
			//결과를 판정하여 출력
			System.out.println("맞추신 갯수는 "+ count +"개 입니다.");
			switch(count) {
			case 0:
				System.out.println("보통 날입니다.");
				break;
			case 1:
				System.out.println("괜찮은 날입니다.");
				break;
			case 2:
				System.out.println("운이 좋은 날입니다.");
				break;
			case 3:
				System.out.println("운수 대통인 날입니다.");
				break;
			case 4:
				System.out.println("대박인 날입니다.");
				break;
			default:
				System.out.println("정말 대박인 날입니다!!");
				break;
			}
						
			System.out.print("다시 시도하겠습니까?(y/n): ");
			retry=sc.next();
			System.out.println();

			
		} while(retry.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
