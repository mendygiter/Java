import java.util.ArrayList;

public class Order {

// Order variable
    private String name;
    private Boolean ready;
    private ArrayList<Item> items;

	public ArrayList<Item> getItems() {
		return this.items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getReady() {
		return this.ready;
	}

	public void setReady(Boolean ready) {
		this.ready = ready;
	}


    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
    }

    public void addItem(Item product) {
        items.add (product);
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you, for waiting";
        }
    }
    public double getOrderTotal() {
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }

        return total;
    }
}