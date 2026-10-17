package part_one.Arrays;

public class working_with_array {
    private int[] items;
    private int count;

    public working_with_array(int length){
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

    public void remove(int index){
        //validate the index
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        //shift the item to left to fill the hole
        for (int i = index; i < count; i++ )
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item){
        //we find it , return index
        //O(1) best case
        //O(n) worse case
        // so run time complexity is O(n)
        for (int i = 0 ; i < count; i++)
            if (items[i] == item)
                return i;
        //otherwise return -1
        return -1;
    }

    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
