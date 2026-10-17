package part_one.Arrays;

import java.lang.reflect.Array;

public class Exercise {
    private int[] items;
    private int count;

    public Exercise(int length){
        items = new int[length];
    }
    public void insert(int item){
        //if the array is full resize the array
        if (items.length == count) {
            //create new array
            int[] newItems = new int[count * 2];
            //coppy all existing items
            for (int i = 0 ; i < count; i++ )
                newItems[i] = items[i];
            //set items to this new array
            items = newItems;
        }
        //add new item to the end
        items [count++] = item;
    }
    public boolean contains(int item) {

        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return true;
            }
        }

        return false;
    }

    //question one
    public int max() {
        // Start by assuming the first item is the largest
        int num = items[0];
        // Loop through all inserted items in the array
        //the run time complexity  is O(n)
        for (int i = 0; i < count; i++)
            // Check if the current item is greater than the largest found so far
            if (items[i] > num) {
                // Update num with the new largest item
                num = items[i];
            }
        // Return the largest item found
        return num;
    }

    //questions two


    public int[] intersect(int[] other) {
        int[] result = new int[count];
        int size = 0;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < other.length; j++) {
                if (items[i] == other[j]) {
                    result[size] = items[i];
                    size++;
                    break;
                }
            }
        }

        return java.util.Arrays.copyOf(result, size);
    }

    //question three
    public void reverse(){
        for (int i = 0 ; i < count / 2; i++) {
            int temp = items[i];
            items[i] = items[count - 1 - i];
            items[count - 1 - i] = temp;
        }
    }

    //question four
    public void insertAt(int item, int index) {

        // Check whether the index is valid
        if (index < 0 || index > count) {
            throw new IllegalArgumentException("Invalid index");
        }
        // If the array is full, increase its capacity
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            // Copy existing items into the new array
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        // Shift items one position to the right
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        // Insert the new item at the given index
        items[index] = item;
        // Increase the number of inserted items
        count++;
    }

    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }


}
