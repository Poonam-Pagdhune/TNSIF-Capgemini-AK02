package DayNine;

public class SampleStringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + ", " + str2;

        // Length of the string
        int length = result.length();

        // Substring
        String sub = result.substring(0, 5);

        System.out.println("Concatenated String: " + result);
        System.out.println("Length of String: " + length);
        System.out.println("Substring: " + sub);
    }
}
