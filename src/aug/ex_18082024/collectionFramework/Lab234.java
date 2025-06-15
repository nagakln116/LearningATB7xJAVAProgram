package aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Naga");
        mylist.add("Sorna");
        System.out.println("---To Print Arraylist we can use for each------");

        for (String s: mylist){
            System.out.println(s);
        }

        System.out.println("---To Print Arraylist we can use for loop---");

        for (int i = 0; i < mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("---To print Arraylist we can use ITERATOR also---");

        Iterator<String>  its = mylist.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }
    }
}
