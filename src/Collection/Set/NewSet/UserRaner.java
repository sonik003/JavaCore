package Collection.Set.NewSet;

import Collection.Set.NewSet.User;

import java.util.*;

public class UserRaner {

//    /*арай лист для каждого елемента имеет индекс
//    * мы може получить индекс по ключу, линкед лист
//    * роботает по ссылкам,
//    * Что будет быстрее роботать арайлист или линкедлист
//    * когда вы вставляете новый элемент в нутрь колекции ?
//    * Линкед лист! но будет занимать больше памяти,
//    * нужно хранить инфу про обект спереди, сзади, о наале и конце
//    * колекции
//    * КАКОЕ ВРЕМЯ ПОИСКА ПО ИНДЕКСУ ПО ЛИНКЕД ЛИСТЕ?
//     * ленейная зависимость чем больше колекция тем больше времени
//     * но он двухнаправленый, можно сделать поиск как сначала так и с конца
//     * n\2*/

    public static void main(String[] args) {
        // =================== LIST ============================
//        List<User> users = new ArrayList<User>(); //ArrayList<>(), HashSet<>(), LinkedList<>()
//        users.add(new User("1","first"));
//        users.add(new User("2","two"));
//        users.add(new User("1","first"));
//
//        for (User user: users) {
//           System.out.println(user);
//       }

        // =================== SET ============================

//        Set<User> users = new HashSet<User>(); //ArrayList<>(), HashSet<>(), LinkedList<>()
//        users.add(new User("1","first"));
//        users.add(new User("2","two"));
//        users.add(new User("1","first"));
//
//        for (User user: users) {
//            System.out.println(user);
//        }

        // =================== MAP ============================
        // зависимость он константы
        Map<String, User> users = new HashMap<String, User>();
        users.put("1", new User("1", "first"));
        users.put("2", new User("2", "first"));
        users.put("1", new User("1", "first"));

        for(Map.Entry<String, User> user: users.entrySet()){
            System.out.println(user);
        }
    }
}
