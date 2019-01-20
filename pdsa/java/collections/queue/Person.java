package pdsa.collections.queue;

public class Person implements Comparable<Person> {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id   = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{id: " + id + ", name: " + name + "}";
    }

    @Override
    public int compareTo(Person person) {
        return (id == person.id) ? 0 : (id > person.id) ? 1 : -1;
    }
}
