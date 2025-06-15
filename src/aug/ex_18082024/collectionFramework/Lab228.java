package aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab228 {
    public static void main(String[] args) {
//            List myList = new ArrayList();
//            ArrayList myArrayList = new ArrayList();
//            Collection myCollection = new ArrayList();
            // All the above 3 are correct
            ArrayList list2 = new ArrayList();
            list2.add("Pramod");
            list2.add("Naga");
            list2.add("Hari");
            list2.add("Sori");
            list2.add(1235);   //We can have a mix of datatype
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.contains("Naga"));
        System.out.println(list2.get(1));
        String s1 = (String) list2.get(2); //Type casting is needed
        System.out.println(s1);
        Integer i1 = (Integer) list2.get(4);
        System.out.println(i1);
    }
}
