package main.MultiLevelInheritance.OnlineRetailOrderManagement;

public class ShippedOrder extends Order{

    int trackingNumber;
    
    public ShippedOrder(String orderID, String orderDate, int trackingNumber){
        super(orderID, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public void getOrderStatus(){
        System.out.println("\nStatus -> Shipped ");
        System.out.println("Order ID -> " + orderID);
        System.out.println("Order Date -> " + orderDate);
        System.out.println("Tracking number -> " + trackingNumber);
    }
}
