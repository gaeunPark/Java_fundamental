
public class Test08 {
	
	public static void main(String[] args) {
		
		int a=37, b=25;
		System.out.println("a&b= " + (a&b));
		System.out.println("a|b= " + (a|b));
		System.out.println("a^b= "+ (a^b));
		
		int c=53, d=36;
		System.out.println("c&d= " +(c&d));
		System.out.println("c|d= " + (c|d));
		System.out.println("c^d= "+ (c^d));
		
		int x=4, y=64;
		System.out.println(x<<4);
		System.out.println(y>>3);
		
		int a2=30, b2=10, c2;
		c2=(a2>b2)?a2:b2;
		System.out.println(c2);
		
		if (a2>b2) {
			System.out.println(a2);
		} else {
			System.out.println(b2);
		} 
		
	}

}
