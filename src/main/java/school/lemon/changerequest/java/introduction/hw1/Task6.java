package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {

    public static double calculateS(double x) {
        double result = 1, dividend = 1, divisor = 1;
        for (double i = 1; i < 5; ++i) {
            dividend *= x;
            divisor *= i;
            result += dividend / divisor;
        }
        return result;
    }

    public static double calculateZ(double x, double y) {
        return Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
    }

}
