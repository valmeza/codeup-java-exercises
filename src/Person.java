public class Person {

    private String name; // object

    public Person(String name) { // constructor
        setName(name);
    }

    public String getName() {
        return this.name;
    } // getter normally returns something.

    public void setName(String name) {
        this.name = name;
    } // setter : most likely always void we are not returning we are setting a value something.

    public void sayHello() {
        System.out.println("Hello " + getName() + "!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Valeria");
        Person person2 = new Person("Leo");
        Person person3 = new Person("Gina");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
    }
}
