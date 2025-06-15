package aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        list1.add("naga");
        list1.add("hari");
        list1.add("sorna");
        list1.add("panda");
        System.out.println(list1);

        list1.remove("sorna");
        System.out.println(list1);

        for (Object o: list1){
            System.out.println( o );
        }

        list1.clear();
        System.out.println(list1);

        System.out.println(list1.isEmpty());

    }
}
