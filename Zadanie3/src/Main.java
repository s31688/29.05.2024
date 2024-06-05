import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item("AX12", "A");
        Item item2 = new Item("AX23", "B");
        Item item3 = new Item("AX34", "C");
        Item item4 = new Item("AX45", "D");
        Item item5 = new Item("AX56", "E");
        Item item6 = new Item("AX67", "F");
        Item item7 = new Item("AX78", "G");
        Item item8 = new Item("AX89", "H");
        Item item9 = new Item("AX90", "I");
        Item item10 = new Item("AX01", "J");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);

        HashSet<Item> lessItemsList = new HashSet<>(items.subList(0, 5));

        for(Item item : lessItemsList) {
            System.out.println(item.getID());
        }
    }
}