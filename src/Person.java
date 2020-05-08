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
    } // setter : void we are not returning we are setting something.

    public void sayHello() {
        System.out.println("Hello " + getName() + "!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Valeria");
        person1.sayHello();
    }
}
