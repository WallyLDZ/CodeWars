package tasks8kyu;

/*
 * Create a function that takes an integer as an argument and returns for even numbers or for odd numbers."Even""Odd"
 * */
public class EvenOrOdd {

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

