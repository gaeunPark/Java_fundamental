import java.util.Scanner;

public class Array2DTest07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요: ");
		int n=sc.nextInt();
		int[][] a = new int[n][7];
		String[] subject = {" ", "국어", "영어", "수학"};
		String[] title = {"NO", "KOR", "ENG", "MAT", "SUM", "AVG", "RANK"};
		
		//학생별로 세 과목의 성적입력
		for (int i=0; i<a.length; i++) {
			System.out.println( (i+1) + "번째 학생 성적");
			a[i][0] = i+1;		//학생 id
			for(int j=1; j<4; j++) {
				System.out.print(subject[j]+" 입력: ");
				a[i][j] = sc.nextInt();
			
			}
		}
				
		//학생의 총점과 평균을 계산
		int[] total = new int[n];	
		for (int i=0; i<a.length; i++) {
			int sum=0;
			for (int j=1; j<4; j++) {
				sum+=a[i][j];
				}
			a[i][4] = sum;
			a[i][5] = sum/3;
			total[i] = sum;
		}
		
		//학생의 석차를 계산
		/*for (int i=0; i<total.length; i++) {		
			for (int j=0; j<total.length-1-i; j++) {
				if(total[j]<total[j+1]) {
					int t = total[j];
					total[j] = total[j+1];
					total[j+1] = t;				
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				if (total[i]==a[j][4]) {
					a[j][6]=i+1;
				}
			}
		}*/
		
		for(int i=0; i<a.length; i++) {
			int rank = 1;
			for(int j=0; j<a.length; j++) {
				if(a[i][4]< a[j][4]) {
					++rank;
				}
			}
			a[i][6] = rank;
		}
				
		//학생의 전체 결과 출력
		for (int i=0; i<title.length; i++) {
			System.out.printf("%6s", title[i]);
		}
		System.out.println();
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.printf("%6d", a[i][j]);
			}
			System.out.println();
		}	
				
		sc.close();
	}
}
