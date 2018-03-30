import java.util.*;

public class MethodTest09 {
	
	public static int linearSearch(int find, int[] a) {
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==find) {
				System.out.print(i+1+"��° ");
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�迭�� ���� �Է�: ");
		int n=sc.nextInt();
		System.out.print("�˻��� �� �Է�: ");
		int find=sc.nextInt();
		
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=(int)(Math.random()*10)+1;
		}	
		System.out.println(Arrays.toString(a));
		
		int count=linearSearch(find,a);
		if(count==0) {
			System.out.println("�˻��Ͻ� ���� �����ϴ�.");
		} else {
			System.out.println("�ֽ��ϴ�. \n�˻��� ���� " + count + "�� �Դϴ�.");
		}

		sc.close();
	}

}
