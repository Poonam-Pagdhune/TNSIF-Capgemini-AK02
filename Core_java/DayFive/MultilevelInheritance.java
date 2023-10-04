package DayFive;

class Addition{
	void add(int a, int b) {
		int total = a+b;
		System.out.println(total);
	}
}

class Subtract extends Addition{
	void sub(int x, int y){
		int total1 = x-y;
		System.out.println(total1);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Subtract obj = new Subtract();
		obj.add(3,4);
		obj.sub(10,3);

	}

}
