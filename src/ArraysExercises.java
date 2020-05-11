import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // this will the return the address of numbers
        System.out.println(Arrays.toString(numbers)); // using Arrays.toString() returns the actual elements of the number array
//        String[] person = new String[3];
//
//        Person person1 = new Person("Valeria");
//        Person person2 = new Person("Leo");
//        Person person3 = new Person("Gina");
//
//        person[0] = person1.getName(); // This grabs the string
//        person[1] = person2.getName();
//        person[2] = person3.getName();

        Person[] person = new Person[3];

        person[0] = new Person("Valeria");
        person[1] = new Person("Leo");
        person[2] = new Person("Gina");

        //sout: to better understand what is happening.
//        System.out.println(person); // returns address and not the element or value
//        System.out.println(Arrays.toString(person)); // returns the elements in the array

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName());
        }

        person = addPerson(person, new Person("Mom"));

        for(Person people : person) {
            System.out.println("From simple loop: " + people.getName());
        }
//        addPerson();
    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPersonArray = new Person[people.length + 1];

        for(int i = 0; i < people.length; i++) {
            newPersonArray[i] = people[i];
        }

        newPersonArray[newPersonArray.length-1] = person;
        return newPersonArray;
    }
    //    static void addPerson() {
//        String[] person = new String[3];
//        Person person1 = new Person("Val");
//        Person person2 = new Person("Leo");
//        Person person3 = new Person("Gina");
//
//        person[0] = person1.getName();
//        person[1] = person2.getName();
//        person[2] = person3.getName();
//        System.out.println("add person " + Arrays.toString(person));
//
//        person = Arrays.copyOf(person, person.length + 1);
//
//        Person person4 = new Person("Rando");
//        person[3] = person4.getName();
//
//        System.out.println("New person added: " + Arrays.toString(person));
}
