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

        System.out.println(findMangoSeller(map));

    }

    public static boolean findMangoSeller(Map<Person, Person[]> map){
        Deque<Person> searchDeque = new ArrayDeque<>(Arrays.stream(map.get(new Person("you"))).toList());
        Set<Person> searched = new HashSet<>();

        while (!searchDeque.isEmpty()){
            Person person = searchDeque.pop();

            if(!searched.contains(person)){
                searched.add(person);
                if(person.isMangoSeller()){
                    System.out.println(person.getName() + " is a mango seller!");
                    return true;
                } else {
                    searchDeque.addAll(Arrays.stream(map.get(person)).toList());
                    System.out.println(person.getName() + " is not a mango seller");
                }
            } else{
                System.out.println("A duplicate element has been removed");
            }

        }

        System.out.println("No one is a mango seller");
        return false;
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

    public String getName(){
        return name;
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

