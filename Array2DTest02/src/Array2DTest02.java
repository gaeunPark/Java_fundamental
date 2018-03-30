import java.util.*;

public class Array2DTest02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("행 수 입력: ");
		int x=sc.nextInt();
		System.out.print("열 수 입력: ");
		int y=sc.nextInt();
		
		int[][] a=new int[x][y];
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				a[i][j]=(int)(Math.random()*90+10);
			}
		}
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		
						
		sc.close();
	}

}
