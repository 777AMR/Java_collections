package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        //        HashMap -----> когда не важен порядок ключ*значение
        Map<Integer, String> map = new HashMap<>();
//        1. Добавление

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");

//        System.out.println(map);

//        2. Добавление с существ. ключом
//        map.put(3, "Другое значение для ключа 3");
//        System.out.println(map);

//        3. Получение по ключу
//        System.out.println(map.get(1));

//        4. Вывод элементов в цикле
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
