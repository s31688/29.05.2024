import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item("AX12", "A");
        Item item2 = new Item("AX23", "B");
        Item item3 = new Item("AX34", "C");
        Item item4 = new Item("AX45", "D");
        Item item5 = new Item("AX56", "E");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<String, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getID(), item.getName());
        }

        System.out.println("Items map: " + itemsMap.entrySet());
    }
}