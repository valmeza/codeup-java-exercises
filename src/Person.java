public class Person {

//    public Person(String john) {
//    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Val");
        person1.sayHello();
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name + "!");
    }

}
