package Set;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        //Set - Множество
        //Только уникальные элементы
        Set<Person> set = new HashSet<>();

        Person p1 = new Person(1, "Mike");
        Person p2 = new Person(1, "Mike");

        map.put(p1, "123");
        map.put(p2, "123");

        set.add(p1);
        set.add(p2);

        System.out.println(map);
        System.out.println(set);
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}