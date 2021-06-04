package Sort.Comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //1.
        List<String> animals = new ArrayList<>();
        animals.add("catas");
        animals.add("cat");
        animals.add("dog");
        animals.add("dg");
        animals.add("bird");
        animals.add("frog");
        animals.add("a");
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);
        //2.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5000);
        numbers.add(355);
        numbers.add(1);
        numbers.add(0);
        numbers.add(100);
        numbers.add(500);
        Collections.sort(numbers, (o1, o2) -> {
            if (o1 > o2) {
                return 1;
            } else if (o1 < o2) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(numbers);
        //3.
        List<Person2> people = new ArrayList<>();
        people.add(new Person2(1, "Bob"));
        people.add(new Person2(3, "Tom"));
        people.add(new Person2(2, "Mike"));


        Collections.sort(people, (o1, o2) -> {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //о1 > o2 = 1
        //о1 < o2 = -1
        //о1 = o2 = 0
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Person2 {
    private int id;
    private String Name;

    public Person2(int id, String name) {
        this.id = id;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}