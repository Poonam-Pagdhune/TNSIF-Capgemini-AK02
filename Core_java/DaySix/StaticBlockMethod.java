package DaySix;

class Add{
	static {
		int value1 = 10;
		float value2 = 20;
		float total = value1 + value2 ;	
		System.out.println(total);
	}
}

class Sub extends Add{
	static {
		int value1 = 20;
		float value2 = 5;
		float total = value1 * value2;
		System.out.println(total);
	}
}
public class StaticBlockMethod {
	public static void main (String arge[]) {
		Sub s = new Sub();
		
	}
}
