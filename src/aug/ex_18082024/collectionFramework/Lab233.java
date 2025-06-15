package aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab233 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList(); //explicit mentioning the type of list helps us to restrict other types
        marks.add(80);
        marks.add(85);
        marks.add(70);
        marks.add(90);
        marks.add(60);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

    }
}
