package tasks8kyu;
/**
Take an array and remove every second element from the array.
Always keep the first element and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
*/

public class RemovingElements {


    public static Object[] removeEveryOther(Object[] arr ) {
        Object[] result = new Object[(arr.length + 1) / 2];
        for (int i = 0; i < arr.length; i += 2) {
            result[i / 2] = arr[i];
        }
        return result;

    }
}
