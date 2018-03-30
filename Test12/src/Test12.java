import java.util.Scanner;

public class Test12 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요. ");
		int kor=sc.nextInt();
		System.out.print("영어점수를 입력하세요. ");
		int eng=sc.nextInt();
		System.out.print("수학점수를 입력하세요. ");
		int mat=sc.nextInt();
		
		//if문
//		int sum; char grade;
//		sum=kor+eng+mat;
//		double mean=(double)sum/3;
//		if (mean>=90) {
//			grade='A';
//		} else if (mean>=80) {
//			grade='B';
//		} else if (mean>=70) {
//			grade='C';
//		} else if (mean>=60) {
//			grade='D';
//		} else {
//			grade='F';
//		}
		
		//switch문
		int sum,mean; String grade;
		sum=kor+eng+mat;
		mean=sum/3;
		switch(mean/10) {
		case 10: case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
			break;
		}
		
		//중첩 if문
		if (mean>=90) {
			grade="A";
			if (mean>=98) {
				grade +="+";
			} else if (mean<94) {
				grade +="-";
			}
		} else if (mean>=80) {
			grade="B";
			if (mean>=88) {
				grade +="+";
			} else if (mean<84) {
				grade +="-";
			} 
		} else if (mean>=70) {
			if (mean>=78) {
				grade +="+";
			} else if (mean<74) {
				grade +="-";
			}
		}
	
		sc.close();
		System.out.println("총점은 "+sum+" 평균은 "+ mean+" 성적은 "+grade);
				
	}

}
