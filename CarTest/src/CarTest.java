
class Car{
	int serialNo;
	String color;
	String gearType;
	int door;
	static int count=0;
	
	// 인스턴트 초기자
	{
		serialNo = ++count;
	}
	
	// 디폴트 생성자
	Car() {
		this.color = "black";
		this.gearType = "auto";
		this.door = 4;
//		serialNo = ++count;
	}
	
	Car(String color){
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
//		serialNo = ++count;
	}
	
	// 매개변수를 받는 생성자
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = "auto";
		this.door = door;
//		serialNo = ++count;
	}
	
	// 매개변수를 받는 생성자
	Car(Car c){
		this(c.color, c.gearType, c.door);
//		serialNo = ++count;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red", "auto", 4);
		
		Car c3 = new Car("blue");
		
		Car c4 = new Car(c3);
		
		System.out.println("c1의 serialNo=" + c1.serialNo + ", color=" + c1.color + ", gearType=" 
					+ c1.gearType+ ", door=" + c1.door);
		System.out.println("c2의 serialNo=" + c2.serialNo + ", color=" + c2.color + ", gearType=" 
					+ c2.gearType + ", door="+ + c2.door);
		System.out.println("c3의 serialNo=" + c3.serialNo + ", color=" + c3.color + ", gearType=" 
				+ c3.gearType + ", door="+ + c3.door);
		System.out.println("c4의 serialNo=" + c4.serialNo + ", color=" + c4.color + ", gearType=" 
				+ c4.gearType + ", door="+ + c4.door);
	}
}

