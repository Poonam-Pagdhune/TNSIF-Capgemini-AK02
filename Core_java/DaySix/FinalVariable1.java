package DaySix;

class FinalExample{
	static final int value1 = 15;
	static final int value2 = 15;
	
}
public class FinalVariable1 {
	public static void main(String args[]) {
		/*Error: Cannot assign a value to a final variable
		FinalExample.value1 = 9;
		FinalExample.value2 = 8;
		*/
		
		int total = FinalExample.value1 + FinalExample.value2;
		System.out.println(total);
	}
}
