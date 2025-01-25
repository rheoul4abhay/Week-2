package main.HybridInheitance.RestaurantManagement;

public class Waiter extends Person {

    public Waiter(String name, String id){
        super(name, id);
    }

    public void performDuties(){
        System.out.println("I am a waiter. I serve customers!");
    }
}
