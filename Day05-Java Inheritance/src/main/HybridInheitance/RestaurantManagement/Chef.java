package main.HybridInheitance.RestaurantManagement;

public class Chef extends Person {

    public Chef(String name, String id){
        super(name, id);
    }

    public void performDuties(){
        System.out.println("I am a chef. I cook dishes!");
    }
}
