//Program to demonstrate  continue statement
package DayTwo;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int k = 5; k < 20; k++)
		{
		// Odd numbers are skipped
		if (k%2 == 0)
		continue;
		// Even numbers are printed
		System.out.print(k + " ");
		}
	}
}
