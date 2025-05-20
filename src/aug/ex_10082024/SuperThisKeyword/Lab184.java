package aug.ex_10082024.SuperThisKeyword;

public class Lab184 {
    public static void main (String [] args) {
        Student s1 = new Student();
        s1.message();
        s1.display();
    }

}
class Student extends Person{
    @Override
    void message (){
        System.out.println("I am a Student");
    }
    void display () {
        super.message();
        this.message();
    }
}

class Person {
    void message (){
        System.out.println("I am a person");
    }
        }