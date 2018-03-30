//import java.util.Scanner;
//import java.util.Random;
import java.util.*;


public class Array04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int[] a=new int[10];
		
		//점수 직접 입력
	/*	for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"번째 정수 입력: ");
			a[i]=sc.nextInt();
		}*/
		
		//난수 발생
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			a[i]=r.nextInt(100);
			System.out.print(a[i]+ " ");
		}
		System.out.println("]");
		
		int max=a[0], min=a[0];
		for(int i=1; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			} 
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println();
		System.out.println("정수들의 최댓값은: "+max);
		System.out.println("정수들의 최솟값은: "+min);

		sc.close();
		
	}

}
