package main.MultiLevelInheritance.OnlineRetailOrderManagement;

public class Order {
    String orderID;
    String orderDate;

    public Order(String orderID, String orderDate){
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("\nStatus -> Initiated");
        System.out.println("Order ID -> " + orderID);
        System.out.println("Order Date -> " + orderDate);
    }
}
