package graphs_queues_widthsearch;

import java.util.*;

public class SearchInWidth {
    public static void main(String[] args) {
        Map<Person, Person[]> map = new HashMap<>();
        map.put(new Person("you"),
                new Person[]{
                        new Person("alice"),
                        new Person("bob"),
                        new Person("claire")});

        map.put(new Person("bob"),
                new Person[]{
                        new Person("anuj"),
                        new Person("peggy")});

        map.put(new Person("alice"),
                new Person[]{
                        new Person("peggy")});

        map.put(new Person("claire"),
                new Person[]{
                        new Person("thom"),
                        new Person("jonny")});

        map.put(new Person("anuj"), new Person[]{}); // Нет друзей

        map.put(new Person("peggy"), new Person[]{}); // Нет друзей

        map.put(new Person("thom"), new Person[]{}); // Нет друзей

        map.put(new Person("jonny"), new Person[]{}); // Нет друзей

        Deque<Person> searchDeque = new ArrayDeque<>(Arrays.stream(map.get(new Person("you"))).toList());


        while (!searchDeque.isEmpty()){
            //Person person = se
        }
    }

}

class Person{
    String name;
    boolean isMangoSeller = false;

    public Person(String name){
        this.name = name;
    }

    public boolean isMangoSeller(){
        return name.endsWith("m");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

