package jul.ex_28072024;

public class Lab154 {
    public static void main(String[] args) {

    //OOPS concept is to solve real life problem
    //It considers every thing as object with some attributes and behaviour
    //For example,a human has the following attribute and behaviour
    //Attribute --> 2 hands, eye colour, nose mouth, height, weight, body type
    //behaviour --> walk talk eat sleep

    // This attribute and behaviour is called Class (properties and methods)
    // So we can create a class and use it across for all objects of the class

    // We have a class named person with few attributes and behaviour
    // Lets create an object for the class so we can utilize the class

    Person person1 = new Person();
    person1.name = "Naga";
    person1.gender = "Male";
    person1.number_of_hands = 2;
    person1.walk();
    person1.talk();
    person1.sleep();
        System.out.println(person1.name);
        System.out.println(person1.gender);
        System.out.println(person1.number_of_hands);

        // Similarly we can create number of objects for the same class
        Person person2 = new Person();
        person2.name = "Hari";
        person2.gender = "Male";
        person2.number_of_hands = 2;
        System.out.println(person2.name);
        System.out.println(person2.gender);
        System.out.println(person2.number_of_hands);
}
}
