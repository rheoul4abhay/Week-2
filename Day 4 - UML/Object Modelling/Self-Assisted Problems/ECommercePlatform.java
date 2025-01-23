import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.showProducts();
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop");
        Product phone = new Product("Phone");

        Order order = new Order();
        order.addProduct(laptop);
        order.addProduct(phone);

        Customer customer = new Customer("Alice");
        customer.placeOrder(order);
    }
}
