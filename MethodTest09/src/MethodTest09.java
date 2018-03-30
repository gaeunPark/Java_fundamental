import java.util.*;

public class MethodTest09 {
	
	public static int linearSearch(int find, int[] a) {
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==find) {
				System.out.print(i+1+"번째 ");
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("배열의 갯수 입력: ");
		int n=sc.nextInt();
		System.out.print("검색할 값 입력: ");
		int find=sc.nextInt();
		
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=(int)(Math.random()*10)+1;
		}	
		System.out.println(Arrays.toString(a));
		
		int count=linearSearch(find,a);
		if(count==0) {
			System.out.println("검색하신 값은 없습니다.");
		} else {
			System.out.println("있습니다. \n검색한 값은 " + count + "개 입니다.");
		}

		sc.close();
	}

}
