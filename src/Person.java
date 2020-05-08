public class Person {

    private String name; // object

    public Person(String name) { // this is a constructor
        setName(name);
    }

    public String getName() {
        return this.name;
    } // getter

    public void setName(String name) {
        this.name = name;
    } // setter

    public void sayHello() {
        System.out.println("Hello " + getName() + "!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Valeria");
        person1.sayHello();
    }
}
