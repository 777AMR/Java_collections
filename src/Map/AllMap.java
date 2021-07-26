package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMap {
    public static void main(String[] args) {
        //внутри не гарантируется никакого порядка
        Map<Integer, String> hashMap = new HashMap<>();

        //в каком порядке пары (ключ *значение) были добавлены, в таком порядке они и вернутся
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //в пары(ключ*значение) сортируется по ключу(естественный порядок)
        Map<Integer, String> treeMap = new TreeMap<>();//в пары(ключ*значение) сортируется по ключу(естественный порядок)

        testMap(hashMap, "hashMap");
        testMap(linkedHashMap, "linkedHashMap");
        testMap(treeMap, "treeMap");
    }

    public static void testMap(Map<Integer, String> map, String typeMap) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "George");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(typeMap + ": " + entry.getKey() + " : " + entry.getValue());
        }
    }

}
