package aug.ex_11082024.ExampleInterface;


public class Lab191 {
    public static void main (String [] args) {
      //  I i = new I(); //creating object for an interface is not possible
    }
}

interface I {} //
class A{} //concrete class
class B{} //concrete class
abstract class C{}
class Test1 extends A {} //single inheritance
class Test2 extends B {} //single inheritance
//class Test3 extends A,B {} //this is not possible as it is multiple inheritance
class Test0 implements I {}
interface I1{}
interface I2{}
class Test4 implements I,I1,I2 {} //Multiple inheritance is possible with interfaces
class Test5 extends A implements I,I1,I2 {} //Multiple inheritance with multilevel inheritance is possible because of Interface
//class Test6 implements I extends I1 {} // Not possible because an extends should be first
class D{}
//interface I3 extends D {} //not possible because an Interface should extend only another interface not a concrete class
//interface I3 extends C{} //not possible because an Interface should extend only another interface not an abstract class
interface I4 extends I1,I2{} //interface can extend other interfaces