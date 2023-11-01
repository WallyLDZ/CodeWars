package tasks8kyu;

/*Given a random non-negative number, you have to return the digits of this number within an array in reverse order.*/
public class Digitize {
    public static int[] digitize(long n) {
        // Code here
        String numStr = String.valueOf(n);
        int[] digits = new int[numStr.length()];
        int counter = 0;

        for (int i = numStr.length() - 1; i >= 0; i--) {
            digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
        }
        return digits;

    }
}
