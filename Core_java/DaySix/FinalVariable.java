package DaySix;


class MathConstants {
    static final double PI = 3.14159265359;
    static final double E = 2.71828;
}

public class FinalVariable {
    public static void main(String[] args) {
        System.out.println("PI: " + MathConstants.PI);
        System.out.println("E: " + MathConstants.E);
        // MathConstants.PI = 3.14; // Error: Cannot assign a value to a final variable
    }
}
