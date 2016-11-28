package school.lemon.changerequest.java.introduction.hw1;

public class Task5 {

    public static double calculateA(double x, double y, double z) {
        double dividend = 2 * Math.sin(x - Math.PI / 6) * calculateB(z);
        double divisor = 1 / 2. + Math.pow(Math.sin(y), 2);
        return dividend / divisor;
    }

    private static double calculateB(double z) {
        double zSquare = Math.pow(z, 2);
        double divisor = 3 + zSquare / 5;
        return 1 + zSquare / divisor;
    }

}
