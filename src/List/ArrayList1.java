package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
//
//      1. получение по индексу
        System.out.println(list.get(0));
        System.out.println(list.get(99));

//      2. вывод размера
        System.out.println(list.size());

//      3. перебор в циклах
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer x : list) {
            System.out.println(x);
        }

//      4. удаление
        list.remove(5);
        System.out.println(list);

        //мы проводим много удалений из нашего листа
        list = new LinkedList<>();

    }

}
