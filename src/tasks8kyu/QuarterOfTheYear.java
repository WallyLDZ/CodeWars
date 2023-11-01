package tasks8kyu;

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        double x = month / 3.0d;

        if (x <= 1) {
            return 1;
        } else if (x <= 2) {
            return 2;
        } else if (x <= 3) {
            return 3;
        } else {
            return 4;
        }
    }
}
