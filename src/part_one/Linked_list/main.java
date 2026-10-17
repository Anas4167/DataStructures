package part_one.Linked_list;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
       var list = new LinkedList();
       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
       list.addLast(40);
        System.out.println(list.getKthFromTheEnd(4));


    }

}
