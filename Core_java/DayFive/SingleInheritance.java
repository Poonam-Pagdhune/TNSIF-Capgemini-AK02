package DayFive;

class Parent{
	void parent(){
		System.out.println("This is parent class");
	}
}
class Child extends Parent{
	void child() {
		System.out.println("This is child class");
	}
	
}
public class SingleInheritance {
	public static void main(String agrs[]) {
		Child obj = new Child();
		obj.parent();
		obj.child();
	}
}
