package aug.ex_18082024.collectionFramework;

import java.util.List;

public class Lab229 {
    public static void main(String[] args) {
        List shoppingList = List.of("Milk","Bread","Butter","Cheese");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());
        shoppingList.add("Paneer"); // Cannot add as add is an incomplete method
    }
}
