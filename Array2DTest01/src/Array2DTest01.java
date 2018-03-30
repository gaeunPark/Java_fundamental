
public class Array2DTest01 {
	public static void main(String[] args) {
		
		int[][] a=new int[3][4];
		
		a[0][1]=10;
		a[1][2]=20;
		a[2][3]=30;
		//a[3][4]=40;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
