import java.util.*;

public class MethodTest10 {
	
	public static void swap(int a[], int idx, int idx2) {
		int t=a[idx];
		a[idx]=a[idx2];
		a[idx2]=t;
	}
	
	public static void reverse(int a[]) {
		for(int i=0; i<(a.length/2); i++) {
			swap(a,i, a.length-1-i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("배열의 갯수 입력: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
		}
		System.out.print("reverse 전: ");
		System.out.println(Arrays.toString(a));
		
		reverse(a);
		System.out.print("reverse 후: ");
		System.out.println(Arrays.toString(a));
		
		sc.close();
	}

}
