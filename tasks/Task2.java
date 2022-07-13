//Task 2. Given a non-empty array of integers, return the result of multiplying the values together in order.

package tasks;

public class Task2 {

    public static int grow(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            result = result * x[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        System.out.println(grow(array));
    }

}
