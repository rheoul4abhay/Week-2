package main.MultiLevelInheritance.OnlineRetailOrderManagement;
import java.util.ArrayList;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("Iphone", "01/01/2025");
        ShippedOrder shippedOrder = new ShippedOrder("Iphone", "01/01/2025", 12345);
        DeliveredOrder deliveredOrder = new DeliveredOrder("Iphone", "01/01/2025", 12345, "15/01/2025");

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order);
        orders.add(shippedOrder);
        orders.add(deliveredOrder);

        for(Order o: orders){
            o.getOrderStatus();
        }
    }
}
