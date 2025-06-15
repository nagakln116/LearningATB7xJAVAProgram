package aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab235 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList();
        mylist1.add("Naga");
        mylist1.add("Sorna");
        mylist1.add("Hari");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("Naga");
        v.add("Sorna");
        v.add("Hari");
        System.out.println(v);
        // Vector is similar to List, but it is Legacy class. It is time consuming because it is thread safe and synchronized


    }
}
