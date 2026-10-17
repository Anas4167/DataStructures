package part_one.Bog_O;

public class quadratic {
    public static void main(String[] args) {
        String[] names = {"anas", "ahmed", "ali"};

        log(names);
    }

    public static void log(String[] names){
        //O(n**2)
        for (String first: names)
            for (String second: names)
                System.out.println(first + ", " + second);


    }
}
