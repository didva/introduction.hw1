package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {

    public static double calculateS(double x) {
        double result = 1, xPow = x;
        for (int i = 1; i < 5; ++i, xPow *= x) {
            result += xPow / factorial(i);
        }
        return result;
    }

    private static int factorial(int value) {
        for (int i = value - 1; i > 1; --i) {
            value *= i;
        }
        return value;
    }

    public static double calculateZ(double x, double y) {
        return Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
    }

}
