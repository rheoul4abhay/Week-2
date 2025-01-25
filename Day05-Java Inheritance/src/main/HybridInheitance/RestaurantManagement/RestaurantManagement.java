package main.HybridInheitance.RestaurantManagement;

import java.util.ArrayList;

public class RestaurantManagement {
    public static void main(String[] args) {
        ArrayList<Person> roles = new ArrayList<>();
        roles.add(new Person(null, null));
        roles.add(new Chef("Vikhas", "12@12"));
        roles.add(new Waiter("Karan", "13#13"));

        for(Person role : roles){
            role.performDuties();
        }
    }
}
