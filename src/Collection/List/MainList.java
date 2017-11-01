package Collection.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(2); // 0
        list.add(5); // 1

        //list.remove(0);

//        for (int n:list) {
//            System.out.println(n);
//        }

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        boolean empty = list.isEmpty(); // пуста ли колекция
        System.out.println(empty); //  если false то полная

    }
}
