package part_one.Arrays;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        working_with_array number = new working_with_array(3);
        number.insert(10);
        number.insert(20);
        number.insert(30);
        number.insert(40);
        System.out.println(number.indexOf(10));
        number.print();

        // Question one
        Exercise numbers = new Exercise(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(500);
        numbers.insert(60);

        int results = numbers.max();
        System.out.println("the largest item is: "+ results);

        //question two

        int[] other = {20, 30, 40};

        int[] result = numbers.intersect(other);

        System.out.println(java.util.Arrays.toString(result));

        //question three
        Exercise num = new Exercise(4);

        num.insert(1);
        num.insert(2);
        num.insert(3);
        num.insert(4);

        System.out.println("Original array:");
        num.print();

        num.reverse();

        System.out.println("Reversed array:");
        num.print();

        //question four
        Exercise item = new Exercise(4);

        item.insert(10);
        item.insert(20);
        item.insert(30);

        item.insertAt(15, 1);
        System.out.println("enter 15 at index 1:");
        item.print();

    }
}
