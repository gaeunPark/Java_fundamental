
class Tv {
	// 멤버 변수
	String color;
	boolean power;
	int channel;
	
	//멤버 메소드
	void power() {
		power=!power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

public class Tvtest {
	
	public static void main(String[] args) {
		Tv tv1=new Tv();
		
		tv1.color="RED";
		tv1.power();
		tv1.channel= 9;
		tv1.channelUp();
		tv1.channelUp();
		
		System.out.println("tv1의 색상은 "+ tv1.color + "입니다. ");
		System.out.println("tv1의 전원은 "+ (tv1.power==true ? "ON":"OFF")+"상태입니다. ");
		System.out.println("tv1의 채널은 "+ tv1.channel + "입니다. ");
		
		System.out.println();
		// tv2 인스턴스
		Tv tv2=new Tv();	
		tv2.color="BLACK";
		tv2.power();
		tv2.channel=18;
		tv2.channelDown();
		tv2.channelDown();
		
		System.out.println("tv2의 색상은 "+ tv2.color + "입니다.");
		System.out.println("tv2의 채널은 "+ tv2.channel+ "입니다. ");
		System.out.println("tv2의 전원은 "+ (tv2.power==true ? "ON":"OFF")+"입니다.");
		
		// 참조변수의 변경
		System.out.println();
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t2=t1;	//t1이 참조하는 것을 t2도 참조하게 한다.
		t1.channel=7;
		System.out.println("t1의 채널 값은 "+ t1.channel+ "입니다. ");
		System.out.println("t2의 채널 값은 "+ t2.channel+ "입니다. ");
	
	}
}

