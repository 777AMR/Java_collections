package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);

        // union - объединение множеств
        Set<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet2);
        System.out.println("union: " + union);

        //intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(hashSet2);
        System.out.println("intersection: " + intersection);

        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet);
        difference.removeAll(hashSet2);
        System.out.println("difference: " + difference);


//        Set<String> hashSet = new HashSet<>();
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        TreeSet<String> treeSet = new TreeSet<>();
//        hashSet.add("Mike");
//        hashSet.add("Katy");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");
//        hashSet.add("Zelda");

//        System.out.println(hashSet);
//
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("Tim"));
//
//        System.out.println(hashSet.isEmpty());

//        1.hashSet
//        hashSet.add("Mike");
//        hashSet.add("Katy");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");
//        for (String name : hashSet) {
//            System.out.println(name);
//        }

//        2.linkedHashSet
//        linkedHashSet.add("Mike");
//        linkedHashSet.add("Katy");
//        linkedHashSet.add("Tom");
//        linkedHashSet.add("George");
//        linkedHashSet.add("Donald");
//
//        for (String name : linkedHashSet) {
//            System.out.println(name);
//        }

//        3.treeSet
//        treeSet.add("Mike");
//        treeSet.add("Katy");
//        treeSet.add("Tom");
//        treeSet.add("George");
//        treeSet.add("Donald");
//
//        for (String name : treeSet) {
//            System.out.println(name);
//        }
    }
}
