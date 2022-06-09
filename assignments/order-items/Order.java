import java.util.ArrayList;

public class Order {

// Order variable
    public String name;
    public Double total;
    public Boolean ready;
    public ArrayList<Item>items;

    public Order() {
        // this.name = name;
        this.total = 0.00;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
}
