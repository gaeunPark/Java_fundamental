
public class Gugudan {
	
	public static void main(String[] args) {
		
		//1�� for�� Ȱ��
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
		
		//2�� while�� Ȱ��
//		int x=2;
//		while(x<=9) {
//			int y=1;
//			while(y<=9) {
//				System.out.println(x+"*"+y+"="+(x*y));
//				y++;
//			}
//			x++;
//			System.out.println();
//		}
		
		//3�� do-while�� Ȱ��
		int x=2, y;
		do {
			y=1;
			do {
				System.out.println(x+"*"+y+"="+(x*y));
				y++;
			} while(y<=9);
			x++;
			System.out.println();
		} while(x<=9);
		
		
	}

}
