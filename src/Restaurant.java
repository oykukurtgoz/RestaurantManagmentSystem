import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
    String restaurantName;
    String adress;
    double phoneNumber;
    private ArrayList<Employee> employeeList = new ArrayList<>();
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private ArrayList<Order> orders;

    HashMap <String, Integer> itemStock;

    public Restaurant(String restaurantName, String adress, double phoneNumber) {
        this.restaurantName = restaurantName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.itemStock = new HashMap<>();
        this.orders = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
    public void updateEmployeeName(String id, String name){
        for (int i=0; i<employeeList.size(); i++) {
            while (employeeList.get(i).getId() == id){
               employeeList.get(i).setName(name);
            }
            break;
        }

    }
    public void updateEmployeeLastName(String id, String lastName){
        for (int i=0; i<employeeList.size(); i++) {
            while (employeeList.get(i).getId() == id){
                employeeList.get(i).setLastName(lastName);
            }
            break;
        }
    }
    public void updateEmployeePosition(String id, String position){
        for (int i=0; i<employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id){
                employeeList.get(i).setPosition(position);
            }
            break;
        }
    }
    public void updateEmployeeSalary(String id , double salary){
        for (int i=0; i<employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id){
                employeeList.get(i).setSalary(salary);
            }
            break;
        }
    }
    public void takeOrder(Order order){
        orders.add(order);
        System.out.println("Received order");
        for (MenuItem item : order.getOrderedItems()) {
            reduceStock(item.getName(), 1);
        }
    }
    public void takePayment(Order order, Payment payment){
        if (orders.contains(order)) {
            System.out.println("Payment received: " + payment.getAmount() + " " + payment.getCurrency());
            orders.remove(order);
        } else {
            System.out.println("Could not find order.");
        }
    }
    public void increaseStock(String itemKey, int quantity){
        if (itemStock.containsKey(itemKey)){
            int currentQuantity = itemStock.get(itemKey);
            itemStock.put(itemKey, currentQuantity + quantity);
        }else {
            itemStock.put(itemKey,quantity);
        }
    }
    public void reduceStock(String itemKey, int quantity){
        if (itemStock.containsKey(itemKey)) {
            int currentQuantity = itemStock.get(itemKey);
            if (currentQuantity >= quantity) {
                itemStock.put(itemKey, currentQuantity - quantity);
                System.out.println(quantity + " amount of " + itemKey+ " reduced from stock.");
            } else {
                System.out.println("There is not enogh " + itemKey );
            }
        } else {
            System.out.println( " There is no " + itemKey );
        }
    }

    public void addMenuItem(String id, String name, double price, int quantity){
        MenuItem menuItem = new MenuItem(id, name, price, quantity);
        menuItems.add(menuItem);
        increaseStock(menuItem.getName(),quantity);
    }
    public void removeItem(String itemId){
        for(int i=0; i<menuItems.size(); i++){
            if (menuItems.get(i).getItemId() == itemId){
                menuItems.remove(menuItems.get(i));
                itemStock.remove(menuItems.get(i).getName());
            }
            break;
        }
    }
    public void updateItemsName(String itemId, String name){
        for(int i=0; i<menuItems.size(); i++){
            if (menuItems.get(i).getItemId() == itemId){
                menuItems.get(i).setName(name);
            }
            break;
        }
    }
    public void updateItemsPrice(String itemId, Double price){
        for(int i=0; i<menuItems.size(); i++){
            if (menuItems.get(i).getItemId() == itemId){
                menuItems.get(i).setPrice(price);
            }
            break;
        }
    }

}
