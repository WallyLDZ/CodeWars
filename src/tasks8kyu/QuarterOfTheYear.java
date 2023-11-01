package tasks8kyu;

/*iven a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June),
 is part of the second quarter; and month 11 (November), is part of the fourth quarter.*/
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
