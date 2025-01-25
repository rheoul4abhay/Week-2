package main.MultiLevelInheritance.OnlineRetailOrderManagement;

public class DeliveredOrder extends ShippedOrder{
    
    String deliveryDate;
    public DeliveredOrder(String orderID, String orderDate, int trackingNumber, String deliveryDate){
        super(orderID, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public void getOrderStatus(){
        System.out.println("\nStatus -> Delivered");
        System.out.println("Order ID -> " + orderID);
        System.out.println("Order Date -> " + orderDate);
        System.out.println("Tracking number -> " + trackingNumber);
        System.out.println("Delivery Date -> " + deliveryDate);
    }
}
