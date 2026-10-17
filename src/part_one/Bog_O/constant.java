
package part_one.Bog_O;

public class constant {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        log(numbers);
    }

    public static void log(int[] numbers) {
        // O(1) - Constant Time
        System.out.println(numbers[0]);
    }
}