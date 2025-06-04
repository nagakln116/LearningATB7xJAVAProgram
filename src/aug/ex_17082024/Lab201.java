package aug.ex_17082024;

public class Lab201 {
    //Nested class
}
class OuterClass {
    Integer a = 10; // This can be used in the Innerclass
    void m1 () {
    }

    class InnerClass {
    Integer b = 20; // this cannot be accessed in the Outerclass
        void m2(){
            System.out.println(a);
            OuterClass oc1 = new OuterClass();
            oc1.m1();
        }
    }
}