import java.util.Scanner;

public class Array2DTest06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String retry;
				
		do {
			System.out.print("����� ��(1~45): ");
			int num=sc.nextInt();
			int count = 0;
			
			//������ �����ؼ� ����
			int[][] a= new int[4][5];
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45) + 1;
				}
			}
			
			//������ �迭 ��°� ��
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
			
			//����� �����Ͽ� ���
			System.out.println("���߽� ������ "+ count +"�� �Դϴ�.");
			switch(count) {
			case 0:
				System.out.println("���� ���Դϴ�.");
				break;
			case 1:
				System.out.println("������ ���Դϴ�.");
				break;
			case 2:
				System.out.println("���� ���� ���Դϴ�.");
				break;
			case 3:
				System.out.println("��� ������ ���Դϴ�.");
				break;
			case 4:
				System.out.println("����� ���Դϴ�.");
				break;
			default:
				System.out.println("���� ����� ���Դϴ�!!");
				break;
			}
						
			System.out.print("�ٽ� �õ��ϰڽ��ϱ�?(y/n): ");
			retry=sc.next();
			System.out.println();

			
		} while(retry.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
