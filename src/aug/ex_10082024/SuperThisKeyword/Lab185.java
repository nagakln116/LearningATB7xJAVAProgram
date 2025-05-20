package aug.ex_10082024.SuperThisKeyword;

public class Lab185 {

}
class Person1 {
    public Person1() {
        System.out.println("Person1 - DC");
    }

    public Person1(String name) {
        System.out.println("Person1 - PC1");
    }

    public Person1(String name, int age) {
        System.out.println("Person1 - PC2");
    }
}
class Student1 extends Person1 {
    public Student1 (String name) {
        System.out.println("Student1 - PC1");
    }
    public Student1 (){
       // super(); // This is called constructor chaining; calling a constructor of parent class inside a constructor of child class
        super("Naga"); //multiple super is not allowed in a constructor
        //super("Naga",37);
        //this("thisNaga");
    }
}
