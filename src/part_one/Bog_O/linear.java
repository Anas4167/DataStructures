package part_one.Bog_O;

public class linear {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        log(numbers);

    }
    public static void log(int[] numbers) {
        // O(n)
        for (int number : numbers ){
            System.out.println(number);
        }
    }
}
