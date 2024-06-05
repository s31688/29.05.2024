public class Item {
    private String ID;
    private String name;

    public Item(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(this.name);
    }
}