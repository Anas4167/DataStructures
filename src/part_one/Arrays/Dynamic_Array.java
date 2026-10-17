package part_one.Arrays;

import java.util.ArrayList;

public class Dynamic_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(0);
        list.toArray();
        list.contains(20);
        System.out.println(list);
    }
}
