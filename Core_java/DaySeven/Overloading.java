package DaySeven;

public class Overloading {
	void print(int num){
		System.out.println("Integer : "+ num);
	}
	
	void print(double num) {
		System.out.println("Double : "+ num);
	}
	
	public static void main(String args[]) {
		Overloading o = new Overloading();
		o.print(38);
		o.print(67.8);
	}
}
