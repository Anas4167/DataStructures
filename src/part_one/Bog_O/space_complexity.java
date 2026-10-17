package part_one.Bog_O;

public class space_complexity {
    public static void main(String[] args) {
        String[] names = {"anas", "ahmed", "ali"};
        log(names);
    }

    public static void log(String[] names){
        //O(1) space
        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++){
            System.out.println("hi" + " " + names[i]);
        }
    }
}
