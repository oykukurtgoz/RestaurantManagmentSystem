import java.util.ArrayList;

public class Order {
    private ArrayList <MenuItem> orderedItems;
    private double totalPrice;
    private Customer customer;

    public Order(ArrayList <MenuItem> orderedItems, Customer customer) {
        this.orderedItems = new ArrayList<>(orderedItems);
        this.totalPrice = calculatePrice();
        this.customer = customer;
    }

    public ArrayList<MenuItem> getOrderedItems() {
        return orderedItems;
    }

    public void addOrderedItem(MenuItem item){
        orderedItems.add(item);
    }
    public void removeOrderedItem(MenuItem item){
        orderedItems.remove(item);
    }
    public double calculatePrice(){
        totalPrice = 0;
        for (int i =0; i<orderedItems.size(); i++){
            totalPrice += orderedItems.get(i).getPrice();
        }
        return totalPrice;
    }
}
