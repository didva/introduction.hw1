package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

}
