package Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("afafaf");
        list.get(0);
        list.remove(0);
        for (String item: list) {
            System.out.println(item);
        }


        Set<String> set = new HashSet<String>();
        set.add("vvvvvvvvvvv");


    }
}
