package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // head -> [1|] -> [2|] -> [3|] -> [4|] -> null    spisok
//        linkedList.add(1);
//        linkedList.get(0);
//        linkedList.size();
//        linkedList.remove(0);
        List<Integer> arrayList = new ArrayList<>();
        // [1][2][3][4][5][6][7][8] massiv

        measureTime(linkedList);
        measureTime(arrayList);

    }

    private static void measureTime(List<Integer> list) {

//        //1. Добавление***************************************************
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        [] -> [0] -> [0][1] -> [0][1][2]
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


//        //2. Чтение********************************************************
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list.get(i);
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        //3. Добавление в начало листа****************************************
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
//        //        [] -> [0] -> [1][0] -> [2][1][0]
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
